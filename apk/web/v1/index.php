<?php

# method, path & body do req
  $opt = $_SERVER['REQUEST_METHOD'];
  $req = explode('/', trim($_SERVER['PATH_INFO'],'/'));
  $inp = json_decode(file_get_contents('php://input'),true);

# conexão com o banco
  $lnk = mysqli_connect('localhost', 'root', '', 'votocerto');
  mysqli_set_charset($lnk,'utf8');

# tabela & chave do req
  $tbl = preg_replace('/[^a-z0-9_]+/i','',array_shift($req));
  $key = array_shift($req)+0;

# coluna & valores do inp
  $col = preg_replace('/[^a-z0-9_]+/i','',array_keys($inp));
  $val = array_map(function ($val) use ($lnk) {
    if ($val===null) return null;
    return mysqli_real_escape_string($lnk,(string)$value);
  },array_values($inp));

# mágica para a construição de um SET em SQL
  $set = '';
  for ($i=0;$i<count($col);$i++) {
    $set.=($i>0?',':'').'`'.$col[$i].'`=';
    $set.=($val[$i]===null?'NULL':'"'.$val[$i].'"');
  }

# criando um SQL baseado no método HTTP
  switch ($opt) {
    case 'GET':
      $sql = "select * from `$table`".($key?" WHERE id=$key":''); break;
    case 'PUT':
      $sql = "update `$table` set $set where id=$key"; break;
    case 'POST':
      $sql = "insert into `$table` set $set"; break;
    case 'DELETE':
      $sql = "delete `$table` where id=$key"; break;
  }

# roda a instrução SQL
  $op = mysqli_query($lnk,$sql);

# morre se o SQL falhar
  if (!$op) {
    http_response_code(404);
    die(mysqli_error());
  }

# http://127.0.0.1/web/{$table}/{$id}
# retorno, inserir id ou a contagem de linhas é afetada.
  if ($opt == 'GET') {
    if (!$key) echo '[';
    for ($i=0;$i<mysqli_num_rows($op);$i++) {
      echo ($i>0?',':'').json_encode(mysqli_fetch_object($op));
    }
    if (!$key) echo ']';
  } elseif ($method == 'POST') {
    echo mysqli_insert_id($lnk);
  } else {
    echo mysqli_affected_rows($lnk);
  }

  mysqli_close($link);

?>

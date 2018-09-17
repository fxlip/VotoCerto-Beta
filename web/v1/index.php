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

  print_r($col)."\n\n";
  print_r($val);

?>

package br.com.felip.votocerto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
// Pop-up de notificaco bottom
import android.widget.Toast;
// Acessa url dentro do app
// import android.net.Uri;
// Embeda um url dentro do app
// import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    //public final static String EXTRA_MESSAGE = "br.com.felip.votocerto.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void helpVote(View view) {
        // Notificacao no bottom
        Toast.makeText(this, R.string.alert1, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, HelpVote.class);
        //Button editText = findViewById(R.id.button2);
        //String message = "Hello World";
        //intent.putExtra(EXTRA_MESSAGE, message);
        //EditText altura = findViewById(R.id.button2);

        // WebView = Mostrar URI dentro do aplicativo;

        startActivity(intent);
    }

    public void checkVote(View view) {
        Intent intent = new Intent(this, CheckVote.class);
        startActivity(intent);
    }

}



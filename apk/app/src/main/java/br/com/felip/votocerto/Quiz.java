package br.com.felip.votocerto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras = getIntent().getExtras();
        Integer numero = extras.getInt("partido");
        Toast.makeText(this, "Partido: "+numero, Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void quiz_edusaude(View view) {
        Intent intent = new Intent(this, quiz_edusaude.class);
        startActivity(intent);
    }

}

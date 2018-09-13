package br.com.felip.votocerto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class CheckVote extends AppCompatActivity {

//    private LinearLayout id1, id2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_vote);
    }

    public void quiz(View view) {
        int numero = 0;

        switch (view.getId()) {
            case R.id.partido12:
                numero = 12;
                break;
            case R.id.partido13:
                numero = 13;
                break;
            case R.id.partido15:
                numero = 15;
                break;
            case R.id.partido16:
                numero = 16;
                break;
            case R.id.partido17:
                numero = 17;
                break;
            case R.id.partido18:
                numero = 18;
                break;
            case R.id.partido19:
                numero = 19;
                break;
            case R.id.partido27:
                numero = 27;
                break;
            case R.id.partido30:
                numero = 30;
                break;
            case R.id.partido45:
                numero = 45;
                break;
            case R.id.partido50:
                numero = 50;
                break;
            case R.id.partido51:
                numero = 51;
                break;
            case R.id.partido54:
                numero = 54;
                break;
        }

        //      int intID = view.getId();
        //       LinearLayout value = (LinearLayout) findViewById(intID);
//        String select = value.toString();
//        String select = value.getText().toString();


        //LinearLayout candidato = View.OnClickListener();
        //String select = candidato;
        //       Toast.makeText(this, select, LENGTH_SHORT).show();
        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("partido", numero);
        startActivity(intent);
    }
}
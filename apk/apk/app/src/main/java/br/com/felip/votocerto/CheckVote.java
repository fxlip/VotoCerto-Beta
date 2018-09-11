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

  //      int intID = view.getId();
 //       LinearLayout value = (LinearLayout) findViewById(intID);
//        String select = value.toString();
//        String select = value.getText().toString();


        //LinearLayout candidato = View.OnClickListener();
        //String select = candidato;
 //       Toast.makeText(this, select, LENGTH_SHORT).show();
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}

package br.com.felip.votocerto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpVote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_vote);
    }

    public void quiz(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

}

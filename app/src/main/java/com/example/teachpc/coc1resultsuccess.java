package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class coc1resultsuccess extends AppCompatActivity {

    Timer CountDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc1resultsuccess);


        getWindow().setStatusBarColor(ContextCompat.getColor(coc1resultsuccess.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton confirm = findViewById(R.id.confirm);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText(String.valueOf(getIncorrectAnswers));

        QuizActivity quizActivity = new QuizActivity();
        quizActivity.CountDownTimer();

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CountDownTimer.cancel();
                CountDownTimer.purge();
                startActivity(new Intent(coc1resultsuccess.this,Quizzes.class));
                finish();


            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
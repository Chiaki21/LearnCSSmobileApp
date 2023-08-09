package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class about_4 extends YouTubeBaseActivity {

    private TextView textView;

    private ImageView imagebutton;

    public static final String KEY2 = "photo";


    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about4);
        getWindow().setStatusBarColor(ContextCompat.getColor(about_4.this,R.color.gray));

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        youTubePlayerView = findViewById(R.id.about4computer);

        YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("vvrdgwDnMQA");
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(),
                        "Initialization Failed",
                        Toast.LENGTH_SHORT).show();
            }
        };
        youTubePlayerView.initialize("AIzaSyCdUvZk-EcDDt605Bx1vOdTV8KLxwEEyT4",listener);


        textView = findViewById(R.id.about4sub1);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub2);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub2);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub3);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub3);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub4);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub4);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub5);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub5);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub6);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub1);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub7);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub2);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub8);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub3);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub9);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub4);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.about4sub10);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about_4.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.about4sub5);
                startActivity(intent);
            }
        });
    }
}
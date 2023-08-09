package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class about_17 extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about17);

        getWindow().setStatusBarColor(ContextCompat.getColor(about_17.this,R.color.gray));
    }
}
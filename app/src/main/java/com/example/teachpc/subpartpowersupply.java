package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class subpartpowersupply extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subpartpowersupply);

        getWindow().setStatusBarColor(ContextCompat.getColor(subpartpowersupply.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        mImageView = findViewById(R.id.subpartimage);

        Intent intent = getIntent();

        int inputImage = intent.getIntExtra(part_PSU.KEY2,1);
        mImageView.setImageResource(inputImage);

        int inputImage1 = intent.getIntExtra(part_PSU.KEY2,2);
        mImageView.setImageResource(inputImage1);

        int inputImage2 = intent.getIntExtra(part_PSU.KEY2,3);
        mImageView.setImageResource(inputImage2);

        int inputImage3 = intent.getIntExtra(part_PSU.KEY2,4);
        mImageView.setImageResource(inputImage3);

        int inputImage4 = intent.getIntExtra(part_PSU.KEY2,5);
        mImageView.setImageResource(inputImage4);

        int inputImage5 = intent.getIntExtra(part_PSU.KEY2,6);
        mImageView.setImageResource(inputImage5);

        int inputImage6 = intent.getIntExtra(part_PSU.KEY2,7);
        mImageView.setImageResource(inputImage6);

        int inputImage7 = intent.getIntExtra(part_PSU.KEY2,8);
        mImageView.setImageResource(inputImage7);

        int inputImage8 = intent.getIntExtra(part_PSU.KEY2,9);
        mImageView.setImageResource(inputImage8);


    }
}
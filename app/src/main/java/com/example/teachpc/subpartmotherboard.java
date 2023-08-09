package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class subpartmotherboard extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subpartmotherboard);

        getWindow().setStatusBarColor(ContextCompat.getColor(subpartmotherboard.this,R.color.colorPrimaryDark));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        mImageView = findViewById(R.id.subpartimage);

        Intent intent = getIntent();

        int inputImage = intent.getIntExtra(part_Motherboard.KEY2,1);
        mImageView.setImageResource(inputImage);

        int inputImage1 = intent.getIntExtra(part_Motherboard.KEY2,2);
        mImageView.setImageResource(inputImage1);

        int inputImage2 = intent.getIntExtra(part_Motherboard.KEY2,3);
        mImageView.setImageResource(inputImage2);

        int inputImage3 = intent.getIntExtra(part_Motherboard.KEY2,4);
        mImageView.setImageResource(inputImage3);

        int inputImage4 = intent.getIntExtra(part_Motherboard.KEY2,5);
        mImageView.setImageResource(inputImage4);

        int inputImage5 = intent.getIntExtra(part_Motherboard.KEY2,6);
        mImageView.setImageResource(inputImage5);

        int inputImage6 = intent.getIntExtra(part_Motherboard.KEY2,7);
        mImageView.setImageResource(inputImage6);

        int inputImage7 = intent.getIntExtra(part_Motherboard.KEY2,8);
        mImageView.setImageResource(inputImage7);

        int inputImage8 = intent.getIntExtra(part_Motherboard.KEY2,9);
        mImageView.setImageResource(inputImage8);

        int inputImage9 = intent.getIntExtra(part_Motherboard.KEY2,10);
        mImageView.setImageResource(inputImage9);

        int inputImage10 = intent.getIntExtra(part_Motherboard.KEY2,11);
        mImageView.setImageResource(inputImage10);

        int inputImage11 = intent.getIntExtra(part_Motherboard.KEY2,12);
        mImageView.setImageResource(inputImage11);

        int inputImage12 = intent.getIntExtra(part_Motherboard.KEY2,13);
        mImageView.setImageResource(inputImage12);

        int inputImage13 = intent.getIntExtra(part_Motherboard.KEY2,14);
        mImageView.setImageResource(inputImage13);

        int inputImage14 = intent.getIntExtra(part_Motherboard.KEY2,15);
        mImageView.setImageResource(inputImage14);

        int inputImage15 = intent.getIntExtra(part_Motherboard.KEY2,16);
        mImageView.setImageResource(inputImage15);

        int inputImage16 = intent.getIntExtra(part_Motherboard.KEY2,17);
        mImageView.setImageResource(inputImage16);

        int inputImage17 = intent.getIntExtra(part_Motherboard.KEY2,18);
        mImageView.setImageResource(inputImage17);

        int inputImage18 = intent.getIntExtra(part_Motherboard.KEY2,19);
        mImageView.setImageResource(inputImage18);

        int inputImage19 = intent.getIntExtra(part_Motherboard.KEY2,20);
        mImageView.setImageResource(inputImage19);

        int inputImage20 = intent.getIntExtra(part_Motherboard.KEY2,21);
        mImageView.setImageResource(inputImage20);

        int inputImage21 = intent.getIntExtra(part_Motherboard.KEY2,22);
        mImageView.setImageResource(inputImage21);

        int inputImage22 = intent.getIntExtra(part_Motherboard.KEY2,23);
        mImageView.setImageResource(inputImage22);

        int inputImage23 = intent.getIntExtra(part_Motherboard.KEY2,24);
        mImageView.setImageResource(inputImage23);

        int inputImage24 = intent.getIntExtra(part_Motherboard.KEY2,25);
        mImageView.setImageResource(inputImage24);


    }
}
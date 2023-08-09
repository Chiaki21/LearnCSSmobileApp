package com.example.teachpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class part_Expansioncard extends AppCompatActivity {

    private ImageView imagebutton;
    private TextView textView;

    public static final String KEY2 = "photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_expansioncard);

        getWindow().setStatusBarColor(ContextCompat.getColor(part_Expansioncard.this, R.color.gray));
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }



        {
            textView = findViewById(R.id.cardinterface);
            textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        }

        imagebutton = findViewById(R.id.idexpansioncard);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this, subpartmotherboard.class);
                intent.putExtra(KEY2, R.drawable.expansioncard1);
                startActivity(intent);
            }
        });


        textView = findViewById(R.id.cardmidi);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardmidi);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardmodem);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardmode);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardmpeg);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardmpeg);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardnetwork);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardnetwork);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardsound);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardsound);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardtuner);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardtuner);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardvideocapture);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.cardvideocapture);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.cardvideocard);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(part_Expansioncard.this,subpartmotherboard.class);
                intent.putExtra(KEY2,R.drawable.gpu1);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:
                gotoUrl("https://www.lazada.com.ph/catalog/?q=expansion+card&_keyori=ss&from=input&spm=a2o4l.searchlist.search.go.41265babm8HKKG");
                return true;
            case R.id.item3:
                gotoUrl("https://shopee.ph/search?keyword=expansion%20card");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
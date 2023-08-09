package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class tut_5 extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Replacing Ram (Desktop and Laptop)","Replacing HDD or SSD","Upgrading Graphics Card",
            "Replacing Wireless Card","Upgrading or Replacing CPU","Replacing PSU"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tut5);

        getWindow().setStatusBarColor(ContextCompat.getColor(tut_5.this, R.color.gray));
        getSupportActionBar().setTitle("Replacing Parts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
            listView = findViewById(R.id.listView);

            tut_5.MyAdapter adapter = new tut_5.MyAdapter(this,mTitle);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (position == 0 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_1.class);
                        startActivity(intent);
                    }
                    if (position == 1 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_2.class);
                        startActivity(intent);
                    }
                    if (position == 2 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_3.class);
                        startActivity(intent);
                    }
                    if (position == 3 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_4.class);
                        startActivity(intent);
                    }
                    if (position == 4 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_5.class);
                        startActivity(intent);
                    }
                    if (position == 5 ) {
                        Intent intent = new Intent(getApplicationContext(),replace_6.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String[] rTitle;


        MyAdapter(Context c, String[] title) {
            super(c, R.layout.partsrow,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View partsrow = layoutInflater.inflate(R.layout.partsrow,parent,false);

            TextView myTitle = partsrow.findViewById(R.id.textView1);



            myTitle.setText(rTitle[position]);

            return partsrow;
        }
    }
}
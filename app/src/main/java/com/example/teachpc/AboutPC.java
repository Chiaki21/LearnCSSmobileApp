package com.example.teachpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.teachpc.Utility.NetworkChangeListener;

public class AboutPC extends AppCompatActivity {



    ListView listView;
    String mTitle[] = {"What is Computer?","Use Of Computer","Hardware differences from Software",
            "Types Of Computer","Generations of Computer","Input and Output Devices","What is Inside of CPU Core?"
            ,"I3, I5, I7 Explained","AMD vs Intel","What is Overclocking?","What is Hyperthreading?"
            ,"Laptop and Motherboard Parts","Various Ports and Connectors Chart"
            ,"Binary Numbers","Operating System","Computer Terms with Full Names","Keyboard Shortcuts"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_pc);

        getWindow().setStatusBarColor(ContextCompat.getColor(AboutPC.this,R.color.gray));
        getSupportActionBar().setTitle("AboutPC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));

            listView = findViewById(R.id.listView);

            MyAdapter adapter = new MyAdapter(this,mTitle);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (position == 0 ) {
                        Intent intent = new Intent(getApplicationContext(),about_1.class);
                        startActivity(intent);
                    }
                    if (position == 1 ) {
                        Intent intent = new Intent(getApplicationContext(),about_2.class);
                        startActivity(intent);
                    }
                    if (position == 2 ) {
                        Intent intent = new Intent(getApplicationContext(),about_3.class);
                        startActivity(intent);
                    }
                    if (position == 3 ) {
                        Intent intent = new Intent(getApplicationContext(),about_4.class);
                        startActivity(intent);
                    }
                    if (position == 4 ) {
                        Intent intent = new Intent(getApplicationContext(),about_5.class);
                        startActivity(intent);
                    }
                    if (position == 5 ) {
                        Intent intent = new Intent(getApplicationContext(),about_6.class);
                        startActivity(intent);
                    }
                    if (position == 6 ) {
                        Intent intent = new Intent(getApplicationContext(),about_7.class);
                        startActivity(intent);
                    }
                    if (position == 7 ) {
                        Intent intent = new Intent(getApplicationContext(),about_8.class);
                        startActivity(intent);
                    }
                    if (position == 8 ) {
                        Intent intent = new Intent(getApplicationContext(),about_9.class);
                        startActivity(intent);
                    }
                    if (position == 9 ) {
                        Intent intent = new Intent(getApplicationContext(),about_10.class);
                        startActivity(intent);
                    }
                    if (position == 10 ) {
                        Intent intent = new Intent(getApplicationContext(),about_11.class);
                        startActivity(intent);
                    }
                    if (position == 11 ) {
                        Intent intent = new Intent(getApplicationContext(),about_12.class);
                        startActivity(intent);
                    }
                    if (position == 12 ) {
                        Intent intent = new Intent(getApplicationContext(),about_13.class);
                        startActivity(intent);
                    }
                    if (position == 13 ) {
                        Intent intent = new Intent(getApplicationContext(),about_14.class);
                        startActivity(intent);
                    }
                    if (position == 14 ) {
                        Intent intent = new Intent(getApplicationContext(),about_15.class);
                        startActivity(intent);
                    }
                    if (position == 15 ) {
                        Intent intent = new Intent(getApplicationContext(),about_16.class);
                        startActivity(intent);
                    }
                    if (position == 16 ) {
                        Intent intent = new Intent(getApplicationContext(),about_17.class);
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
            super(c, R.layout.row1,R.id.textView1,title);
            this.context = c;
            this.rTitle = title;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row1 = layoutInflater.inflate(R.layout.row1,parent,false);

            TextView myTitle = row1.findViewById(R.id.textView1);



            myTitle.setText(rTitle[position]);

            return row1;
        }
    }

}
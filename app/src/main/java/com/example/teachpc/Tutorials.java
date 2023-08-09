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
import android.widget.ListView;
import android.widget.TextView;

import com.example.teachpc.Utility.NetworkChangeListener;

public class Tutorials extends AppCompatActivity {

    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    ListView listView;
    String mTitle[] = {"Computer Assembly Tools Required (Must Read)","Safety Precautions for Computer Repair and Cleaning (Must Read)"
            ,"How to Assemble a PC","Replacing/Upgrading Parts","How to Format a PC","How to Install Windows","Essential of Windows","How to Solve a Computer or Laptop Overheating","Check Laptop Battery with a Multimeter"
            ,"Entering Safe Mode"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        getWindow().setStatusBarColor(ContextCompat.getColor(Tutorials.this,R.color.gray));
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));

            listView = findViewById(R.id.listView);

            Tutorials.MyAdapter adapter = new Tutorials.MyAdapter(this,mTitle);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (position == 0 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_1.class);
                        startActivity(intent);
                    }
                    if (position == 1 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_2.class);
                        startActivity(intent);
                    }
                    if (position == 2 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_3.class);
                        startActivity(intent);
                    }
                    if (position == 3 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_5.class);
                        startActivity(intent);
                    }
                    if (position == 4 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_4.class);
                        startActivity(intent);
                    }
                    if (position == 5 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_6.class);
                        startActivity(intent);
                    }
                    if (position == 6 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_7.class);
                        startActivity(intent);
                    }
                    if (position == 7 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_11.class);
                        startActivity(intent);
                    }
                    if (position == 8 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_10.class);
                        startActivity(intent);
                    }
                    if (position == 9 ) {
                        Intent intent = new Intent(getApplicationContext(),tut_9.class);
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
            View row2 = layoutInflater.inflate(R.layout.row2,parent,false);

            TextView myTitle = row2.findViewById(R.id.textView1);

            myTitle.setText(rTitle[position]);

            return row2;
        }
    }
    @Override
    protected void onStart(){
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener, filter);
        super.onStart();
    }

    @Override
    protected void onStop(){
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }
}
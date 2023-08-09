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

public class coc3confirm extends AppCompatActivity {

    private TextView coc3dec;

    SharedPreferences sharedPreferencescoc3;
    private static final String coc3pref = "coc3pref";
    private static final String coc3success = "coc3success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc3confirm);

        getWindow().setStatusBarColor(ContextCompat.getColor(coc3confirm.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton passdata = findViewById(R.id.passdata);

        coc3dec = findViewById(R.id.coc3dec);

        sharedPreferencescoc3 = getSharedPreferences(coc3pref,MODE_PRIVATE);

        String coc3pass = sharedPreferencescoc3.getString(coc3success,null);

        if (coc3pass != null){
            Intent intent = new Intent(coc3confirm.this,coc3cert.class);
            startActivity(intent);
        }

        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferencescoc3.edit();
                coc3dec.setText(" ");
                editor.putString(coc3success,coc3dec.getText().toString());
                editor.apply();
                Intent intent = new Intent(coc3confirm.this,coc3cert.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}
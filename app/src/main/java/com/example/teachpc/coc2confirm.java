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

public class coc2confirm extends AppCompatActivity {

    private TextView coc2dec;

    SharedPreferences sharedPreferencescoc2;
    private static final String coc2pref = "coc2pref";
    private static final String coc2success = "coc2success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc2confirm);

        getWindow().setStatusBarColor(ContextCompat.getColor(coc2confirm.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton passdata = findViewById(R.id.passdata);

        coc2dec = findViewById(R.id.coc2dec);

        sharedPreferencescoc2 = getSharedPreferences(coc2pref,MODE_PRIVATE);

        String coc2pass = sharedPreferencescoc2.getString(coc2success,null);

        if (coc2pass != null){
            Intent intent = new Intent(coc2confirm.this,coc2cert.class);
            startActivity(intent);
        }

        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferencescoc2.edit();
                coc2dec.setText(" ");
                editor.putString(coc2success,coc2dec.getText().toString());
                editor.apply();
                Intent intent = new Intent(coc2confirm.this,coc2cert.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}
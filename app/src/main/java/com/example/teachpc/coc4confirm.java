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

public class coc4confirm extends AppCompatActivity {

    private TextView coc4dec;

    SharedPreferences sharedPreferencescoc4;
    private static final String coc4pref = "coc4pref";
    private static final String coc4success = "coc4success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coc4confirm);

        getWindow().setStatusBarColor(ContextCompat.getColor(coc4confirm.this,R.color.colorPrimaryDark));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        }

        final AppCompatButton passdata = findViewById(R.id.passdata);

        coc4dec = findViewById(R.id.coc4dec);
        sharedPreferencescoc4 = getSharedPreferences(coc4pref,MODE_PRIVATE);
        String coc4pass = sharedPreferencescoc4.getString(coc4success,null);
        if (coc4pass != null){
            Intent intent = new Intent(coc4confirm.this,coc4cert.class);
            startActivity(intent);
        }

        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferencescoc4.edit();
                coc4dec.setText(" ");
                editor.putString(coc4success,coc4dec.getText().toString());
                editor.apply();
                Intent intent = new Intent(coc4confirm.this,coc4cert.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}
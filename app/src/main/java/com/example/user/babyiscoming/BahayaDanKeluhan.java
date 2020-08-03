package com.example.user.babyiscoming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by user on 24/07/2018.
 */

public class BahayaDanKeluhan extends AppCompatActivity {

    ImageButton btnbahaya;
    ImageButton btnkeluhan;
    Button btnback;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahayadankeluhan);

        btnbahaya = (ImageButton) findViewById(R.id.btnbahaya);
        btnkeluhan = (ImageButton) findViewById(R.id.btnkeluhan);
        btnback = (Button) findViewById(R.id.btnback);

        btnbahaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Bahaya.class);
                startActivity(a);
                finish();
            }
        });

        btnkeluhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Keluhan.class);
                startActivity(a);
                finish();
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void onBackPressed() {
        Intent a = new Intent(getApplicationContext(), Home.class);
        startActivity(a);
        finish();
    }
}

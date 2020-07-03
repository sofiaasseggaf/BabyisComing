package com.example.user.babyiscoming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by user on 24/07/2018.
 */

public class BahayaDanKeluhan extends AppCompatActivity {

    ImageButton btnbahaya;
    ImageButton btnkeluhan;
    Button btnback;

    Integer tgl3, bln3, thn3;
    String nm;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahayadankeluhan);

        nm = getIntent().getStringExtra("nm");
        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);

        btnbahaya = (ImageButton) findViewById(R.id.btnbahaya);
        btnkeluhan = (ImageButton) findViewById(R.id.btnkeluhan);
        btnback = (Button) findViewById(R.id.btnback);

        btnbahaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Bahaya.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });

        btnkeluhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Keluhan.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
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
        Intent a = new Intent(getApplicationContext(), MenuUtama.class);
        a.putExtra("nm", nm);
        a.putExtra("tgl3", tgl3);
        a.putExtra("bln3", bln3);
        a.putExtra("thn3", thn3);
        startActivity(a);
        finish();
    }
}

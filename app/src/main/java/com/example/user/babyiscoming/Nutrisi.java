package com.example.user.babyiscoming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by user on 03/08/2018.
 */

public class Nutrisi extends AppCompatActivity {

    ImageButton btnmakanan, btnminuman, btnbuah;
    Button btnback;

    Integer tgl3, bln3, thn3;
    String nm;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi);

        nm = getIntent().getStringExtra("nm");
        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);

        btnmakanan = (ImageButton) findViewById(R.id.btnmakanan);
        btnminuman = (ImageButton) findViewById(R.id.btnminuman);
        btnbuah = (ImageButton) findViewById(R.id.btnbuah);
        btnback = (Button) findViewById(R.id.btnback);

        btnmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnmakanan.isClickable()) {
                    Intent a = new Intent(getApplicationContext(), Makanan.class);
                    a.putExtra("nm", nm);
                    a.putExtra("tgl3", tgl3);
                    a.putExtra("bln3", bln3);
                    a.putExtra("thn3", thn3);
                    startActivity(a);
                }
            }
        });

        btnminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnminuman.isClickable()) {
                    Intent a = new Intent(getApplicationContext(), Minuman.class);
                    a.putExtra("nm", nm);
                    a.putExtra("tgl3", tgl3);
                    a.putExtra("bln3", bln3);
                    a.putExtra("thn3", thn3);
                    startActivity(a);
                }
            }
        });

        btnbuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnbuah.isClickable()){
                    Intent a = new Intent(getApplicationContext(), BuahBuahan.class);
                    a.putExtra("nm", nm);
                    a.putExtra("tgl3", tgl3);
                    a.putExtra("bln3", bln3);
                    a.putExtra("thn3", thn3);
                    startActivity(a);
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
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

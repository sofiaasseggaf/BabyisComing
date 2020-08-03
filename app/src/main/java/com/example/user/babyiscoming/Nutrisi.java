package com.example.user.babyiscoming;

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

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi);

        btnmakanan = (ImageButton) findViewById(R.id.btnmakanan);
        btnminuman = (ImageButton) findViewById(R.id.btnminuman);
        btnbuah = (ImageButton) findViewById(R.id.btnbuah);
        btnback = (Button) findViewById(R.id.btnback);

        btnmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnmakanan.isClickable()) {
                    Intent a = new Intent(getApplicationContext(), Makanan.class);
                    startActivity(a);
                    finish();
                }
            }
        });

        btnminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnminuman.isClickable()) {
                    Intent a = new Intent(getApplicationContext(), Minuman.class);
                    startActivity(a);
                    finish();
                }
            }
        });

        btnbuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnbuah.isClickable()){
                    Intent a = new Intent(getApplicationContext(), BuahBuahan.class);
                    startActivity(a);
                    finish();
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
        Intent a = new Intent(getApplicationContext(), Home.class);
        startActivity(a);
        finish();
    }
}

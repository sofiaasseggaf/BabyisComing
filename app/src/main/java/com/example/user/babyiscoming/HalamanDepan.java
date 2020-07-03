package com.example.user.babyiscoming;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HalamanDepan extends AppCompatActivity {
    Button menuinput;
    Button btnstart;

    Integer tgl3, bln3, thn3;
    String nm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_depan);

        nm = getIntent().getStringExtra("nm");
        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);

        menuinput = (Button) findViewById(R.id.menuinput);
        btnstart = (Button) findViewById(R.id.btnstart);

        menuinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), input.class);
                startActivity(a);
            }
        });

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), MenuUtama.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });
    }

    public void onBackPressed() {
        finish();
        System.exit(0);
    }
}
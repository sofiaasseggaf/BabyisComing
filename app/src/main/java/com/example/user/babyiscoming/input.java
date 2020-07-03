package com.example.user.babyiscoming;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 14/07/2018.
 */

public class input extends AppCompatActivity {

    Button btninput;
    Button btnback;
    EditText tanggal;
    EditText bulan;
    EditText tahun;
    EditText nama;
    String nm, tgl, bln, thn;
    Integer tgl2, bln2, thn2;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        btninput = (Button) findViewById(R.id.btninput);
        btnback = (Button) findViewById(R.id.btnback);
        tanggal = (EditText) findViewById(R.id.tanggal);
        bulan = (EditText) findViewById(R.id.bulan);
        tahun = (EditText) findViewById(R.id.tahun);
        nama = (EditText) findViewById(R.id.nama);

        nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama.getText().clear();
            }
        });

        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tanggal.getText().clear();
            }
        });

        bulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulan.getText().clear();
            }
        });

        tahun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tahun.getText().clear();
            }
        });

        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btninput.isClickable()) {

                    nm = nama.getText().toString();

                    tgl = tanggal.getText().toString();
                    tgl2 = new Integer(tgl).intValue();

                    bln = bulan.getText().toString();
                    bln2 = new Integer(bln).intValue();

                    thn = tahun.getText().toString();
                    thn2 = new Integer(thn).intValue();
                }
                Intent a = new Intent(getApplicationContext(), MenuUtama.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl2", tgl2);
                a.putExtra("bln2", bln2);
                a.putExtra("thn2", thn2);
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
        Intent a = new Intent(getApplicationContext(), HalamanDepan.class);
        startActivity(a);
        finish();
    }

}

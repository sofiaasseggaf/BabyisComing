package com.example.user.babyiscoming;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.user.babyiscoming.utility.PreferenceUtils;

public class HalamanDepan extends AppCompatActivity {

    Button btn_input_data;
    Button btnstart;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_depan);

        btn_input_data = findViewById(R.id.btn_input_data);
        btnstart = findViewById(R.id.btnstart);

        if (PreferenceUtils.getNama(this) == null || PreferenceUtils.getNama(this).equalsIgnoreCase("")) {

            btn_input_data.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a = new Intent(HalamanDepan.this, InputData.class);
                    startActivity(a);
                    finish();
                }
            });

            btnstart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HalamanDepan.this, "Input Your Data First !", Toast.LENGTH_SHORT).show();
                }
            });

        } else {
            Intent a = new Intent(HalamanDepan.this, Home.class);
            startActivity(a);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Anda Mau Menutup Aplikasi")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        HalamanDepan.super.onBackPressed();
                        finish();
                        finishAffinity();
                    }
                })

                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }
}
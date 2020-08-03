package com.example.user.babyiscoming;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.babyiscoming.utility.PreferenceUtils;

/**
 * Created by user on 14/07/2018.
 */

public class InputData extends AppCompatActivity {

    Button btninput;
    EditText nama, tanggal, bulan, tahun;
    String inputNama;
    Integer inputTanggal, inputBulan, inputTahun;
    Integer lahirTanggal, lahirBulan, lahirTahun;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nama = findViewById(R.id.nama);
        tanggal = findViewById(R.id.tanggal);
        bulan = findViewById(R.id.bulan);
        tahun = findViewById(R.id.tahun);
        btninput = findViewById(R.id.btninput);

        inputNama = nama.getText().toString();
        inputTanggal = Integer.parseInt(tanggal.getText().toString());
        inputBulan = Integer.parseInt(bulan.getText().toString());
        inputTahun = Integer.parseInt(tahun.getText().toString());

        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btninput.isClickable()) {

                    if (inputBulan<4 && inputBulan>0){
                        lahirTanggal = inputTanggal+7;
                        lahirBulan = inputBulan+9;
                        lahirTahun = inputTahun;
                    } else if (inputBulan<13 && inputBulan>0) {
                        lahirTanggal = inputTanggal+7;
                        lahirBulan = inputBulan-3;
                        lahirTahun = inputTahun+1;
                    }

                    PreferenceUtils.saveNama(inputNama, getApplicationContext());
                    PreferenceUtils.saveTanggal(String.valueOf(inputTanggal), getApplicationContext());
                    PreferenceUtils.saveBulan(String.valueOf(inputBulan), getApplicationContext());
                    PreferenceUtils.saveTahun(String.valueOf(inputTahun), getApplicationContext());

                }

                Intent a = new Intent(InputData.this, Home.class);
                startActivity(a);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Batal Input Data ?")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent a = new Intent(InputData.this, HalamanDepan.class);
                        startActivity(a);
                        finish();
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

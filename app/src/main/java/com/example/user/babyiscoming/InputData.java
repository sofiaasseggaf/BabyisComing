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
import android.widget.Toast;

import com.example.user.babyiscoming.utility.PreferenceUtils;

/**
 * Created by user on 14/07/2018.
 */

public class InputData extends AppCompatActivity {

    Button btninput;
    EditText nama, tanggal, bulan, tahun;
    String inputNama, namaLahirBulan;
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

        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!nama.getText().toString().equalsIgnoreCase("") && !tanggal.getText().toString().equalsIgnoreCase("") &&
                        !bulan.getText().toString().equalsIgnoreCase("") && !tahun.getText().toString().equalsIgnoreCase("")) {

                    inputNama = nama.getText().toString();
                    inputTanggal = Integer.parseInt(tanggal.getText().toString());
                    inputBulan = Integer.parseInt(bulan.getText().toString());
                    inputTahun = Integer.parseInt(tahun.getText().toString());

                    if (inputBulan<4 && inputBulan>0){
                        lahirTanggal = inputTanggal+7;
                        lahirBulan = inputBulan+9;
                        lahirTahun = inputTahun;
                    } else if (inputBulan<13 && inputBulan>0) {
                        lahirTanggal = inputTanggal+7;
                        lahirBulan = inputBulan-3;
                        lahirTahun = inputTahun+1;
                    }

                    convertBulan();

                    Intent a = new Intent(InputData.this, Home.class);
                    PreferenceUtils.saveNama(inputNama, getApplicationContext());
                    PreferenceUtils.saveTanggal(String.valueOf(lahirTanggal), getApplicationContext());
                    PreferenceUtils.saveBulan(namaLahirBulan, getApplicationContext());
                    PreferenceUtils.saveTahun(String.valueOf(lahirTahun), getApplicationContext());
                    startActivity(a);
                    finish();

                } else {
                    Toast.makeText(InputData.this, "lengkapi data !", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    public void convertBulan(){

        if (lahirBulan==1){
            namaLahirBulan = "Januari";
        } else if (lahirBulan == 2){
            namaLahirBulan = "Februari";
        } else if (lahirBulan == 2){
            namaLahirBulan = "Februari";
        } else if (lahirBulan == 3){
            namaLahirBulan = "Maret";
        } else if (lahirBulan == 4){
            namaLahirBulan = "April";
        } else if (lahirBulan == 5){
            namaLahirBulan = "Mei";
        } else if (lahirBulan == 6){
            namaLahirBulan = "Juni";
        } else if (lahirBulan == 7){
            namaLahirBulan = "Juli";
        } else if (lahirBulan == 8){
            namaLahirBulan = "Agustus";
        } else if (lahirBulan == 9){
            namaLahirBulan = "September";
        } else if (lahirBulan == 10){
            namaLahirBulan = "Oktober";
        } else if (lahirBulan == 11){
            namaLahirBulan = "November";
        } else if (lahirBulan == 12){
            namaLahirBulan = "Desember";
        } else {
            namaLahirBulan = " - ";
        }
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

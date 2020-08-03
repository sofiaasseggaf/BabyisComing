package com.example.user.babyiscoming;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.babyiscoming.utility.PreferenceUtils;

/**
 * Created by user on 20/07/2018.
 */

public class Home extends AppCompatActivity {

    Button btnperkembanganjanin, btnberatbadan, btnnutrisi, btnbahayadankeluhan, btn_logout;
    TextView nama, prediksi;

    @SuppressLint("ResourceType")
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        nama = findViewById(R.id.nama);
        prediksi = findViewById(R.id.prediksi);
        btnperkembanganjanin = findViewById(R.id.btnperkembanganjanin);
        btnberatbadan = findViewById(R.id.btnberatbadan);
        btnnutrisi = findViewById(R.id.btnnutrisi);
        btnbahayadankeluhan = findViewById(R.id.btnbahayadankeuluhan);
        btn_logout = findViewById(R.id.btn_logout);

        nama.setText("HALO " + PreferenceUtils.getNama(getApplicationContext()));
        prediksi.setText(PreferenceUtils.getTanggal(getApplicationContext()) + " " +
                PreferenceUtils.getBulan(getApplicationContext()) + " " +
                PreferenceUtils.getTahun(getApplicationContext()));

        btnperkembanganjanin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), PerkembanganJanin.class);
                startActivity(a);
                finish();
            }
        });

        btnberatbadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), BeratBadan.class);
                startActivity(a);
                finish();
            }
        });

        btnnutrisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Nutrisi.class);
                startActivity(a);
                finish();
            }
        });

        btnbahayadankeluhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), BahayaDanKeluhan.class);
                startActivity(a);
                finish();
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    public void logout(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Yakin Log Out ?")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        eraseData();
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

    public void eraseData(){

        PreferenceUtils.saveNama(null, getApplicationContext());
        PreferenceUtils.saveTanggal("", getApplicationContext());
        PreferenceUtils.saveBulan("", getApplicationContext());
        PreferenceUtils.saveTahun("", getApplicationContext());

        Intent a = new Intent(Home.this, HalamanDepan.class);
        startActivity(a);
        finish();
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
                        Home.super.onBackPressed();
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

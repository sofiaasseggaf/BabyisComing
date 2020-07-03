package com.example.user.babyiscoming;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
/**
 * Created by user on 20/07/2018.
 */

public class MenuUtama extends AppCompatActivity {

    Button btnperkembanganjanin, btnberatbadan, btnnutrisi, btnbahayadankeluhan;
    TextView prediksi;
    TextView nama;
    Integer tgl2,bln2,thn2, tgl3, bln3, thn3;
    String nm;

    @SuppressLint("ResourceType")
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);

        nama = (TextView) findViewById(R.id.nama);
        prediksi = (TextView) findViewById(R.id.prediksi);
        btnperkembanganjanin = (Button) findViewById(R.id.btnperkembanganjanin);
        btnberatbadan = (Button) findViewById(R.id.btnberatbadan);
        btnnutrisi = (Button) findViewById(R.id.btnnutrisi);
        btnbahayadankeluhan = (Button) findViewById(R.id.btnbahayadankeuluhan);

        nm = getIntent().getStringExtra("nm");
        tgl2 = getIntent().getIntExtra("tgl2", 0);
        bln2 = getIntent().getIntExtra("bln2", 0);
        thn2 = getIntent().getIntExtra("thn2", 0);

        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);


        if (bln2<4 && bln2>0){
            tgl3 = tgl2+7;
            bln3 = bln2+9;
            thn3 = thn2;
        } else if(bln2<13 && bln2>0) {
            tgl3 = tgl2+7;
            bln3 = bln2-3;
            thn3 = thn2+1;
        } else {
            prediksi.setText("   ");
        }

        nama.setText("HALO " +nm +" !");
        prediksi.setText("Tanggal " +tgl3 +"  Bulan " +bln3 +"  Tahun " +thn3);

        btnperkembanganjanin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), PerkembanganJanin.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });

        btnberatbadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), BeratBadan.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });

        btnnutrisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Nutrisi.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });

        btnbahayadankeluhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), BahayaDanKeluhan.class);
                a.putExtra("nm", nm);
                a.putExtra("tgl3", tgl3);
                a.putExtra("bln3", bln3);
                a.putExtra("thn3", thn3);
                startActivity(a);
            }
        });
    }

    public void onBackPressed() {
        Intent a = new Intent(getApplicationContext(), HalamanDepan.class);
        a.putExtra("nm", nm);
        a.putExtra("tgl3", tgl3);
        a.putExtra("bln3", bln3);
        a.putExtra("thn3", thn3);
        startActivity(a);
        finish();
    }
}

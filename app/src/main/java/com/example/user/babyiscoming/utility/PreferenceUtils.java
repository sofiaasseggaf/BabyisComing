package com.example.user.babyiscoming.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class PreferenceUtils extends AppCompatActivity {


    public PreferenceUtils() {
    }

    public static boolean saveNama(String nama, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(Constants.KEY_NAMA, nama);
        prefsEditor.apply();
        return true;
    }

    public static String getNama(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(Constants.KEY_NAMA, null);
    }

    public static boolean saveTanggal(String tanggal, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(Constants.KEY_TANGGAL, tanggal);
        prefsEditor.apply();
        return true;
    }

    public static String getTanggal(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(Constants.KEY_TANGGAL, null);
    }

    public static boolean saveBulan(String bulan, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(Constants.KEY_BULAN, bulan);
        prefsEditor.apply();
        return true;
    }

    public static String getBulan(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(Constants.KEY_BULAN, null);
    }

    public static boolean saveTahun(String tahun, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(Constants.KEY_TAHUN, tahun);
        prefsEditor.apply();
        return true;
    }

    public static String getTahun(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(Constants.KEY_TAHUN, null);
    }

}

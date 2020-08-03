package com.example.user.babyiscoming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 24/07/2018.
 */

public class Bahaya extends AppCompatActivity {

    WebView WVma, WVma2, WVma3, WVma4, WVma5, WVma6, WVma7, WVma8 ;
    String text, text2, text3, text4, text5, text6, text7, text8 ;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahaya);

        WVma = (WebView) findViewById(R.id.WVma);
        WVma2 = (WebView) findViewById(R.id.WVma2);
        WVma3 = (WebView) findViewById(R.id.WVma3);
        WVma4 = (WebView) findViewById(R.id.WVma4);
        WVma5 = (WebView) findViewById(R.id.WVma5);
        WVma6 = (WebView) findViewById(R.id.WVma6);
        WVma7 = (WebView) findViewById(R.id.WVma7);
        WVma8 = (WebView) findViewById(R.id.WVma8);

        text = "Perdarahan adalah tanda bahaya kehamilan paling utama yang harus Anda perhatikan. Biasanya ini bisa terjadi pada usia kehamilan trimester pertama. Bila hanya keluar sedikit, perdarahan masih bisa dianggap normal. Namun, bila jumlahnya banyak, sering terjadi, dan warnanya terlihat merah segar, Anda harus segera menghubungi dokter. Biasanya perdarahan berbahaya akan dibarengi dengan rasa nyeri hebat di bagian rahim.";
        text2 = "Bengkak di bagian kaki sudah normal terjadi pada ibu yang sedang mengandung. Namun, bengkak di bagian wajah dan tangan saat hamil bukanlah sesuatu yang normal. Ini bisa menjadi salah satu tanda bahaya kehamilan yang harus Anda waspadai.\n" +
                "\n" +
                "Jika bengkak di area wajah dan tangan tak hilang juga meski sudah beristirahat dengan cukup, sebaiknya segera periksakan diri Anda ke dokter. Umumnya gejala bengkak di area wajah dan tangan ini akan disertai dengan beberapa gejala fisik lainnya.";
        text3 = "Calon orangtua pasti menunggu-nunggu kapan bayi mereka akan mulai menendang dan bergerak dalam kandungan. Umumnya, kebahagiaan para orangtua ini akan dialami saat janin berusia 5 bulan ke atas.\n" +
                "\n" +
                "Janin dalam kandungan akan mulai aktif bergerak sejak usia kehamilan 5 hingga 6 bulan. Namun, jika di bulan ke-5 atau ke-6 kehamilan Anda tidak merasakan pergerakan apa-apa dari dalam rahim Anda, dikhawatirkan Anda mengalami kehamilan patologik.\n" +
                "\n" +
                "Segera periksa ke dokter kandungan. Ingat-ingat kapan saja biasanya bayi aktif bergerak dan tidak. Biasanya, gejala yang menimbulkan tanda bahaya kehamilan akan terjadi terus-terusan. Maka itu, konsultasikan pada dokter untuk mengetahui apa yang terjadi pada kehamilan Anda. ";
        text4 = "Jika ibu merasakan adanya air yang keluar dari vagina maka ini bisa menjadi pertanda air ketuban pecah dini. Kondisi ini juga bisa menyebabkan kelahiran prematur, resiko infeksi yang dialami oleh bayi dan juga kematian ibu dan bayi. Ibu hamil biasanya tidak merasakan adanya cairan namun mereka lebih sering merasa buang air kecil yang sangat sering. Untuk memastikan apakah telah terjadi kebocoran air ketuban atau tidak maka biasanya dokter akan melakukan beberapa pemeriksaan.";
        text5 = "Adanya kram dan kontraksi pada kehamilan yang baru berusia 20 minggu bisa menjadi pertanda keguguran yang sering terjadi. Kram bisa disebabkan oleh tekanan yang sangat berat pada bagian rahim, punggung belakang hingga perut bawah. Terkadang juga disertai dengan kontraksi ringan, sedang hingga berat. Kemudian jika sudah terjadi keguguran maka bisa menyebabkan pendarahan yang keluar dari vagina baik itu pendarahan ringan hingga berat. Jika terjadi pada tahap awal dan segera diketahui maka keguguran dapat dicegah dengan obat atau istirahat. Namun jika sudah terlambat maka keguguran bisa menyebabkan kematian pada ibu dan bayi.";
        text6 = "Nyeri perut bagian bawah yang terjadi pada 3 bulan kehamilan pertama bisa menjadi sebuah tanda kehamilan ektopik. Kehamilan ini tidak terjadi pada bagian rahim tapi justru pada saluran tuba ibu hamil. Kehamilan ini tidak akan bisa bertahan selama lebih dari 3 bulan karena akan mendorong terjadinya pendarahan internal pada ibu. Tanda lain dari kehamilan ektopik misalnya seperti mual dan muntah yang lebih parah, sering sakit kepala yang berat atau pingsan. Kehamilan ini sangat berbahaya karena bisa menyebabkan kematian ibu. Tindakan operasi harus dilakukan untuk mengatasi terjadinya komplikasi yang berat.";
        text7 = "Pendarahan pada trimester kedua bisa menyebabkan masalah yang buruk untuk ibu dan janin. Pendarahan ini bisa menjadi adanya masalah pada plasenta termasuk plasenta letak rendah. plasenta berfungsi untuk menyampaikan nutrisi dari tubuh ibu ke bayi. Jika ada pendarahan yang disertai rasa sakit pada perut bawah mungkin bisa disebabkan karena letak plasenta yang menutupi leher rahim atau plasenta yang terpisah dari dinding rahim. Biasanya kondisi ini diobati dengan istirahat atau perawatan di rumah sakit untuk mencegah keguguran.";
        text8 = "Jika ibu mengalami kontraksi yang sering pada trimester ketiga, maka ini bisa menjadi pertanda kelahirakan prematur. Biasanya banyak ibu yang meremehkan karena dianggap sebagai kontraksi palsu yang sering terjadi dan wajar. Namun jika gejala ini mendapatkan pemeriksaan lebih awal maka bisa membuat kelahiran prematur bisa dicegah. Kondisi ini sangat rentan untuk bayi karena pertumbuhan organ bayi belum sempurna sehingga bayi bisa meninggal setelah dilahirkan. (baca: penyebab bayi terlilit tali pusar)";

        WVma.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\" >" + text+" </font> </p>", "text/html", "UTF-8");
        WVma.setBackgroundColor(0);

        WVma2.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text2+" </font> </p>", "text/html", "UTF-8");
        WVma2.setBackgroundColor(0);

        WVma3.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text3+" </font> </p>", "text/html", "UTF-8");
        WVma3.setBackgroundColor(0);

        WVma4.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text4+" </font> </p>", "text/html", "UTF-8");
        WVma4.setBackgroundColor(0);

        WVma5.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text5+" </font> </p>", "text/html", "UTF-8");
        WVma5.setBackgroundColor(0);

        WVma6.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text6+" </font> </p>", "text/html", "UTF-8");
        WVma6.setBackgroundColor(0);

        WVma7.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text7+" </font> </p>", "text/html", "UTF-8");
        WVma7.setBackgroundColor(0);

        WVma8.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text8+" </font> </p>", "text/html", "UTF-8");
        WVma8.setBackgroundColor(0);
    }

    public void onBackPressed() {
        Intent a = new Intent(getApplicationContext(), BahayaDanKeluhan.class);
        startActivity(a);
        finish();
    }
}

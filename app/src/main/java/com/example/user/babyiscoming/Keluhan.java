package com.example.user.babyiscoming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 24/07/2018.
 */

public class Keluhan extends AppCompatActivity {

    WebView WVms, WVms2, WVms3, WVms4, WVms5, WVms6, WVms7, WVms8 ;
    String text, text2, text3, text4, text5, text6, text7, text8 ;

    Integer tgl3, bln3, thn3;
    String nm;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluhan);

        nm = getIntent().getStringExtra("nm");
        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);

        WVms = (WebView) findViewById(R.id.WVms);
        WVms2 = (WebView) findViewById(R.id.WVms2);
        WVms3 = (WebView) findViewById(R.id.WVms3);
        WVms4 = (WebView) findViewById(R.id.WVms4);
        WVms5 = (WebView) findViewById(R.id.WVms5);
        WVms6 = (WebView) findViewById(R.id.WVms6);
        WVms7 = (WebView) findViewById(R.id.WVms7);
        WVms8 = (WebView) findViewById(R.id.WVms8);

        text = "Morning Sickness biasanya terjadi di tiga bulan pertama kehamilan. Kondisi ini membuat ibu hamil sering merasa ingin muntah dan mual. Akibatnya, ibu hamil jadi kesulitan untuk makan. Walaupun dinamakan morning sickness, tetapi kondisi ini tidak selamanya terjadi di pagi hari. Morning sickness disebabkan oleh perubahan hormon selama kehamilan. Beberapa faktor yang dapat menyebabkan morning sickness pada ibu hamil adalah : \\n Meningkatnya kadar hormon estrogen, biasanya terjadi saat wanita hamil muda dan dapat menyebabkan mual dan muntah. Meningkatnya kadar hormon human chorionic gonadotrophin (Hcg), yaitu hormon yang mulai diproduksi setelah konsepsi atau pembuahan. Perdarahan dengan nyeri perut pada trimester ketiga dapat menjadi gejala solusio plasenta (plasenta terlepas dari dinding rahim). Masalah pencernaan, progesteron adalah hormon yang membantu menyiapkan dan melindungi uterus selama kehamilan. Karena produksi hormon progesteron meningkat, pergerakan usus kecil, esofagus, dan perut menurun dan menyebabkan mual. Menurunnya pergerakan ini terjadi karena dinding otot rileksasi. Kekurangan zat gizi, seperti kekurangan vitamin B6.";
        text2 = "Di masa kehamilan, ibu hamil biasanya mengalami sembelit, yaitu ketika pergerakan usus mengalami kesulitan untuk mengeluarkan kotoran. Keluhan ini bisa disebabkan oleh perubahan hormon, atau juga dapat disebabkan oleh kurang makanan berserat. Jika sembelit tidak segera diobati, maka dapat menyebabkan berkembangnya wasir alias ambeien, yaitu bengkaknya pembuluh darah di sekitar anus. Ambien adalah permasalahan yang paling sering dikeluhkan para ibu hamil. Supaya ibu hamil tidak mengalami sembelit, ibu hamil sebaiknya makan makanan yang mengandung tinggi serat, seperti sayuran dan buah setiap hari. Banyak minum air, paling sedikit 8 gelas air setiap hari. Melakukan olahraga rutin. Serta menghindari konsumsi suplemen zat besi karena dapat menyebabkan konstipasi. Sebaiknya konsultasikan dengan dokter Anda terlebih dahulu apakah Anda membutuhkan suplemen zat besi  saat kehamilan atau ada cara lain.";
        text3 = "Kram pada kaki yang biasanya terjadi pada malam hari mungkin menjadi keluhan umum pada beberapa ibu hamil selama trimester kedua. Kram mungkin disebabkan oleh beban tambahan yang dibawa ibu saat kehamilan yang membuat otot menjadi tegang. Untuk mencegah terjadinya kram pada ibu hamil, Anda dapat melakukan senam hamil sehingga dapat melancarkan sirkulasi darah dan mencegah kram pada kaki. Anda bisa mencoba salah satu gerakan senam hamil untuk mencegah kram, yaitu menggerakan kaki Anda ke atas dan ke bawah sebanyak 30 kali. Selanjutnya putar kaki Anda 8 kali secara bergantian. Gerakan senam hamil ini mungkin dapat mencegah kram pada kaki Anda jika dilakukan secara rutin.";
        text4 = "Ibu hamil juga sering mengalami pembengkakan yang umumnya terjadi di bagian tangan, kaki, pergelangan kaki, dan jari. Hal ini disebabkan karena tubuh Anda mengandung lebih banyak cairan saat hamil. Saat cuaca panas atau jika Anda terlalu banyak berdiri, cairan tubuh akan lebih banyak berkumpul pada bagian terendah dari tubuh. Bengkak juga dapat menjadi tanda Anda menderita preeklampsia jika diikuti dengan sakit kepala, penglihatan menjadi buram, sakit pada tulang rusuk bagian bawah, dan muntah. Untuk mencegah pembengkakan saat kehamilan, sebaiknya Anda hindari berdiri dalam waktu lama, Gunakan alas kaki yang nyaman dan tidak terlalu ketat, Istirahatkan kaki Anda setidaknya satu jam per hari dengan meletakkan kaki lebih tinggi daripada jantung Anda, Anda bisa mengganjal kaki Anda dengan bantal ketika duduk atau berbaring";
        text5 = "Selama kehamilan, ligamen yang menghubungkan tulang dengan tulang menjadi lebih lunak dan meregang untuk mempersiapkan tubuh melakukan persalinan. Berat yang meningkat karena pertumbuhan bayi dalam kandungan yang bertambah besar membuat beban ini ditempatkan pada sendi punggung dan panggul sehingga menyebabkan sakit punggung. Untuk mencegah sakit punggung saat hamil, ibu hamil sebaiknya:\n" +
                "\n" +
                "Menghindari mengangkat benda berat\n" +
                "Tekuk lutut Anda dan jaga agar tubuh Anda tetap tegak ketika mengambil barang dari bawah atau lantai\n" +
                "Gerakan kaki Anda ketika berbalik untuk menghindari memutarnya tulang belakang\n" +
                "Gunakan alas kaki yang datar seperti flat shoes agar berat badan Anda dibagi secara merata pada kedua kaki\n" +
                "Bekerja pada meja yang cukup tinggi untuk mencegah Anda membungkuk\n" +
                "Seimbangkan berat tas Anda ketika membawa tas atau membawa belanja\n" +
                "Duduklah dengan tegak\n" +
                "Pastikan Anda mempunyai waktu cukup untuk istirahat";
        text6 = "Sakit kepala merupakan salah satu keluhan yang paling umum terjadi pada ibu hamil. Sakit kepala saat hamil seringnya disebabkan oleh hormon. Biasanya terjadi saat Anda hamil muda dan akan berkurang pada 6 bulan terakhir kehamilan. Sakit kepala saat hamil memang tidak akan menyakiti bayi Anda, tetapi membuat Anda tidak nyaman.\n" +
                "\n" +
                "Perubahan pada gaya hidup Anda dapat membantu mencegah sakit kepala. Pastikan Anda selalu mendapatkan istirahat yang cukup serta buatlah pikiran Anda lebih tenang dan rileks.\n" +
                "\n" +
                "Cobalah lakukan hal-hal yang menyenangkan yang membuat Anda merasa lebih nyaman. Jika sakit kepala menyerang, sebaiknya Anda istirahat dan jika ingin mengonsumsi obat-obatan untuk menghilangkan sakit kepala, seperti paracetamol dan ibuprofen. Sebelum mengonsumsi obat-obatan tersebut, sebaiknya konsultasikan terlebih dahulu dengan dokter Anda.";
        text7 = "Sering buang air kecil biasanya terjadi saat Anda hamil muda, yaitu sekitar usia 12-14 minggu pertama kehamilan. Setelah itu, biasanya frekuensi buang air kecil ibu hamil akan kembali normal.\n" +
                "\n" +
                "Selanjutnya, pada akhir masa kehamilan, frekuensi buang air kecil yang lebih sering dapat dialami lagi oleh ibu hamil. Hal ini disebabkan oleh kepala bayi yang menekan kandung kemih Anda.\n" +
                "\n" +
                "Namun, bukan berarti ibu hamil harus mengurangi asupan cairan untuk mencegah hal ini terjadi. Pasalnya, Anda dan bayi Anda tetap membutuhkan banyak cairan. Jadi, yang dapat Anda lakukan adalah menghindari minuman yang mengandung alkohol dan kafein.\n" +
                "\n" +
                "Jika terdapat darah pada urin Anda, mungkin Anda mengalami infeksi saluran kencing. Sebaiknya minum banyak cairan untuk mencairkan urin Anda dan untuk menghilangkan rasa sakit dan segera periksakan ke dokter.";
        text8 = "Keputihan dapat terjadi selama kehamilan dan hampir semua ibu hamil mengalami hal ini. Keputihan meningkat pada saat kehamilan karena untuk melindungi vagina dan rahim dari infeksi. Selama kehamilan, serviks atau leher rahim dan dinding vagina menjadi lebih lembut.\n" +
                "\n" +
                "Menjelang akhir dari kehamilan, jumlah keputihan terus meningkat dan bertekstur lebih tebal dan mungkin terdapat bercak darah. Ini merupakan tanda bahwa tubuh sudah mulai mempersiapkan kelahiran dari bayi Anda.\n" +
                "\n" +
                "Namun, untuk mengantisipasi terjadinya suatu hal yang tidak diinginkan, sebaiknya beri tahu dokter Anda jika terjadi perubahan yang tidak biasa dari keputihan Anda, seperti perubahan warna dan bau, atau Anda mengalami nyeri di sekitar vagina.";

        WVms.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\" >" + text+" </font> </p>", "text/html", "UTF-8");
        WVms.setBackgroundColor(0);

        WVms2.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text2+" </font> </p>", "text/html", "UTF-8");
        WVms2.setBackgroundColor(0);

        WVms3.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text3+" </font> </p>", "text/html", "UTF-8");
        WVms3.setBackgroundColor(0);

        WVms4.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text4+" </font> </p>", "text/html", "UTF-8");
        WVms4.setBackgroundColor(0);

        WVms5.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text5+" </font> </p>", "text/html", "UTF-8");
        WVms5.setBackgroundColor(0);

        WVms6.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text6+" </font> </p>", "text/html", "UTF-8");
        WVms6.setBackgroundColor(0);

        WVms7.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text7+" </font> </p>", "text/html", "UTF-8");
        WVms7.setBackgroundColor(0);

        WVms8.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text8+" </font> </p>", "text/html", "UTF-8");
        WVms8.setBackgroundColor(0);

    }

    public void onBackPressed() {
        Intent a = new Intent(getApplicationContext(), BahayaDanKeluhan.class);
        a.putExtra("nm", nm);
        a.putExtra("tgl3", tgl3);
        a.putExtra("bln3", bln3);
        a.putExtra("thn3", thn3);
        startActivity(a);
        finish();
    }
}

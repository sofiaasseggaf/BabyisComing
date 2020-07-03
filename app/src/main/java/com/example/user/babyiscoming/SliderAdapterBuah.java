package com.example.user.babyiscoming;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by user on 29/07/2018.
 */

public class SliderAdapterBuah extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapterBuah (Context context){
        this.context = context;
    }

    //ARRAY
    public int[] slide_images_buah = {
            R.drawable.buah1,
            R.drawable.buah2,
            R.drawable.buah3,
            R.drawable.buah4,
            R.drawable.buah5,
            R.drawable.buah6,
            R.drawable.buah7,
            R.drawable.buah8,
            R.drawable.buah9
    };

    //ARRAY
    public String[] slide_heading_buah = {
            "KURMA",
            "ALPUKAT",
            "JERUK",
            "MANGGA",
            "APEL",
            "PISANG",
            "NANAS",
            "DELIMA",
            "BERRIES"
    };

    public String[] text = {
            "Buah kurma adalah buah yang memiliki kandungan glukosa tinggi yaitu antara 60-70 %. Sehingga sangat bagus untuk memenuhi asupan energi harian ibu hamil. Kurma juga bermanfaat dalam meningkatkan rangsangan syaraf sehingga sangat baik untuk meningkatkan kecrdasan otak bayi. Kurma memiliki kandungan yang sangat baik untuk ibu hamil yaitu berupa vitamin B kompleks, zat besi dan kalium.\n" +
                    "Kurma dapat memperlancar jalannya kelahiran tanpa bahaya apapun bagi ibu dan janin. Tak hanya itu, kurma juga memberikan Anda lebih banyak energi yang dibutuhkan di masa kehamilan, berkat kandungan gula alaminya. Kurma juga memiliki kandungan serat tinggi yang mencegah konstipasi saat kehamilan dan menjaga sistem pencernaan tetap lancar. Kandungan protein di dalamnya juga berperan dalam produksi asam amino yang penting bagi perkembangan tubuh janin dan kandungan vitamin K di dalamnya juga membantu pertumbuhan tulang janin.\n" +
                    "Kurma juga mengandung cukup banyak zat besi yang berguna dalam mencegah anemia selama kehamilan.",

            "Alpukat adalah buah yang memiliki kandungan asam folat yang tinggi. Sehingga buah ini bagus ini untuk kebutuhan nutrisi ibu hamil dan janin yang dikandungnya. Selain itu, alpukat juga memiliki banyak kandungan vitamin C, vitamin K, vitamin B, serat dan berbagai zat mineral. Beragam mineral itu dapat membantu untuk mengatasi gejala kram atau mual yang sering terjadi pada ibu hamil. Sedangkan untuk janin, buah ini dipercaya berguna untuk perkembangan otaknya dan sistem syaraf. Alpukat merupakan salah satu buah yang baik dikonsumsi saat hamil. Alpukat kaya akan vitamin B, vitamin C, asam folat, serta kalium. Alpukat dapat membantu mengurangi morning sickness, membantu perkembangan otak, sistem saraf dan jaringan bayi. Namun, alpukat mengandung lemak tinggi, sehingga jika memakannya terlalu banyak dapat menyebabkan kenaikan berat badan.",

            "Buah jeruk juga baik untuk memenuhi kebutuhan nutrisi ibu hamil. Jeruk sendiri memiliki banyak kandungan berupa vitamin C, serat, asam folat serta asupan cairan yang dibutuhkan oleh tubuh untuk menghindari terjadinya dehidrasi pada ibu hamil. Selain buah jeruk, lemon juga bisa menjadi pilihan yang bagus untuk ibu hamil. Sebab lemon mengandung vitamin C yang tinggi dan dapat digunakan untuk mengurangi rasa mual serta membantu melancarkan pencernaan ibu hamil. " +
                    "Mengandung vitamin C, folat, dan serat. Hampir 90% kandungannya adalah air sehingga membantu ibu hamil untuk memenuhi kebutuhan cairan tubuhnya. Kekurangan cairan tubuh dapat menyebabkan kelelahan. Kandungan folat yang tinggi pada jeruk juga dapat membantu perkembangan otak dan sumsum tulang belakang pada janin dan mencegah janin lahir cacat.",

            "Mangga adalah buah yang tumbuh subur di tanah Indonesia, sehingga tidak sulit untuk mendapatkan buah ini. Buah mangga ini bagus untuk memenuhi kebutuhan nutrisi pada ibu hamil. Satu mangkuk buah mangga cukup untuk memenuhi kebutuhan vit C dalam sehari. Selain itu, buah mangga juga melimpah akan kandungan vit A yang dibutuhkan oleh tubuh agar bayi nantinya terhindar dari penurunan serta gangguan pada sistem pertahanannya. " +
                    "Mangga mengandung kalium, vitamin C, dan vitamin A yang tinggi. Kalium dalam mangga dapat membantu menjaga tekanan darah dan cairan dalam tubuh, vitamin C sebagai antioksidan yang dapat menangkal radikal bebas dalam tubuh, sedangkan vitamin A juga berfungsi sebagai antioksidan dan membantu sistem kekebalan tubuh, penglihatan, dan sistem saraf pada bayi. Mangga juga mengandung serat yang tinggi sehingga dapat mencegah konstipasi atau sembelit pada ibu hamil.",

            "Buah apel ini memiliki banyak kandungan yang sangat baik untuk kesehatan ibu hamil. Diantara kandungannya adalah vitamin A, vitamin C, serat dan kalium yang merupakan nutrisi penting untuk ibu hamil. Dalam sebuah penelitian menunjukkan bahwa resiko terjadinya asma dan alergi lebih rendah terjadi pada bayi yang ibunya mengkonsumsi apel secara rutin dan teratur saat hamil.",

            "Pisang merupakan buah yang kaya akan kandungan kaliumnya. Buah pisang berguna sebagai pemasok energi secara instan untuk ibu hamil. Selain itu, pisang ini juga sangat baik untuk dikonsumsi ibu hamil yang sering mengalami mual-mual. Kandungan lain yang terdapat pada pisang adalah vitamin C, vitamin B-6 dan serat. Pisang juga dapat dikonsumsi dengan mengkombinasikannya dengan buah lain atau dicampur dengan yogurt. " +
                    "Kaya akan kalium dan menyediakan kalori yang cepat diubah menjadi energi untuk mencegah kelelahan. Kalium dalah pisang dapat membantu menjaga tekanan darah dalam tubuh. Pisang juga mengandung zat besi yang dapat membantu mencegah anemia pada ibu hamil. Pisang juga mudah untuk dicerna, sehingga dapat menjadi alternatif makanan jika ibu hamil sedang mengalami mual dan muntah.",

            "Selama ini nanas dianggap sebagai buah yang tidak baik untuk dikonsumsi oleh ibu hamil, bahkan menganggapnya sebagai buah yang berbahaya. Namun, hingga saat ini belum ada bukti ilmiah yang membuktikan bahwa buah nanas berbahaya bagi ibu hamil. Nanas memiliki kandungan berupa bromelain yang pada jumlah dan kadar banyak dipercaya dapat mengakibatkan pendarahan. Namun bromelain yang terkandung dalam satu sajian nanas kecil kemungkinannya bisa mengakibatkan gangguan kehamilan.",

            "Buah untuk ibu hamil selanjutnya adalah buah delima. Buah delima memiliki kandungan yang sangat berguna bagi kesehatan ibu hamil yaitu berupa mineral, vitamin dan asam folat yang tinggi. Hal ini dapat membantu dalam merawat prenatal untuk ibu hamil sehingga resiko bayi lahir premature lebih kecil. Selain itu, delima yang di jus juga berguna dalam melancarkan peredaran darah yang sangat baik untuk perkembangan janin. Dengan mengkonsumsi delima secara rutin dan teratur juda dapat mengurangi resiko bayi lahir dengan kekurangan berat badan.",

            "Buah-buahan berry ini mengandung kalium, folat, dan vitamin C yang tinggi. Kalium selain untuk menjaga tekanan darah, juga diperlukan untuk menjaga keseimbangan cairan tubuh, transmisi saraf, dan kontraksi otot. Folat dan vitamin C dapat membantu untuk mencegah anemia pada ibu hamil. Buah-buahan ini juga mengandung serat yang dapat membantu sistem pencernaan ibu hamil."
    };

    public int getCount() {
        return slide_heading_buah.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout_buah, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images_buah);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading_buah);
        WebView slideDescription = (WebView) view.findViewById(R.id.slide_description_buah);

        slideImageView.setImageResource(slide_images_buah[position]);
        slideHeading.setText(slide_heading_buah[position]);
        slideDescription.loadData("<p style=\"text-align: center\"> <font size=\"3\" face=\"Arial\">" + text[position]+" </font> </p>", "text/html", "UTF-8");
        slideDescription.setBackgroundColor(0);
        // /slideDescription.setText(slide_description_buah[position]);

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((RelativeLayout)object);
    }
}
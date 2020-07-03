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
 * Created by user on 28/07/2018.
 */

public class SliderAdapterMinuman extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapterMinuman (Context context){
        this.context = context;
    }

    //ARRAY
    public int[] slide_images_minuman = {
            R.drawable.minuman1,
            R.drawable.minuman2,
            R.drawable.minuman3,
            R.drawable.bulan1
    };

    //ARRAY
    public String[] slide_heading_minuman = {
            "1. SUSU KEDELAI",
            "2. AIR PUTIH",
            "3. AIR KELAPA",
            "4. PRODUK SUSU"
    };

    public String[] text = {
            "Minuman yang baik untuk ibu hamil pertama susu kedelai. " +
                    "Tentu Anda tahu bahwa susu merupakan salah satu produk yang membawa banyak manfaat sehat bagi perkembangan janin. " +
                    "Namun, ada beberapa di antara Anda yang menderita intoleransi laktosa atau alergi terhadap produk olahan sapi. " +
                    "Jika Anda adalah salah satunya, maka susu kedelai bisa menjadi salah satu alternatif. Susu kedelai memiliki kandungan yang mirip dengan susu sapi, meskipun kadar kalori dan karbohidrat di dalamnya sedikit lebih rendah dibandingkan susu sapi. " +
                    "Namun, kandungan kalsium dan proteinnya dapat mencukupi jumlah yang dibutuhkan selama kehamilan. " +
                    "Tak hanya itu, susu kedelai juga bebas kolesterol, tidak mengandung laktosa, dan memiliki kandungan lemak yang rendah. Susu kedelai juga bisa mencegah terjadinya hipertensi yang umum dialami ibu hamil, lho! Karena itu, susu kedelai untuk ibu hamil sangat dianjurkan bagi Anda yang menderita intoleransi laktosa dan alergi..",

            "Ibu hamil sangat disarankan untuk banyak-banyak meminum air putih. Selain dapat mencegah bayi lahir prematur, air putih juga sangat bermanfaat untuk mencegah datangnya konstipasi (susah BAB) atau infeksi saluran kemih.\n" +
                    "Namun, jika Bunda tidak begitu menyukai air putih karena rasanya (beberapa orang tidak suka air putih), gantilah dengan mengonsumsi buah-buahan yang mengandung banyak air seperti semangka, melon, jeruk, dan sebagainya.",

            "Ya, air kelapa merupakan salah satu jenis asupan yang sehat untuk ibu hamil yang tentunya aman untuk dikonsumsi selama Anda mengandung si buah hati. Kandungan potasium, magnesium, dan mineral lainnya di dalam air kelapa dapat melancarkan pembuangan air dan kotoran bagi ibu hamil, serta mencegah terjadinya infeksi saluran kemih sehingga kelahiran bayi pun berjalan lebih lancar. Tak hanya itu, kandungan elektrolitnya juga memproduksi energi yang dibutuhkan serta mengontrol tekanan darah Anda. Lebih jauh, air kelapa juga bisa mencegah konstipasi yang umum terjadi pada ibu hamil. Untuk kandungan vitamin dan mineralnya yang menyehatkan, tentu Anda tak perlu meragukan lagi, ya!",

            "Kandungan yang terdapat di dalam susu dapat membantu anda dalam mendukung pertumbuhan jaringan baru pada bayi, memperbaiki jaringan yang rusak dan pembentukan otot dan juga transportasi oksigen ke janin. Dengan terpenuhinya kebutuhan protein dan mineral maka dapat menunjang perkembangan dan pertumbuhan bayi. Pilihan susu kedelai dapat menjadi alternatif anda yang mempunyai kecukupan vitamin D dan rasa yang berbeda juga tambahan manfaat bagi ibu hamil."
    };

    public int getCount() {
        return slide_heading_minuman.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout_minuman, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images_minuman);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading_minuman);
        WebView slideDescription = (WebView) view.findViewById(R.id.slide_description_minuman);

        slideImageView.setImageResource(slide_images_minuman[position]);
        slideHeading.setText(slide_heading_minuman[position]);
        slideDescription.loadData("<p style=\"text-align: center\"> <font size=\"3\" face=\"Arial\">" + text[position]+" </font> </p>", "text/html", "UTF-8");
        slideDescription.setBackgroundColor(0);
        //        slideDescription.setText(slide_description_minuman[position]);

        container.addView(view);
        return view;
    }
}
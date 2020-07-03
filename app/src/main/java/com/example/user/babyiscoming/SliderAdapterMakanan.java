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

public class SliderAdapterMakanan extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    WebView slide_description_makanan;

    public SliderAdapterMakanan (Context context){
        this.context = context;
    }

    //ARRAY
    public int[] slide_images_makanan = {
            R.drawable.makanan1,
            R.drawable.makanan2,
            R.drawable.makanan3,
            R.drawable.makanan4,
            R.drawable.makanan5,
            R.drawable.makanan6
    };

    //ARRAY
    public String[] slide_heading_makanan = {
            "1. MADU",
            "2. MINYAK IKAN",
            "3. GANDUM / BERAS MERAH",
            "4. SAYURAN",
            "5. DAGING, IKAN, & TELUR",
            "6. KACANG - KACANGAN"
    };

    public String[] text = {
            "Siapa bilang ibu hamil tidak boleh mengonsumsi madu? " +
                    "Justru, madu mengandung nutrisi, vitamin, mineral, protein dan kalori yang Anda butuhkan di masa kehamilan. " +
                    "Madu unutk ibu hamil sangat baik, karena sistem imun Anda pun akan lebih terjaga berkat kandungan anti-bakteri dan antioksidan di dalamnya. " +
                    "Tak hanya itu, madu juga mencegah Anda terkena penyakit ringan seperti flu dan batuk selama hamil. Mengonsumsi madu secara rutin juga bisa mencegah maag dan insomnia yang sering Anda alami saat hamil." +
                    "Namun, berhati-hatilah dalam memilih produk madu yang Anda konsumsi, dan jangan mengonsumsi madu yang mentah atau belum terpasteurisasi, karena dapat menyebabkan botulisme.",

            "Makanan sehat untuk ibu hamil selanjutnya adalah minyak ikan, terutama minyak ikan kod. " +
                    "Pasalnya, minyak ikan kaya akan Omega 3, yang penting untuk perkembangan otak dan mata janin Anda. " +
                    "Tak hanya itu, minyak ikan juga memiliki kandungan vitamin D tinggi, yang juga baik sebagai suplemen bagi janin selama kehamilan, dan mencegah pre-eklampsia pada ibu yang mengandung. " +
                    "Penelitian terbaru juga membuktikan bahwa mengonsumsi minyak ikan untuk ibu hamil dapat meningkatkan berat badan bayi saat lahir, serta menurunkan risiko bayi terkena berbagai penyakit nantinya. " +
                    "Untuk mendapatkan manfaat ini, ibu hamil bisa mengonsumsi sebanyak satu sendok makan minyak ikan setiap harinya.",

            "Jangan lupa melengkapi asupan karbohidrat yang masuk ke tubuh dengan gandum. Gandum merupakan sumber makanan yang mengandung serat, vitamin E, serta selenium yang sangat bagus untuk membantu perkembangan janin di perut. Jika tidak suka gandum, Anda bisa menggantinya dengan nasi merah.",

            "Sayur adalah jenis makanan yang wajib masuk daftar menu sehari-hari seorang calon ibu. Tidak hanya mengandung serat yang baik untuk pencernaan, sayuran juga sangat kaya akan mineral, vitamin, serta asam folat yang sangat bagus untuk membantu perkembangan janin dalam rahim.",

            "Saat sudah memasuki trimester kedua dan ketiga, ibu hamil sangat disarankan untuk menambah asupan protein yang bisa diperoleh dari daging, ikan, serta telur. Telur merupakan sumber makanan kaya zat kolin yang sangat baik untuk membantu mengurangi risiko cacat tabung saraf pada bayi. \n" +
                    "Ikan yang sangat direkomendasikan untuk dikonsumsi saat mengandung adalah ikan salmon karena mengandung asam lemak omega 3 yang sangat baik untuk perkembangan tubuh janin dan memperbaiki mood ibu. Namun, Anda perlu membatasi konsumsi ikan jenis ini karena isu paparan merkuri yang menyeratinya.",

            "Saat mengandung, beberapa perempuan umumnya mengalami masalah pencernaan seperti wasir atau konstipasi (susah BAB). Untuk itu, Anda disarankan banyak-banyak mengonsumsi kacang-kacangan. Selain mengandung serat yang baik untuk pencernaan, makanan ini juga diperkaya dengan zat kalsium, folat, zat besi, dan seng."
    };

    public int getCount() {
        return slide_heading_makanan.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout_makanan, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images_makanan);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading_makanan);
        WebView slideDescription = (WebView) view.findViewById(R.id.slide_description_makanan);

        slideImageView.setImageResource(slide_images_makanan[position]);
        slideHeading.setText(slide_heading_makanan[position]);
        slideDescription.loadData("<p style=\"text-align: center\"> <font size=\"3\" face=\"Arial\">" + text[position]+" </font> </p>", "text/html", "UTF-8");
        slideDescription.setBackgroundColor(0);
//        slideDescription.setText(slide_description_makanan[position]);

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((RelativeLayout)object);
    }
}
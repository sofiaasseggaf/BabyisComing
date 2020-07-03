package com.example.user.babyiscoming;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by user on 20/07/2018.
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    WebView slide_description;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    //NIH BIKIN ARRAY SOP
    private int[] slide_images = {
            R.drawable.bulan1,
            R.drawable.bulan2,
            R.drawable.bulan3,
            R.drawable.bulan4,
            R.drawable.bulan5,
            R.drawable.bulan6,
            R.drawable.bulan7,
            R.drawable.bulan8,
            R.drawable.bulan9
    };

    //BIKIN ARRAY LAGI NIH
    private String[] slide_heading = {
            "TRISEMESTER 1 - BULAN 1",
            "TRISEMESTER 1 - BULAN 2",
            "TRISEMESTER 1 - BULAN 3",
            "TRISEMESTER 2 - BULAN 4",
            "TRISEMESTER 2 - BULAN 5",
            "TRISEMESTER 2 - BULAN 6",
            "TRISEMESTER 3 - BULAN 7",
            "TRISEMESTER 3 - BULAN 8",
            "TRISEMESTER 3 - BULAN 9"
    };

    private String[] text = {
            "-  -   -  -    Satu Bulan Perkembangan Janin   -    -  -   - " +
                    "Mulai terbentuknya kantung kehamilan yang " +
                    "berfungsi untuk melindungi janin dari air ketuban " +
                    "dan mulai terbentuknya placenta yang berfungsi " +
                    "untuk menyalurkan nutrisi makanan dari tubuh " +
                    "ibu ke janinya, dan juga sudah mulai terjadi " +
                    "aliran darah dalam tubuh janin. Sehingga pada " +
                    "kehamilan bulan pertama, ibu hamil sebaiknya " +
                    "disarankan untuk lebih banyak mengkonsumsi buah " +
                    "yang baik untuk ibu hamil.",

            "-  -   -  -    Dua Bulan Perkembangan Janin   -    -  -   - " +
                    "Wajah bayi sudah mulai terbentuk dan berkembang. " +
                    "Telinga sudah mulai terlihat sebagai lipatan pada " +
                    "kepala bagian kanan dan kiri. Mulai tampak juga bakal " +
                    "tangan, kaki, dan jari-jari mungilnya. Selain itu, " +
                    "mulai terbentuk juga sistem syaraf pusat atau otak, " +
                    "syaraf tulang belakang serta saluran pencernaan.",

            "-  -   -  -    Tiga Bulan Perkembangan Janin   -    -  -   - " +
                    "Fase bagian tubuh janin mulai terbentuk sempurna. " +
                    "Mulai tumbuh kuku dan tangan akan mulai bisa " +
                    "mengepal. Jenis kelamin janin diusia 3 bulan ini " +
                    "belum terlihat sempurna, sehingga  kurang tepat jika " +
                    "melakukan pemeriksaan jenis kelamin dengan USG. " +
                    "Perlu diketahui bahwa sistem kemih dan organ reproduksi " +
                    "mulai terbentuk, sedangkan hati mulai memproduksi empedu.",

            "-  -   -  -    Empat Bulan Perkembangan Janin   -    -  -   - " +
                    "Janin semakin lengkap menunjukan bagian-bagian tubuh seperti wajah, " +
                    "tangan, kaki, jari mulai dapat dilihat dengan jelas. Sangat tepat " +
                    "untuk melakukan USG diusia 4 bulan kehamilan, anda dapat mulai " +
                    "mendengar detak jantung janin akan semakin aktif dan sering bergerak, " +
                    "seperti mengisap jarinya, menguap dan mengubah ekspresi wajah.",

            "-  -   -  -    Lima Bulan Perkembangan Janin   -    -  -   - " +
                    "Untuk melatih ototnya gerakan janin akan semakin terasa kencang. " +
                    "Kepala janin sudah mulai tumbuh rambut halus, termasuk juga tangan dan kaki. " +
                    "lapisan putih mulai menutupi kulit janin yang berfungsi untuk mencegah janin terkena secara langsung cairan ketuban saat persalinan nanti.",

            "-  -   -  -    Enam Bulan Perkembangan Janin   -    -  -   - " +
                    "Mulai terbentuk keriput pada kulit janin. " +
                    "Pada bulan ini juga janin sudah dapat membuka dan menutup kelopak mata dan sudah bisa mendengar suara-suara dari luar perut. " +
                    "Oleh karena itu, para ibu hamil disarankan untuk mengajak bicara atau berkomunikasi dengan janin, " +
                    "yang berfungsi untuk merangsang kecerdasan janin sejak dalam kandungan.",

            "-  -   -  -    Tujuh Bulan Perkembangan Janin   -    -  -   - " +
                    "Mulai sudah bisa merespon suara-suara yang didengarnya dari luar perut dan juga sudah bisa merasakan adanya cahaya. " +
                    "Pertumbuhan janin akan semakin berkembang, tubuhnya semakin besar sehingga ibu hamil dapat merasakan ketika janin berganti posisi. " +
                    "Tubuh janin juga sudah mulai menyimpan lemak.",

            "-  -   -  -    Delapan Bulan Perkembangan Janin   -    -  -   - " +
                    "Semakin banyak cadangan lemak dalam kulit janin sehingga kulit janin tidak lagi terlihat keriput. " +
                    "Sudah mulai berfungsi juga pendengaran dan penglihatan janin dengan baik dan dengan sistem tubuh lainnya juga sudah dapat berfungsi kecuali paru-paru. " +
                    "Otak janin berkembang lebih sempurna sehingga akan sering menendang.",

            "-  -   -   Sembilan Bulan Perkembangan Janin  - - - " +
                    "Perkembangan paru-paru sudah dapat berfungsi dengan baik, " +
                    "sehingga tubuhnya akan memutar dengan posisi kepala berada dibawah untuk menghadap jalannya lahir. " +
                    "Sehingga dibulan ini, ibu hamil harus siapkan mental dan fisik untuk menghadapi persalinan yang semakin dekat."
    };

    public int getCount() {
        return slide_heading.length;
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;
    }

    public  Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        WebView slideDescription = (WebView) view.findViewById(R.id.slide_description);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.loadData("<p style=\"text-align: justify\"> <font size=\"3\" face=\"Arial\">" + text[position]+" </font> </p>", "text/html", "UTF-8");
        slideDescription.setBackgroundColor(0);
        //slideDescription.setText(slide_description[position]);

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}

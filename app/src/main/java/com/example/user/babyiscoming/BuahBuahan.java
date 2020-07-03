package com.example.user.babyiscoming;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 24/07/2018.
 */

public class BuahBuahan extends AppCompatActivity {

    private ViewPager slide_buah;
    private LinearLayout mDotLayout;
    private TextView[] mDots;
    private SliderAdapterBuah sliderAdapterBuah;
    private Button backbutton;
    private Button nextbutton;

    Integer tgl3, bln3, thn3;
    String nm;

    private int mCurrentPage;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buahbuahan);

        nm = getIntent().getStringExtra("nm");
        tgl3 = getIntent().getIntExtra("tgl3", 0);
        bln3 = getIntent().getIntExtra("bln3", 0);
        thn3 = getIntent().getIntExtra("thn3", 0);

        slide_buah = (ViewPager) findViewById(R.id.slide_buah);
        mDotLayout = (LinearLayout) findViewById(R.id.mDotLayout);
        nextbutton = (Button) findViewById(R.id.nextbutton);
        backbutton = (Button) findViewById(R.id.backbutton);

        sliderAdapterBuah = new SliderAdapterBuah(this);
        slide_buah.setAdapter(sliderAdapterBuah);
        addDotsIndicator(0);
        slide_buah.addOnPageChangeListener(viewListener);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide_buah.setCurrentItem(mCurrentPage + 1);
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide_buah.setCurrentItem(mCurrentPage - 1);
            }
        });
    }

    public void addDotsIndicator(int position) {
        mDots = new TextView[9];
        mDotLayout.removeAllViews();

        for (int i=0; i > mDots.length; i++) {

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.transparentWhite));

            mDotLayout.addView(mDots[i]);
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int il) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            mCurrentPage = i;

            if(i == 0) {

                nextbutton.setEnabled(true);
                backbutton.setEnabled(false);
                backbutton.setVisibility(View.INVISIBLE);
                nextbutton.setText("Next");
                backbutton.setText("");

            } else if (i == mDots.length - 1 ) {

                nextbutton.setEnabled(true);
                backbutton.setEnabled(true);
                backbutton.setVisibility(View.VISIBLE);
                nextbutton.setText("Finish");
                backbutton.setText("Back");

            } else {

                nextbutton.setEnabled(true);
                backbutton.setEnabled(true);
                backbutton.setVisibility(View.VISIBLE);
                nextbutton.setText("Next");
                backbutton.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    public void onBackPressed() {
        Intent a = new Intent(getApplicationContext(), Nutrisi.class);
        a.putExtra("nm", nm);
        a.putExtra("tgl3", tgl3);
        a.putExtra("bln3", bln3);
        a.putExtra("thn3", thn3);
        startActivity(a);
        finish();
    }
}

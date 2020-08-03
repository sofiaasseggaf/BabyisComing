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

public class Minuman extends AppCompatActivity {

    private ViewPager slide_minuman;
    private LinearLayout mDotLayout;
    private TextView[] mDots;
    private SliderAdapterMinuman sliderAdapterMinuman;
    private Button backbutton;
    private Button nextbutton;

    private int mCurrentPage;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        slide_minuman = (ViewPager) findViewById(R.id.slide_minuman);
        mDotLayout = (LinearLayout) findViewById(R.id.mDotLayout);
        nextbutton = (Button) findViewById(R.id.nextbutton);
        backbutton = (Button) findViewById(R.id.backbutton);

        sliderAdapterMinuman = new SliderAdapterMinuman(this);
        slide_minuman.setAdapter(sliderAdapterMinuman);
        addDotsIndicator(0);
        slide_minuman.addOnPageChangeListener(viewListener);


        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide_minuman.setCurrentItem(mCurrentPage + 1);
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide_minuman.setCurrentItem(mCurrentPage - 1);
            }
        });
    }

    public void addDotsIndicator(int position) {
        mDots = new TextView[4];

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

            } else if (i == mDots.length ) {

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
        startActivity(a);
        finish();
    }
}
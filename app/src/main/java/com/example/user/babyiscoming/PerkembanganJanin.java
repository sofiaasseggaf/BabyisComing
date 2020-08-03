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
 * Created by user on 28/07/2018.
 */

public class PerkembanganJanin extends AppCompatActivity {

    private ViewPager slide;
    private LinearLayout mDotLayout;
    private TextView[] mDots;
    private SliderAdapter sliderAdapter;
    private Button backbutton;
    private Button nextbutton;

    private int mCurrentPage;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkembangan_janin);

        slide = (ViewPager) findViewById(R.id.slide);
        mDotLayout = (LinearLayout) findViewById(R.id.mDotLayout);
        nextbutton = (Button) findViewById(R.id.nextbutton);
        backbutton = (Button) findViewById(R.id.backbutton);

        sliderAdapter = new SliderAdapter(this);
        slide.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        slide.addOnPageChangeListener(viewListener);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide.setCurrentItem(mCurrentPage + 1);
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide.setCurrentItem(mCurrentPage - 1);
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
            //mDots[i].setTextColor(getColor(getResources().getColor(R.color.white)));

            mDotLayout.addView(mDots[i]);
        }

/*        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.white));
        } */
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float j, int il) {

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
        Intent a = new Intent(getApplicationContext(), Home.class);
        startActivity(a);
        finish();
    }
}
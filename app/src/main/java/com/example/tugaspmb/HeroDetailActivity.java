package com.example.tugaspmb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.learnapp_recycleview.MainActivity.EXTRA_SUMMARY;
import static com.example.tugaspmb.MainActivity.EXTRA_NAME;
import static com.example.tugaspmb.MainActivity.EXTRA_SUMMARY;
import static com.example.tugaspmb.MainActivity.EXTRA_URL;

public class HeroDetailActivity extends AppCompatActivity {

    private static final extends EXTRA_SUMMARY = ;
    HeroModel heroSelected;

    ImageView ivHeroPhotoDetail;
    TextView tvHeroNameDetail;
    TextView tvHeroSummary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        ivHeroPhotoDetail = findViewById(R.id.iv_hero_photo_detail);
        tvHeroNameDetail = findViewById(R.id.tv_hero_name_detail);
        tvHeroSummary = findViewById(R.id.tv_hero_summary_detail);

        Intent a = getIntent();
        int heroPhoto = a.getIntExtra(EXTRA_URL, -1);
        String heroName = a.getStringExtra(EXTRA_NAME);
        String heroSummary = a.getStringExtra(EXTRA_SUMMARY);

        ivHeroPhotoDetail.setBackgroundResource(heroPhoto);
        tvHeroNameDetail.setText(heroName);
        tvHeroSummary.setText(heroSummary);
    }
}
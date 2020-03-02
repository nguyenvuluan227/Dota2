package com.example.dota2.herodetail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.dota2.R;
import com.example.dota2.herodetail.adapter.HeroDetailViewPagerAdapter;
import com.example.dota2.herodetail.fragment.CounterDetailFragment;
import com.example.dota2.herodetail.fragment.HeroDetailFragment;
import com.example.dota2.herodetail.fragment.StrategyDetailFragment;
import com.example.dota2.model.Hero;
import com.google.android.material.tabs.TabLayout;

public class HeroesDetailsActivity extends AppCompatActivity {

    int strengthType, strengthImage;
    int agiType, agiImage;
    int intelType, intelImage;
    String strengthName, agiName, intelName;
    ImageView imgDetail;
    TextView txtDetail;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_details);
        init();
        getData();
        setData();
        setupViewPager();
        setupTabLayout();
    }

    private void getData() {
        Intent intent = getIntent();

        strengthType = intent.getIntExtra("strengthType", 0);
        strengthName = intent.getStringExtra("strengthName");
        strengthImage = intent.getIntExtra("strengthImage", 0);

        agiType = intent.getIntExtra("agiType", 0);
        agiName = intent.getStringExtra("agiName");
        agiImage = intent.getIntExtra("agiImage", 0);

        intelType = intent.getIntExtra("intelType", 0);
        intelName = intent.getStringExtra("intelName");
        intelImage = intent.getIntExtra("intelImage", 0);
    }

    private void init() {
        imgDetail = findViewById(R.id.imgHeroDetail);
        txtDetail = findViewById(R.id.tvHeroName);
        viewPager = findViewById(R.id.viewPagerDetail);
        tabLayout = findViewById(R.id.tabLayoutDetail);
    }

    private void setData() {
        if (strengthType == Hero.TYPE_STRENGTH) {
            imgDetail.setImageResource(strengthImage);
            txtDetail.setText(strengthName);
        }

        if (agiType == Hero.TYPE_AGI) {
            imgDetail.setImageResource(agiImage);
            txtDetail.setText(agiName);
        }
        if (intelType == Hero.TYPE_INTEL) {
            imgDetail.setImageResource(intelImage);
            txtDetail.setText(intelName);
        }
    }

    private void setupViewPager() {
        HeroDetailViewPagerAdapter heroDetailViewPagerAdapter = new HeroDetailViewPagerAdapter(getSupportFragmentManager());
        heroDetailViewPagerAdapter.addFragment(new HeroDetailFragment(), "Hero");
        heroDetailViewPagerAdapter.addFragment(new StrategyDetailFragment(), "Strategy");
        heroDetailViewPagerAdapter.addFragment(new CounterDetailFragment(), "Counters");
        viewPager.setAdapter(heroDetailViewPagerAdapter);
    }

    private void setupTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
    }

}

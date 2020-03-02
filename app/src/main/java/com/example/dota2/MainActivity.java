package com.example.dota2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.dota2.adapter.MainViewPagerAdapter;
import com.example.dota2.fragment.AgiFragment;
import com.example.dota2.fragment.IntelFragment;
import com.example.dota2.fragment.StrengthFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setupViewPager();
        setupTabLayout();
    }

    private void init() {
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);


    }

    private void setupViewPager() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new StrengthFragment(), "Strength");
        mainViewPagerAdapter.addFragment(new AgiFragment(), "Agility");
        mainViewPagerAdapter.addFragment(new IntelFragment(), "Intelligence");
        viewPager.setAdapter(mainViewPagerAdapter);
    }

    private void setupTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.strength);
        tabLayout.getTabAt(1).setIcon(R.drawable.agi);
        tabLayout.getTabAt(2).setIcon(R.drawable.intel);
    }


}

package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar mtoolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = (Toolbar)findViewById(R.id.main_page_toolbar);
        viewPager = (ViewPager)findViewById(R.id.main_tabs_pager);
        tabLayout = (TabLayout)findViewById(R.id.Main_tabs);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Prototype");


    }
}

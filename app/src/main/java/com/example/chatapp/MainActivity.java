package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp.Adapters.TapAccessorAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Toolbar mtoolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TapAccessorAdapter myTabAccessorAdapter;
    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();
        mtoolbar = (Toolbar)findViewById(R.id.main_page_toolbar);
        viewPager = (ViewPager)findViewById(R.id.main_tabs_pager);
        tabLayout = (TabLayout)findViewById(R.id.Main_tabs);
        myTabAccessorAdapter = new TapAccessorAdapter(getSupportFragmentManager());
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Prototype");
        viewPager.setAdapter(myTabAccessorAdapter);


        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        if(currentUser  == null){
            sendUserToLoginActivity();
        }
    }

    private void sendUserToLoginActivity() {
        Intent Loginintent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(Loginintent);

    }
}

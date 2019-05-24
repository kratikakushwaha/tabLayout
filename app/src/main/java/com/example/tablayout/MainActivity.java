package com.example.tablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    // Toolbar toolbar;
    // Pager pager;

    ViewPager viewPager;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toolbar =  findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        tabLayout = findViewById(R.id.tab_layout);
        appBarLayout = findViewById(R.id.appbar);
//            tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
//            tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
//            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
        viewPager = findViewById(R.id.pager);
        //          pager  = new  Pager(getSupportFragmentManager(), tabLayout.getTabCount());
        //   viewPager.setAdapter(pager);
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.AddFragment(new fragment1(), "");
        adapter.AddFragment(new fragment2(), "");
        adapter.AddFragment(new Fragment3(), "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_chat_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_insert_photo_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_call_black_24dp);

//
//            tabLayout.setOnTabSelectedListener(this);

    }

//        @Override
//        public void onTabSelected(TabLayout.Tab tab) {
//            viewPager.setCurrentItem(tab.getPosition());
//        }
//
//        @Override
//        public void onTabUnselected(TabLayout.Tab tab) {
//
//        }
//
//        @Override
//        public void onTabReselected(TabLayout.Tab tab) {
//
//        }


}

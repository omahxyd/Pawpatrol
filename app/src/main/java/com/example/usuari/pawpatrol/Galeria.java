package com.example.usuari.pawpatrol;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.ViewParent;
import android.widget.RelativeLayout;

public class Galeria extends FragmentActivity {

    ViewPager viewPager;
    SwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_galeria);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new SwipeAdapter(this);
        viewPager.setAdapter(adapter);

    }

}

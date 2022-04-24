package com.example.androidme.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.androidme.AndroidImage;
import com.example.androidme.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager =getSupportFragmentManager();

        BodyFragment headFragment = new BodyFragment();
        headFragment.setImageIds(AndroidImage.getHead());
        headFragment.setListIndex(1);
        fragmentManager.beginTransaction().add(R.id.head_container,headFragment).commit();

        BodyFragment bodyFragment = new BodyFragment();
        bodyFragment.setImageIds(AndroidImage.getBody());
        bodyFragment.setListIndex(2);
        fragmentManager.beginTransaction().add(R.id.body_container,bodyFragment).commit();

        BodyFragment legFragment = new BodyFragment();
        legFragment.setImageIds(AndroidImage.getLeg());
        legFragment.setListIndex(3);
        fragmentManager.beginTransaction().add(R.id.leg_container,legFragment).commit();





    }
}
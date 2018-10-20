package com.example.antonio.mtrek.activities;

import android.os.Bundle;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class HomePageActivity extends BaseActivityForDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ButterKnife.bind(this);
        setupDrawerContent(nvView);
        setSupportActionBar(toolbar);
        initToolbarTitle(getString(R.string.tv_your_dirction));

    }
}

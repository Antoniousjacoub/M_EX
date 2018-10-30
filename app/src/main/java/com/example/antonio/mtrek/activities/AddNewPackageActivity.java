package com.example.antonio.mtrek.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class AddNewPackageActivity extends BaseActivityForDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_package);
        ButterKnife.bind(this);
        setupDrawerContent(nvView);
        setSupportActionBar(toolbar);
        initToolbarTitle(getString(R.string.add_trip));
        imgNotifications.setVisibility(View.VISIBLE);
    }
}

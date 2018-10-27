package com.example.antonio.mtrek.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class OrderPackageDetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_package_details);
        ButterKnife.bind(this);
        initToolbarTitle("يزيد");
    }
}

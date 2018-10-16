package com.example.antonio.mtrek.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class RegisterAsDriverActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_driver);
        ButterKnife.bind(this);
        initToolbarTitle(getString(R.string.new_register_driver));
    }
}

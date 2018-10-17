package com.example.antonio.mtrek.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class ForgotPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ButterKnife.bind(this);
        initToolbarTitle(getString(R.string.tv_forgot_my_password));
    }
}

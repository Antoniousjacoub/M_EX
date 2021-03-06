package com.example.antonio.mtrek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.antonio.mtrek.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterAsUserActivity extends BaseActivity {

    @BindView(R.id.edt_username)
    TextInputEditText edtUsername;
    @BindView(R.id.edt_password)
    TextInputEditText edtPassword;
    @BindView(R.id.edt_repeat_password)
    TextInputEditText edtRepeatPassword;
    @BindView(R.id.edt_phone)
    TextInputEditText edtPhone;
    @BindView(R.id.checkb)
    CheckBox checkb;
    @BindView(R.id.tv_terms_and_conditions)
    TextView tvTermsAndConditions;
    @BindView(R.id.btn_register_as_driver)
    Button btnRegisterAsDriver;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_user);
        ButterKnife.bind(this);
        initToolbarTitle(getString(R.string.new_register));
    }

    @OnClick({R.id.tv_terms_and_conditions, R.id.btn_register_as_driver})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_terms_and_conditions:
                break;
            case R.id.btn_register_as_driver:
                intent = new Intent(this,ActivationCodeActivity.class);
                startActivity(intent);
                break;
        }
    }
}

package com.example.antonio.mtrek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.antonio.mtrek.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.edt_username)
    TextInputEditText edtUsername;
    @BindView(R.id.edt_password)
    TextInputEditText edtPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_forgot_password)
    TextView tvForgotPassword;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_login, R.id.tv_forgot_password})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                intent = new Intent(LoginActivity.this,ActivationCodeActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_forgot_password:
                intent = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                startActivity(intent);
                break;
        }
    }
}

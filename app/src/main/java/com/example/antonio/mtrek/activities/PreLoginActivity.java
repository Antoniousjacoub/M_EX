package com.example.antonio.mtrek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.antonio.mtrek.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.antonio.mtrek.ulitis.Settings.setUpLanguage;

public class PreLoginActivity extends AppCompatActivity {

    @BindView(R.id.btn_register_as_user)
    Button btnRegisterAsUser;
    @BindView(R.id.btn_register_as_driver)
    Button btnRegisterAsDriver;
    @BindView(R.id.btn_login)
    Button btnLogin;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpLanguage(this);
        setContentView(R.layout.activity_pre_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_register_as_user, R.id.btn_register_as_driver, R.id.btn_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_register_as_user:
                intent = new Intent(PreLoginActivity.this,RegisterAsUserActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_register_as_driver:

                intent = new Intent(PreLoginActivity.this,RegisterAsDriverActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_login:
                intent = new Intent(PreLoginActivity.this,LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }
    }
}

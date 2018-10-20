package com.example.antonio.mtrek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.antonio.mtrek.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivationCodeActivity extends BaseActivity {

    @BindView(R.id.tv_phone_with_stars)
    TextView tvPhoneWithStars;
    @BindView(R.id.edt_first_number)
    EditText edtFirstNumber;
    @BindView(R.id.edt_second_number)
    EditText edtSecondNumber;
    @BindView(R.id.edt_third_number)
    EditText edtThirdNumber;
    @BindView(R.id.edt_fouth_number)
    EditText edtFouthNumber;
    @BindView(R.id.btn_confirm_activation_code)
    Button btnConfirmActivationCode;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation_code);
        ButterKnife.bind(this);
        initToolbarTitle(getString(R.string.activation_code));
    }

    @OnClick(R.id.btn_confirm_activation_code)
    public void onViewClicked() {
        intent = new Intent(this,HomePageActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}

package com.example.antonio.mtrek.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.mtrek.R;

import butterknife.ButterKnife;

public class NotificationDetailsActivity extends BaseActivity {

    public static String  TITLE_NOTIFICATION="TITLE_NOTIFICATION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_details);
        ButterKnife.bind(this);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null) {
            initToolbarTitle(bundle.getString(TITLE_NOTIFICATION));
        }



    }
}

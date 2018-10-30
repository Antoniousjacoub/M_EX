package com.example.antonio.mtrek.activities;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.custom.rateDialog.RateController;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotificationDetailsActivity extends BaseActivity {


    public static String TITLE_NOTIFICATION = "TITLE_NOTIFICATION";
    @BindView(R.id.rate_bar_notifications_details)
    ImageView imageDetailsRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_details);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            initToolbarTitle(bundle.getString(TITLE_NOTIFICATION));
        }


    }

    @OnClick(R.id.rate_bar_notifications_details)
    public void onViewClicked() {
        RateController.showRateDialog(getFragmentManager());
    }
}

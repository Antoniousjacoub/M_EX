package com.example.antonio.mtrek.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.adapters.NotificationsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotificationsActivity extends BaseActivityForDrawer {

    @BindView(R.id.notification_listview)
    ListView notificationListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        ButterKnife.bind(this);
        setupDrawerContent(nvView);
        setSupportActionBar(toolbar);
        initToolbarTitle(getString(R.string.menu_notification));

        notificationListview.setAdapter(new NotificationsAdapter(this));


    }
}

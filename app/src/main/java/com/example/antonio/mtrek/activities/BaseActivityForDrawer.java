package com.example.antonio.mtrek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.adapters.CustomDrawerAdapter;
import com.example.antonio.mtrek.model.DrawerItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.antonio.mtrek.ulitis.Settings.setUpLanguage;

public class BaseActivityForDrawer extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.flContent)
    FrameLayout flContent;
    @BindView(R.id.nvView)
    NavigationView nvView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.img_open_drawer)
    ImageView imgOpenDrawer;
    @BindView(R.id.drawer_bg)
    ImageView drawerBg;
    @BindView(R.id.menuList)
    ListView menuList;
    @BindView(R.id.img_notifications)
    ImageView imgNotifications;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpLanguage(this);
        setContentView(R.layout.activity_base_for_drawer);
//        ButterKnife.bind(this);
//        ButterKnife.bind(this);
//        ButterKnife.bind(this);
    }


    @Override
    public void setContentView(int layoutResID) {

        DrawerLayout fullView = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base_for_drawer, null);
        FrameLayout activityContainer = fullView.findViewById(R.id.flContent);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);


    }

    public void initToolbarTitle(String title) {
        tvToolbarTitle.setText(title);


    }

    public void setupDrawerContent(NavigationView navigationView) {

        ArrayList<DrawerItem> dataList = new ArrayList<DrawerItem>();
        dataList.add(new DrawerItem(getString(R.string.menu_home_page), R.drawable.ic_home_page));
        dataList.add(new DrawerItem(getString(R.string.menu_add_new_package), R.drawable.ic_add));
        dataList.add(new DrawerItem(getString(R.string.menu_notification), R.drawable.ic_notifications));
        dataList.add(new DrawerItem(getString(R.string.menu_history_package), R.drawable.ic_package));
        dataList.add(new DrawerItem(getString(R.string.menu_profile), R.drawable.ic_profile));
        dataList.add(new DrawerItem(getString(R.string.menu_settings), R.drawable.ic_settings));
        dataList.add(new DrawerItem(getString(R.string.menu_logout), R.drawable.ic_logout));

        LayoutInflater myinflater = getLayoutInflater();
        ViewGroup myHeader = (ViewGroup) myinflater.inflate(R.layout.nav_header, menuList, false);
        menuList.addHeaderView(myHeader, null, false);

        menuList.setAdapter(new CustomDrawerAdapter(
                this,
                R.layout.drawer_list_item,
                dataList));

        navigationView.setBackgroundResource(R.drawable.toolbar_background);
        menuList.setOnItemClickListener(this);

    }


    @OnClick({R.id.nvView, R.id.drawer_layout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.nvView:
                break;
            case R.id.drawer_layout:
                break;
        }
    }

    @OnClick(R.id.img_open_drawer)
    public void onViewClicked() {
        if (drawerLayout != null)
            drawerLayout.openDrawer(Gravity.START);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        drawerLayout.closeDrawers();

        switch (i) {
            case 1:

                intent = new Intent(this, HomePageActivity.class);
                startActivity(intent);
                break;

                case 2:

                intent = new Intent(this, AddNewPackageActivity.class);
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(this, NotificationsActivity.class);
                startActivity(intent);

                break;

            case 4:
                intent = new Intent(this, RegisterPackageActivity.class);
                startActivity(intent);

                break;

            case 7:
                intent = new Intent(this, SplashActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

        }


    }

    @OnClick(R.id.img_notifications)
    public void onClicked() {
        Intent intent=new Intent(this,NotificationsActivity.class);
        startActivity(intent);

    }
}

package com.example.antonio.mtrek.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.adapters.RegisterPackagePagerAdapter;
import com.example.antonio.mtrek.fragment.DirectOrdersFragment;
import com.example.antonio.mtrek.fragment.StaticOrdersFragment;
import com.example.antonio.mtrek.ulitis.Settings;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterPackageActivity extends AppCompatActivity implements
        DirectOrdersFragment.OnFragmentInteractionListener,
        StaticOrdersFragment.OnFragmentInteractionListener {


    @BindView(R.id.tab_register_package)
    TabLayout tabRegisterPackage;
    @BindView(R.id.vp_register_package)
    ViewPager vpRegisterPackage;
    @BindView(R.id.progressbarcontainer)
    RelativeLayout progressbarcontainer;
    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Settings.setUpLanguage(this);
       setContentView(R.layout.activity_register_package);
        ButterKnife.bind(this);
        tvToolbarTitle.setText(getString(R.string.order_now));
        tabRegisterPackage.addTab(tabRegisterPackage.newTab().setText(R.string.static_orders));
        tabRegisterPackage.addTab(tabRegisterPackage.newTab().setText(R.string.direct_orders));
        tabRegisterPackage.setTabGravity(TabLayout.GRAVITY_FILL);
        vpRegisterPackage.setOffscreenPageLimit(2);
        RegisterPackagePagerAdapter adapter = new RegisterPackagePagerAdapter(this, getSupportFragmentManager(), tabRegisterPackage.getTabCount());
        vpRegisterPackage.setAdapter(adapter);
        vpRegisterPackage.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabRegisterPackage));
        vpRegisterPackage.setCurrentItem(2);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

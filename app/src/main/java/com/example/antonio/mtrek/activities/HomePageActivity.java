package com.example.antonio.mtrek.activities;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.custom.search.SearchDialogController;

import java.util.Calendar;
import java.util.TimeZone;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.antonio.mtrek.ulitis.Helpers.setDateFormat;

public class HomePageActivity extends BaseActivityForDrawer implements DatePickerDialog.OnDateSetListener {

    @BindView(R.id.tv_date)
    TextView tvDate;
    @BindView(R.id.btn_order_now)
    Button btnOrderNow;
    @BindView(R.id.first_country)
    EditText firstCountry;
    @BindView(R.id.second_country)
    EditText secondCountry;
    private DatePickerDialog datePickerDialog;
    private Calendar newDate;
    private int startYear;
    private int startMonth;
    private int startDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ButterKnife.bind(this);
        setupDrawerContent(nvView);
        setSupportActionBar(toolbar);
        initToolbarTitle(getString(R.string.tv_your_dirction));

        Calendar c = Calendar.getInstance(TimeZone.getDefault());
        datePickerDialog = new DatePickerDialog(this, this, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public void onDateSet(DatePicker datePicker, int Year, int Month, int Day) {
        newDate = Calendar.getInstance();
        startYear = Year;
        startMonth = Month;
        startDay = Day;
        newDate.set(startYear, startMonth, startDay);
        tvDate.setText(setDateFormat(newDate));

    }

    @OnClick({R.id.tv_date, R.id.btn_order_now,R.id.first_country, R.id.second_country})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_date:
                datePickerDialog.show();
                break;
            case R.id.btn_order_now:
                break;
            case R.id.first_country:
                SearchDialogController.showSearchDialog(getFragmentManager());
                break;
            case R.id.second_country:
                SearchDialogController.showSearchDialog(getFragmentManager());
                break;
        }
    }
}

package com.example.antonio.mtrek.ulitis;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by antonio on 10/26/18.
 */

public class Helpers {


    public static String setDateFormat(Calendar calendar){
            SimpleDateFormat format = new SimpleDateFormat("MMMM-dd-yyyy");
            return format.format(calendar.getTime());
    }
    public static void hideSoftKey(Context context, View view) {
        try {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.example.antonio.mtrek.custom.rateDialog;

import android.app.FragmentManager;
import android.support.v4.app.DialogFragment;

import com.example.antonio.mtrek.R;
import com.example.antonio.mtrek.custom.search.CustomSearchDialogFragment;

/**
 * Created by antonio on 10/30/18.
 */

public class RateController {

    public static void showRateDialog(FragmentManager fragmentManager){
        RateDialogFragment rateDialogFragment = RateDialogFragment.newInstance();
        rateDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.DialogFragmentTheme);
        rateDialogFragment.show(fragmentManager,"");

    }
}

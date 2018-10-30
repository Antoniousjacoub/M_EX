package com.example.antonio.mtrek.custom.search;

import android.app.FragmentManager;
import android.support.v4.app.DialogFragment;


import com.example.antonio.mtrek.R;

/**
 * Created by antonio on 10/29/18.
 */

public class SearchDialogController {

    public static void showSearchDialog(FragmentManager fragmentManager){
        CustomSearchDialogFragment customSearchDialogFragment = CustomSearchDialogFragment.newInstance();
        customSearchDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.DialogFragmentTheme);
        customSearchDialogFragment.show(fragmentManager,"");

    }
}

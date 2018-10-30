package com.example.antonio.mtrek.custom.rateDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.antonio.mtrek.R;

/**
 * Created by antonio on 10/29/18.
 */


public class RateDialogFragment<T> extends DialogFragment {



    private static  RateDialogFragment fragment;


    public static  RateDialogFragment newInstance() {
        if (fragment == null) {
            return new  RateDialogFragment();
        } else {
            return fragment;
        }

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.layout_rate, container, false);



        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDialog().setCanceledOnTouchOutside(true);


    }

    @Override
    public void onResume() {
        super.onResume();
    }






}

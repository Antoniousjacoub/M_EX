package com.example.antonio.mtrek.custom.search;

import android.view.View;

/**
 * Created by antonious.hanna on 9/24/2018.
 */


public interface OnViewReadyListener<T> {
    View onViewReady(int position, T t, View convertView);
}

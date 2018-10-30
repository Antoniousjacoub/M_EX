package com.example.antonio.mtrek.custom.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonious.hanna on 9/24/2018.
 */


public class CustomSearchAdapter<T> extends BaseAdapter {
    private final OnViewReadyListener listener;
    ArrayList<T> mData;
    Context context;

    public CustomSearchAdapter(Context context, OnViewReadyListener<T> listener) {
        this.context = context;
        this.mData = new ArrayList<>();
        this.listener = listener;
    }

    @Override
    public int getCount() {

        return mData.size();
    }

    @Override
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return listener.onViewReady(position, mData.get(position), convertView);
    }

    public void clear() {
        mData.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<T> mdata) {
        this.mData.addAll(mdata);
        notifyDataSetChanged();
    }
}

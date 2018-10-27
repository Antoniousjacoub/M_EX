package com.example.antonio.mtrek.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.antonio.mtrek.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by antonio on 10/27/18.
 */

public class DirectOrdersAdapter extends BaseAdapter {
    Context context;
    private LayoutInflater inflater;
    private ViewHolder holder;

    public DirectOrdersAdapter(Context context) {

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            view = inflater.inflate(R.layout.item_dircet_orders, parent, false);

        }
        holder = new ViewHolder(view);

        if (position == 4 || position == 6 || position == 1)
            holder.imageRate.setVisibility(View.VISIBLE);
        return view;
    }


    static class ViewHolder {
        @BindView(R.id.tv_notifications_date)
        TextView tvNotificationsDate;
        @BindView(R.id.image_rate)
        ImageView imageRate;
        @BindView(R.id.linearLayout)
        LinearLayout linearLayout;
        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.textView)
        TextView textView;
        @BindView(R.id.textView2)
        TextView textView2;
        @BindView(R.id.media_card_view)
        CardView mediaCardView;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}

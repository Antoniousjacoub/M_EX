package com.example.antonio.mtrek.custom.search;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.antonio.mtrek.R;

import java.util.List;

import static com.example.antonio.mtrek.ulitis.Helpers.hideSoftKey;

/**
 * Created by antonious.hanna on 9/24/2018.
 */


public class CustomSearchDialogFragment<T> extends DialogFragment implements View.OnClickListener, onDataBindListener<T> {


    private StartSearchingListener requesDatatListener;
    private OnItemSelectedListener<T> onItemSelectedListener;
    private ListView listview;

    private SearchView searchView;

    private CustomSearchAdapter<T> mAdapter;
    private static CustomSearchDialogFragment fragment;


    public static CustomSearchDialogFragment newInstance() {
        if (fragment == null) {
            return new CustomSearchDialogFragment();
        } else {
            return fragment;
        }

    }


    public void setRequesDatatListener(StartSearchingListener requesDatatListener) {
        this.requesDatatListener = requesDatatListener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener<T> onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public CustomSearchAdapter<T> getAdapter() {
        return mAdapter;
    }

    public void setAdapter(CustomSearchAdapter<T> mAdapter) {
        this.mAdapter = mAdapter;
    }

    @Override
    public void onDataBind(List<T> mdata) {
        mAdapter.addAll(mdata);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void DismissView(Activity context,View view){
       hideSoftKey(context,view);
       dismiss();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.layout_custom_search, container, false);
        searchView =  v.findViewById(R.id.custom_search_view);

        listview =  v.findViewById(R.id.lstv_custom_search);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try {
                    if (mAdapter.getItem(i) != null && onItemSelectedListener != null) {
                        onItemSelectedListener.onItemSelected(mAdapter.getItem(i),searchView);
                    } else {
                        DismissView(getActivity(),searchView);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                handelSearchRequest(query.trim());

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                handelSearchRequest(newText.trim());

                return true;
            }
        });


        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDialog().setCanceledOnTouchOutside(true);
        listview.setAdapter(mAdapter);
        if (requesDatatListener!=null)
        requesDatatListener.OnStartSearching(null);

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        handelSearchRequest(null);
    }

    private void handelSearchRequest(String query) {
        if (mAdapter!=null)
        mAdapter.clear();
        if (requesDatatListener!=null)
        requesDatatListener.OnStartSearching(query);
    }


}

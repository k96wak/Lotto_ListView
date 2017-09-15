package com.example.yunda.lotto_listview;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by yun.da on 2017-09-11.
 */

public class LottoAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Items> data;
    private int layout;

    public LottoAdapter(Context context, int layout, ArrayList<Items> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position * 2).getDrwNo();
    }

    @Override
    public long getItemId(int position) {
        return position * 2;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview == null) {
            convertview = inflater.inflate(layout, parent, false);
        }
        Items itm = data.get(position * 2);

        return convertview;
    }
}

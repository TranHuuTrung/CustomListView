package com.example.admin.customlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/3/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {
    private Context context;
    private int resource;
    private ArrayList<Item> arritem;
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arritem = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        ImageView img_Avatar = (ImageView) convertView.findViewById(R.id.img_Avatar);
        TextView tv_noidung = (TextView) convertView.findViewById(R.id.tv_noidung);

        Item item = arritem.get(position);

        img_Avatar.setBackgroundColor(item.getAvatar());
        tv_noidung.setText(item.getNoidung());

        return convertView;
    }
}

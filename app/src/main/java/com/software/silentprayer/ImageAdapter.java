package com.software.silentprayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.software.silentprayer.R;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private int[] imageResources;
    private String[] itemTexts;  // Array containing text for each item

    public ImageAdapter(Context context, int[] imageResources) {
        this.context = context;
        this.imageResources = imageResources;

    }

    @Override
    public int getCount() {
        return imageResources.length;
    }

    @Override
    public Object getItem(int position) {
        return imageResources[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);


        imageView.setImageResource(imageResources[position]);


        return convertView;
    }
}


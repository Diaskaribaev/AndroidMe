package com.example.androidme.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class MasterList extends BaseAdapter {

    private Context contextt;
    private List<Integer> ImageIds;


    public MasterList(Context contextt, List<Integer> imageIds) {
        this.contextt = contextt;
        ImageIds = imageIds;
    }


    @Override
    public int getCount() {
        return ImageIds.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertview, ViewGroup parent) {
        ImageView imageView;
        if (convertview == null) {
            // If the view is not recycled, this creates a new ImageView to hold an image
            imageView = new ImageView(contextt);
            // Define the layout parameters
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertview;
        }

        // Set the image resource and return the newly created ImageView
        imageView.setImageResource(ImageIds.get(position));
        return imageView;
    }
}

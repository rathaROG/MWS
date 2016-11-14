package com.ratharog.mws.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.ratharog.mws.R;

/**
 * Created by rathaROG on 11/15/2016.
 */

/*public class ImageAdapter extends BaseAdapter {
    private Context context;
    // private final String[] mobileValues;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.grid_view_item, null);
        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        // return mobileValues.length;
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {r
        return 0;
    }

}*/

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView textViewTitle;
        TextView textViewMoisture;
        TextView textViewTemp;
        TextView textViewAutopilotStatus;

        View gridView;

        LayoutInflater li = ((Activity) mContext).getLayoutInflater();
        gridView = li.inflate(R.layout.grid_view_item, null);

        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = (int)(size.x - 30)/2 - 30;

        if (convertView == null) {
//            // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(width, width));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(10, 10, 10, 10);



            // if it's not recycled, initialize some attributes
            imageView = (ImageView) gridView.findViewById(R.id.imageViewBackground);
            textViewTitle = (TextView) gridView.findViewById(R.id.textViewTitle);
            textViewMoisture = (TextView) gridView.findViewById(R.id.textViewMoisture);
            textViewTemp = (TextView) gridView.findViewById(R.id.textViewTemp);
            textViewAutopilotStatus = (TextView) gridView.findViewById(R.id.textViewAutopilotStatus);

            gridView.setLayoutParams(new GridView.LayoutParams(width, width));
            // gridView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            gridView.setPadding(10, 10, 10, 10);

//            imageView.setLayoutParams(new GridView.LayoutParams(width, width));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(10, 10, 10, 10);

            imageView.setImageResource(R.drawable.grid_view_item_background);

            textViewTitle.setText("Field XXXX");
            textViewMoisture.setText("Moisture: 22");
            textViewTemp.setText("Temperature: 28ºC");
            textViewAutopilotStatus.setText("Autopilot: ON");

        } else {
            gridView = (View) convertView;
        }

        // imageView.setImageResource(mThumbIds[position]);
        return gridView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

    /*private Integer[] mThumbIds = {
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background,
            R.drawable.grid_view_item_background, R.drawable.grid_view_item_background
    };*/
}

package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PoiAdapter extends ArrayAdapter<Poi> {

    public PoiAdapter(Context context, ArrayList<Poi> poi) {
        super(context, 0, poi);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Poi currentPoi = getItem(position);

        TextView tvPoiName = listItemView.findViewById(R.id.tv_poi_name);
        tvPoiName.setText(currentPoi.getPoiName());

        TextView tvPoiDescription = listItemView.findViewById(R.id.tv_poi_description);
        tvPoiDescription.setText(currentPoi.getPoiDescription());

        ImageView ivPoiImage = listItemView.findViewById(R.id.iv_poi_image);
        ivPoiImage.setImageResource(currentPoi.getPoiPicture());

        return listItemView;
    }
}

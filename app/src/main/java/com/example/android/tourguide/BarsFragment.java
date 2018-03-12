package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<Poi> poi = new ArrayList<>();

        poi.add(new Poi("Harat`s pub", "First Irish bar opened in Yuzhno-Sakhalinsk", R.drawable.bar1));
        poi.add(new Poi("Lookin", "Lookin european style bar restaurant", R.drawable.bar2));
        poi.add(new Poi("The Soho", "English style bar with restaurant", R.drawable.bar3));
        poi.add(new Poi("Chippolini", "Small atmospheric italian restaurant-bar", R.drawable.bar4));
        poi.add(new Poi("Kentos DJ", "DJ bar. Bar with live modern DJs music", R.drawable.bar5));

        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

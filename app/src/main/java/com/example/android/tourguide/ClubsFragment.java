package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubsFragment extends Fragment {

    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<Poi> poi = new ArrayList<>();

        poi.add(new Poi("Loona", "Modern night club with go-go dance", R.drawable.club1));
        poi.add(new Poi("Full House", "Men's club. Lady dancing and bar", R.drawable.club2));
        poi.add(new Poi("People", "Fresh club for stylish people", R.drawable.club3));
        poi.add(new Poi("Bravo", "Karaoke club. Live music every weekend", R.drawable.club4));
        poi.add(new Poi("Aura", "Student's night club. Big area with kilowatts of sound", R.drawable.club5));

        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

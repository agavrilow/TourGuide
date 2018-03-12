package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<Poi> poi = new ArrayList<>();

        poi.add(new Poi("Resurrection Cathedral", "First biggest cathedral at Far" +
                " East region, build in these days", R.drawable.attraction1));
        poi.add(new Poi("Historical Museum", "Built in 1937 by Japan constructors," +
                " later become a historical city museum", R.drawable.attraction2));
        poi.add(new Poi("Victory Memorial", "Opened in 2016 in honor of 70th Victory" +
                " anniversary, with built in museum", R.drawable.attraction3));
        poi.add(new Poi("Chekhov's Theatre", "Main dramatic scene of the Island," +
                " almost all theatrical activities performed here", R.drawable.attraction4));
        poi.add(new Poi("Aniva Lighthouse", "The narrow and rocky promontory Bay" +
                " is located in the South-Eastern part of Sakhalin", R.drawable.attraction5));
        poi.add(new Poi("Mountain Air", "Ski resort and sports complex. In the" +
                " 2000s, the resort has become one of the most modern in Russia", R.drawable.attraction6));

        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

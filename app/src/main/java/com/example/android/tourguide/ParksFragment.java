package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<Poi> poi = new ArrayList<>();

        poi.add(new Poi("Gagarin's Park", "Biggest city park with own lake and small rail road for kids", R.drawable.park1));
        poi.add(new Poi("Asahikava Square", "Small park in the downtown, good for walking with dogs", R.drawable.park2));
        poi.add(new Poi("Lenina Square", "Main central park, near to rail way station and administration building", R.drawable.park3));
        poi.add(new Poi("Boarder Protectors Park", "Park named by Boarder Guards service, who is protecting the Island", R.drawable.park4));
        poi.add(new Poi("Honour Park", "Park of war honour, established after WW2 end", R.drawable.park5));
        poi.add(new Poi("Zoo Park", "Central city zoo park with lots of animals from different counties", R.drawable.park6));

        PoiAdapter adapter = new PoiAdapter(getActivity(), poi);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

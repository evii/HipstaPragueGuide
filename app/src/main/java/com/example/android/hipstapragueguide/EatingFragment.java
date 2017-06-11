package com.example.android.hipstapragueguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EatingFragment extends Fragment {

    public EatingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Bistro8_title, R.string.Bistro8_description,
                R.string.Bistro8_address, R.drawable.bistro8));
        places.add(new Places(R.string.Farm_Letna_title, R.string.Farm_Letna_description,
                R.string.Farm_Letna_address, R.drawable.thefarm));
        places.add(new Places(R.string.Plevel_title, R.string.Plevel_description,
                R.string.Plevel_address, R.drawable.plevel));
        places.add(new Places(R.string.Bistro_Zahrada_title, R.string.Bistro_Zahrada_description,
                R.string.Bistro_Zahradal_address, R.drawable.bistrozahrada));
        places.add(new Places(R.string.Eska_title, R.string.Eska_description,
                R.string.Eska_address, R.drawable.eska));
        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

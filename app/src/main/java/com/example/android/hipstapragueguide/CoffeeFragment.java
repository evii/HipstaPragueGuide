package com.example.android.hipstapragueguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeFragment extends Fragment {

    public CoffeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

// Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.Muj_salek_title, R.string.Muj_salek_description,
                R.string.Muj_salek_address, R.drawable.mujsalekkavy));
        places.add(new Places(R.string.Unijazz_title, R.string.Unijazz_description,
                R.string.Unijazz_address, R.drawable.unijazz));
        places.add(new Places(R.string.Cafe_Neustadt_title, R.string.Cafe_Neustadt_description,
                R.string.Cafe_Neustadt_address, R.drawable.neustadt));
        places.add(new Places(R.string.Kavarna_co_hleda_jmeno_title, R.string.Kavarna_co_hleda_jmeno_description,
                R.string.Kavarna_co_hleda_jmeno_address, R.drawable.kavarnacohledajmeno));
        places.add(new Places(R.string.EMA_title, R.string.EMA_description,
                R.string.EMA_address, R.drawable.ema));
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

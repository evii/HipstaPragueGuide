package com.example.android.hipstapragueguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by evi on 9. 6. 2017.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Places}s to be displayed.
     */
    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.place_title);
        // Get the tite of the place from the currentPlace object and set this text on
        // the title TextView.
        titleTextView.setText(currentPlace.getTitleId());

        // Find the TextView in the list_item.xml layout with the ID place_description.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.place_description);
        // Get the place_description from the currentPlace object and set this text on
        // the desription TextView.
        descriptionTextView.setText(currentPlace.getDescriptionId());

        // Find the TextView in the list_item.xml layout with the ID place_address.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.place_address);
        // Check if an address is provided for this place or not

        if (currentPlace.hasAddress()) {
            // If an address is available, display the provided address based on the resource ID
            addressTextView.setText(currentPlace.getAddressId());
            // Make sure the view is visible
            // Get the place_address from the currentPlace object and set this text on
            // the address TextView.
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the address (set visibility to GONE)
            addressTextView.setVisibility(View.GONE);
        }
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_photo);
        // Get the photo of the place from the currentPlace object and set this image in
        // the photo ImageView.
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}


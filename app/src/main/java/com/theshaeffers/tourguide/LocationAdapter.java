package com.theshaeffers.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;
import static android.os.Build.ID;

/**
 * Created by shaefferm on 10/11/2016.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> diningList) {
        super(context, 0, diningList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getmLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.location_address_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentLocation.getmLocationAddress());

        // Find the ImageView in the list_item.xml layout with the ID location_image_view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image_view);
        // Get the image resource ID from the current Location object and
        // set the image to imageView
        imageView.setImageResource(currentLocation.getmLocationImageId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

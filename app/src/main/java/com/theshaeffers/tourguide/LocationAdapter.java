package com.theshaeffers.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shaefferm on 10/11/2016.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    //This is used to track the color of the chosen activity.
    private int mColorResourceId;

    //Constructor
    public LocationAdapter(Activity context, ArrayList<Location> diningList, int colorResourceId) {
        super(context, 0, diningList);
        mColorResourceId = colorResourceId;
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

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.list_text);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

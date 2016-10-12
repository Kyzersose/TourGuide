package com.theshaeffers.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class Spooky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of dining locations
        final ArrayList<Location> diningList = new ArrayList<Location>();
        diningList.add(new Location("name", "address", "Description", R.mipmap.ic_launcher));
        diningList.add(new Location("name2", "address2", "Descrip2", R.mipmap.ic_launcher));
        diningList.add(new Location("name3", "address3", "Descrip3", R.mipmap.ic_launcher));

        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, diningList);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        //Remove the lines between the list items.
        listView.setDivider(null);
        listView.setDividerHeight(0);

        //Creates OnItemClickListener and sends it to the {@link Details.activity.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location detailsLocation = diningList.get(position);
                Log.i("Spooky", "Here's the position " + position);
                Log.i("Spooky:", "getmLocationName() returns:" + detailsLocation.getmLocationName());
                Log.i("Sppoky:", "getmLocationImageId() returns: "+ detailsLocation.getmLocationImageId());
//                ImageView detailsImageView = (ImageView) findViewById(R.id.details_image_view);
//                TextView detailsNameView = (TextView) findViewById(R.id.detail_location_name_view);
//                TextView detailsAddressView =
//                        (TextView) findViewById(R.id.details_location_address_view);
//                TextView detailsDescriiptionView =
//                        (TextView) findViewById(R.id.details_description_view);
//                detailsImageView.setImageResource(detailsLocation.getmLocationImageId());
//                detailsNameView.setText(detailsLocation.getmLocationName());
//                detailsAddressView.setText(detailsLocation.getmLocationAddress());
//                detailsDescriiptionView.setText(detailsLocation.getmLocationDescription());
                Intent i = new Intent(Spooky.this, LocationDetails.class);
                startActivity(i);


            }
        });
    }


}
package com.theshaeffers.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Fun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of dining locations
        final ArrayList<Location> funList = new ArrayList<Location>();
        funList.add(new Location(R.string.bamboo_name,
                R.string.bamboo_address,
                R.string.bamboo_description,
                R.drawable.ic_bamboo));
        funList.add(new Location(R.string.park_name,
                R.string.park_address,
                R.string.park_description,
                R.drawable.ic_park));
        funList.add(new Location(R.string.museum_name,
                R.string.museum_address,
                R.string.museum_description,
                R.drawable.ic_museum));
        funList.add(new Location(R.string.festival_name,
                R.string.festival_address,
                R.string.festival_description,
                R.drawable.ic_festival));

        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, funList, R.color.funColor);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
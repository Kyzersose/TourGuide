package com.theshaeffers.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Lodging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of lodging locations
        final ArrayList<Location> lodgingList = new ArrayList<Location>();
        lodgingList.add(new Location(R.string.legends_name,
                R.string.legends_address,
                R.string.legends_description,
                R.drawable.ic_legends));
        lodgingList.add(new Location(R.string.hampton_name,
                R.string.hampton_address,
                R.string.hampton_description,
                R.drawable.ic_hampton));
        lodgingList.add(new Location(R.string.inn_name,
                R.string.inn_address,
                R.string.inn_description,
                R.drawable.ic_inn));
        lodgingList.add(new Location(R.string.super8_name,
                R.string.super8_address,
                R.string.super8_description,
                R.drawable.ic_super8));

        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, lodgingList, R.color.lodgingColor);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
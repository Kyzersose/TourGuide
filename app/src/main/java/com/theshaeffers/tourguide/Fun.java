package com.theshaeffers.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Fun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of dining locations
        final ArrayList<Location> diningList = new ArrayList<Location>();
        diningList.add(new Location(R.string.cotton_gin_name,
                R.string.cotton_gin_address, R.string.cotton_gin_description, R.drawable.ic_cottongin));
        diningList.add(new Location(R.string.crosses_name, R.string.crosses_address,
                R.string.crosses_description, R.drawable.ic_crosses));
        diningList.add(new Location(R.string.spectre_name,
                R.string.spectre_address, R.string.spectre_description, R.drawable.ic_spectre));

        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, diningList);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
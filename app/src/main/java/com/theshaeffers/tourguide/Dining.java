package com.theshaeffers.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Dining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of dining locations
        final ArrayList<Location> diningList = new ArrayList<Location>();
        diningList.add(new Location(R.string.el_cerrito_name,
                R.string.el_cerrito_address,
                R.string.el_cerrito_description,
                R.drawable.ic_elcerrito));
        diningList.add(new Location(R.string.tokyo_name,
                R.string.tokyo_address,
                R.string.tokyo_description,
                R.drawable.ic_tokyo));
        diningList.add(new Location(R.string.mick_name,
                R.string.mick_address,
                R.string.mick_descroption,
                R.drawable.ic_micks));
        diningList.add(new Location(R.string.vickis_name,
                R.string.vickis_address,
                R.string.vickis_description,
                R.drawable.ic_vickis));


        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, diningList, R.color.diningColor);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }


}

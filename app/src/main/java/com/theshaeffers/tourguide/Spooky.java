package com.theshaeffers.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Spooky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_views);


        //Creates a list of dining locations
        final ArrayList<Location> spookyList = new ArrayList<Location>();
        spookyList.add(new Location(R.string.cotton_gin_name,
                R.string.cotton_gin_address,
                R.string.cotton_gin_description,
                R.drawable.ic_cottongin));
        spookyList.add(new Location(R.string.crosses_name,
                R.string.crosses_address,
                R.string.crosses_description,
                R.drawable.ic_crosses));
        spookyList.add(new Location(R.string.spectre_name,
                R.string.spectre_address,
                R.string.spectre_description,
                R.drawable.ic_spectre));
        spookyList.add(new Location(R.string.dev_house_name,
                R.string.dev_house_address,
                R.string.dev_house_description,
                R.drawable.ic_zombie));


        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, spookyList, R.color.spookyColor);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Location detailLocation = spookyList.get(position);
//                TextView detailsText = (TextView) findViewById(R.id.details_description_view);
//                detailsText.setText(R.string.cotton_gin_description);
//            }
//        });
    }


}
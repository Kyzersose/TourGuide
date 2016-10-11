package com.theshaeffers.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Dining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);


        //Creates a list of dining locations
        ArrayList<Location> diningList = new ArrayList<Location>();
        diningList.add(new Location("name","address","Description", R.mipmap.ic_launcher));
        diningList.add(new Location("name2", "address2", "Descrip2", R.mipmap.ic_launcher));
        diningList.add(new Location("name3", "address3", "Descrip3", R.mipmap.ic_launcher));

        //Create the Array Adapter to be used by the ListView
        LocationAdapter adapter = new LocationAdapter(this, diningList);

        //Set the adapter for the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}

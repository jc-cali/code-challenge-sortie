package org.codeforcoffee.sortie;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mFamousPetsList = new ArrayList();
    private ArrayAdapter<String> mArrayAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // providing content
        mFamousPetsList.add("Lil' Bub");
        mFamousPetsList.add("Grumpy Cat");
        mFamousPetsList.add("keyboard cat");
        mFamousPetsList.add("wishbone");
        mFamousPetsList.add("shadow");
        mFamousPetsList.add("wonder dog");
        mFamousPetsList.add("catdog");
        mFamousPetsList.add("meowth");
        mFamousPetsList.add("nyancat");
        mFamousPetsList.add("your pet here");
        mFamousPetsList.add("charmander");
        mFamousPetsList.add("bulbasaur");
        mFamousPetsList.add("squirtle");



        // sort the arrayList descendingly

        ArrayList<String> displayData = sortDescending(mFamousPetsList);

        // render the list using the android.R.simple_list_row_1 layout
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mFamousPetsList);
        // Set The Adapter

        ListView mListView = (ListView) findViewById(R.id.list_view);

        mListView.setAdapter(arrayAdapter);


    }

    private ArrayList<String> sortDescending(ArrayList<String> list) {

        // sort the arrayList descending alphabetically
        // do not use ArrayList.sort()
        for (int i = 0; i < list.size(); i++) {

            for (int a = list.size() - 1; a > i; a--) {
                String x = list.get(i).toLowerCase();
                String y = list.get(a).toLowerCase();

                int compare = x.compareTo(y);
                    // Check if second entry is before first entry and swap
                    if (compare > 0) {
                        String tmp = list.get(i);
                        list.set(i,list.get(a)) ;
                        list.set(a,tmp);
                    }
                }
         }

        return list;

    }
}

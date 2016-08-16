package org.codeforcoffee.sortie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

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


        mListView = (ListView) findViewById(R.id.list_view);

        // sort the arrayList descendingly

        ArrayList<String> displayData = sortDescending(mFamousPetsList);

        // render the list using the android.R.simple_list_row_1 layout



    }

    private ArrayList<String> sortDescending(ArrayList<String> list) {

        // sort the arrayList descending alphabetically
        // do not use ArrayList.sort()

        return list;

    }
}

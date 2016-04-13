package com.example.admin.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ADMIN on 05/04/2016.
 */
public class Menu extends ListActivity {

    String classes[]={"MainActivity","TextPlay","Email","Camera","example4","example5","example6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese=classes[position];
        try{
            //way to start an activity
        Class ourClass=Class.forName("com.example.admin.thenewboston."+cheese);
        Intent ourIntent=new Intent(Menu.this,ourClass);
        startActivity(ourIntent);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

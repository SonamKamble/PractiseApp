package com.example.admin.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by ADMIN on 05/04/2016.
 */
public class Menu extends ListActivity {

    String classes[]={"MainActivity","TextPlay","Email","Camera","Data","GFX","GFXSurface","SoundStuff","Slider","Tabs",
            "SimpleBrowser","Flipper","SharedPrefs","InternalData"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Code for Full Screen
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater blowUp=getMenuInflater();
        blowUp.inflate(R.menu.cool_menu, menu);
        return true;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.aboutUs:
               Intent i=new Intent("com.example.admin.thenewboston.ABOUT");
                startActivity(i);
                break;
            case R.id.preferences:
                Intent p=new Intent("com.example.admin.thenewboston.PREFS");
                startActivity(p);
                break;
            case R.id.exit:
                finish();
                break;
        }
        return false;
    }
}

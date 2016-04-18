package com.example.admin.thenewboston;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ADMIN on 18/04/2016.
 */
public class GFX extends Activity {

    MyBringBack ourView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourView=new MyBringBack(this);
        setContentView(ourView);
    }
}

package com.example.admin.thenewboston;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by ADMIN on 16/04/2016.
 */
public class Prefs extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}

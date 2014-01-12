package com.business.rh.Activities;


import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.business.rh.R;

/**
 * Created with IntelliJ IDEA.
 * User: removevirus
 * Date: 06.01.2014
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class RhPreferenceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new RhPreferencesFragment())
                .commit();
    }

}

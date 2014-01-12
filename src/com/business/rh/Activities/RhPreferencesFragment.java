package com.business.rh.Activities;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.business.rh.R;

/**
 * Created with IntelliJ IDEA.
 * User: removevirus
 * Date: 07.01.2014
 * Time: 00:42
 * To change this template use File | Settings | File Templates.
 */
public class RhPreferencesFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the rh_preferences from an XML resource
            addPreferencesFromResource(R.xml.rh_preferences);
        }

}

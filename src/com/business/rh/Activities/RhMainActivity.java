package com.business.rh.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.business.rh.R;

public class RhMainActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        View v = findViewById(R.id.btn_login);
        //set event listener
        v.setOnClickListener(this);

        PreferenceManager.setDefaultValues(this, R.xml.rh_preferences, false);
    }

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.btn_login ){
            //define a new Intent for the second Activity
            Intent intent = new Intent(this,LoginActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.rh_main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                return true;
            case R.id.action_options:
                openPreferencesActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openPreferencesActivity() {
        Intent intent = new Intent(this, RhPreferenceActivity.class);
        this.startActivity(intent);
    }


    public void showOptionsPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.rh_overflow_options_menu, popup.getMenu());
        popup.show();
    }

}

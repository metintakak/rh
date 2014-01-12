package com.business.rh.Activities;

import android.app.Activity;
import android.os.Bundle;
import com.business.rh.R;

/**
 * Created with IntelliJ IDEA.
 * User: removevirus
 * Date: 01.01.2014
 * Time: 03:26
 * To change this template use File | Settings | File Templates.
 */
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

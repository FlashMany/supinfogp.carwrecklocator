package com.supinfogp.carwrecklocator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CarWreckLocator extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_wreck_locator);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_car_wreck_locator, menu);
        return true;
    }
    
}

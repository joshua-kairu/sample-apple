package com.joslittho.sampler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * The landing
 */
// begin activity MainActivity
public class MainActivity extends AppCompatActivity {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    
    /* VARIABLES */
    
    /* CONSTRUCTOR */
    
    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the needed layout
        // 2. bind

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the needed layout

        setContentView( R.layout.fragment_search_for_doctor );

        // 2. bind

        ButterKnife.bind( this );

    } // end onCreate
    
    /* Other Methods */

} // end activity MainActivity

package com.joslittho.sampler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    /* Buttons */

    @BindView( R.id.login_b_sign_in )
    public Button mSignInButton; // ditto
    
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

        setContentView( R.layout.fragment_login );

        // 2. bind

        ButterKnife.bind( this );

    } // end onCreate
    
    /* Other Methods */

    @OnClick( R2.id.login_b_sign_in )
    // begin method onClickSignInButton
    public void onClickSignInButton( View view ) {

        // 0. start the second activity

        // 0. start the second activity

        startActivity( new Intent( this, SecondActivity.class ) );

    } // end method onClickSignInButton

} // end activity MainActivity
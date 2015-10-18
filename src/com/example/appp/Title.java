package com.example.appp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class Title extends Activity {

	// Google Map
	GoogleMap googleMap;
	Marker UserMarket, TaxiMarker;
	private double Lat, Lon;

	// Session Manager Class
	SessionManager session;

	// /// GETTER AND SETTER OF MY VARIABLES//////////

	public void setLat( double Lat )
	{
		this.Lat = Lat;
	}

	public void setLon( double Lon )
	{
		this.Lon = Lon;
	}

	public double getLat()
	{
		return this.Lat;
	}

	public double getLon()
	{
		return this.Lon;
	}

	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title);

		// Session Manager
		session = new SessionManager(getApplicationContext());

		// check if the user is logged in or not
		if( session.isLoggedIn() == false )
		{
			// if not logged in call the login activity and wait till the user
			// logins pressing login button
			Intent goLogin = new Intent(this, SocialNetworkLoginActivity.class);
			startActivity(goLogin);

		}
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

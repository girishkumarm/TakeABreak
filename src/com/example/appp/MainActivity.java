package com.example.appp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title);

		Intent goLogin = new Intent(this, Title.class);
		startActivity(goLogin);

	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

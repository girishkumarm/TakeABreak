package com.example.appp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SocialNetworkLoginActivity extends Activity implements OnClickListener {

	Button btnGplus, btnFb, btnTwitter, regBtn, loginBtn;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.social_network_sign_in);

		// / Initialize my butons
		btnGplus = (Button) findViewById(R.id.btnGplus);
		btnFb = (Button) findViewById(R.id.btnFb);
		btnTwitter = (Button) findViewById(R.id.btnTwitter);
		regBtn = (Button) findViewById(R.id.regBtn);
		loginBtn = (Button) findViewById(R.id.loginBtn);

		btnGplus.setOnClickListener(this);
		btnFb.setOnClickListener(this);
		btnTwitter.setOnClickListener(this);
		regBtn.setOnClickListener(this);
		loginBtn.setOnClickListener(this);
	}

	@Override
	public void onClick( View arg0 )
	{

		switch ( arg0.getId() )
		{

			case R.id.btnGplus :

				alertDialog("Google Plus Button is pressed");

				break;

			case R.id.btnFb :

				alertDialog("Facebook button is pressed");

				break;

			case R.id.btnTwitter :

				alertDialog("Twitter button is pressed");

				break;

			case R.id.regBtn :

				Intent register = new Intent(this, RegisterActivity.class);
				startActivity(register);

				break;

			case R.id.loginBtn :

				Intent goLogin = new Intent(this, LoginActivity.class);
				startActivity(goLogin);

				break;

		}

	} // End onClick function

	public void alertDialog( String Message )
	{

		new AlertDialog.Builder(this).setTitle("Take A Break :").setMessage(Message)
				.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

					public void onClick( DialogInterface dialog, int which )
					{

						// Include function if you need it on this event

					}
				})

				.setIcon(android.R.drawable.ic_dialog_alert).show();

	}

}

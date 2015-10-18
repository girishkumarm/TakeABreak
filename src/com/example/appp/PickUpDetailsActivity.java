/* create by Eric Bullock */
package com.example.appp;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;

public class PickUpDetailsActivity extends FragmentActivity implements OnClickListener {

	Button pickUpCities;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pick_up_details);

		// / Initialize my butons
		pickUpCities = (Button) findViewById(R.id.pickUpCity);

		pickUpCities.setOnClickListener(this);
	}

	@Override
	public void onClick( View arg0 )
	{

		switch ( arg0.getId() )
		{

			case R.id.pickUpCity :

				PopupMenu popup = new PopupMenu(this, arg0);
				MenuInflater inflater = popup.getMenuInflater();
				inflater.inflate(R.menu.menu, popup.getMenu());
				popup.show();

				break;

		}

	}

	public void alertDialog( String Message )
	{

		new AlertDialog.Builder(this).setTitle("Take A Break Message").setMessage(Message)
				.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

					public void onClick( DialogInterface dialog, int which )
					{

						// Include function if you need it on this event

					}
				})

				.setIcon(android.R.drawable.ic_dialog_alert).show();

	}

	public void showDatePickerDialog( View v )
	{
		DialogFragment newFragment = new DialogFragment();
		newFragment.show(getFragmentManager(), "datePicker");
	}

}
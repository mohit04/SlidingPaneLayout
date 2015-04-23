package com.example.cafenightclubcasinofinder;

import android.os.Bundle;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.cafenightclubcasinofinder.Options.Selection;

public class MainActivity extends ActionBarActivity implements SlidingPaneLayout.PanelSlideListener,Selection {

	
	SlidingPaneLayout pane;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

	Nearby_place myf = new Nearby_place();

		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.mainframe,myf,"nearby");
		transaction.commit();
		//FrameLayout fl = new FrameLayout(this);
		//fl.setLayoutParams(params)
		//setContentView(R.layout.activity_main);
		pane = (SlidingPaneLayout) findViewById(R.id.sp);
		pane.setPanelSlideListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onPanelClosed(View arg0) {
		// TODO Auto-generated method stub
		System.out.println("Panel closed");
		
	}

	@Override
	public void onPanelOpened(View arg0) {
		// TODO Auto-generated method stub
		System.out.println("Panel opened");
		
	}

	@Override
	public void onPanelSlide(View arg0, float arg1) {
		// TODO Auto-generated method stub
		System.out.println("Panel sliding");
	}

	@Override
	public void onSelection(int position) {
		// TODO Auto-generated method stub
		if(position==0)
		{
			Nearby_place myf = new Nearby_place();

			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			transaction.replace(R.id.mainframe,myf,"nearby");
			transaction.commit();
		}
		
		if(position==1)
		{
			Favourites myf = new Favourites();

			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			transaction.replace(R.id.mainframe,myf,"favourites");
			transaction.commit();
		}
		
	}
}

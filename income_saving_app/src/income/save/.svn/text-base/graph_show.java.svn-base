package income.save;

import android.app.TabActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.GridView;

import android.widget.TabHost;
import android.widget.TextView;

public class graph_show extends TabActivity {
	calculator ccHelper;
	GridView grid;
	TextView txtTest;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);
		SetupTabs();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(1, 1, 1, "Monthly savings");
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case 1:
			Intent addIntent = new Intent(this, graphical.class);
			startActivity(addIntent);
			break;
		}
		super.onOptionsItemSelected(item);
		return false;
	}

	void SetupTabs() {

		TabHost host = getTabHost();

		
		TabHost.TabSpec spec1 = host.newTabSpec("tag1");
		Intent in1 = new Intent(this, graphical.class);

		spec1.setIndicator("Monthly Savings");
		spec1.setContent(in1);

		TabHost.TabSpec spec2 = host.newTabSpec("tag2");
		Intent in2 = new Intent(this, trial.class);

		spec2.setIndicator("Yearly Savings");
		spec2.setContent(in2);

		

		host.addTab(spec1);
		host.addTab(spec2);
		
		

	}

}

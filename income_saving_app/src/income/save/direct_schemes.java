package income.save;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class direct_schemes extends Activity {

	EditText entersaving;
	calculator ccHelper;
	Button butdir;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.direct_saving);

		entersaving = (EditText) findViewById(R.id.entersaving);
		butdir = (Button) findViewById(R.id.butdir);

		butdir.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Spannable spn = entersaving.getText();
				int saving = Integer.valueOf(spn.toString());

				String urlString = direct_connection.urlstring
						+ "Direct_class?action=butdir&saving=" + saving;
				try {
					direct_connection.sendRequest(urlString);
					String resp = direct_connection.sendRequest(urlString);
					JSONArray jsonObject = new JSONArray(resp);
					String names[] = new String[jsonObject.length()];
					String desc[] = new String[jsonObject.length()];
					String period[] = new String[jsonObject.length()];
					String rate[] = new String[jsonObject.length()];
					String instalments[] = new String[jsonObject.length()];
					for (int a = 0; a < jsonObject.length(); a++) {

						names[a] = jsonObject.getJSONObject(a).getString(
								"POLICY_INFOTABLE_POLICY");
						desc[a] = jsonObject.getJSONObject(a).getString(
								"POLICY_INFOTABLE_DESC");
						period[a] = jsonObject.getJSONObject(a).getString(
								"POLICY_INFOTABLE_PERIOD");
						rate[a] = jsonObject.getJSONObject(a).getString(
								"POLICY_INFOTABLE_RATE");
						instalments[a] = jsonObject.getJSONObject(a).getString(
								"POLICY_INFOTABLE_INSTALMENTS");

						ConstanVarables.policya[a] = names[a];
						ConstanVarables.desca[a] = desc[a];
						ConstanVarables.perioda[a] = period[a];
						ConstanVarables.ratea[a] = rate[a];
						ConstanVarables.instalmentsa[a] = instalments[a];

					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Intent goToNextActivity = new Intent(getApplicationContext(),
						New_schemes.class);
				startActivity(goToNextActivity);
			}

		});
					

				

	}

}
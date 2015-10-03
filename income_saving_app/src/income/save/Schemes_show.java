package income.save;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Schemes_show extends Activity {

	Button schemesbut;
	calculator ccHelper;
	int count = 0;
	int salary = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schemes_guide);
		ccHelper = new calculator(this);

		schemesbut = (Button) findViewById(R.id.schemesbut);
		schemesbut.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				int salary1 = ccHelper.getsalary();
				int monthlyexp = ccHelper.monthlyexp();
				int yearlyexp = ccHelper.yearlyexp();

				int expenditure = 0;
				if (yearlyexp == 0) {
					expenditure = monthlyexp;
					count = 1;
				} else {
					expenditure = yearlyexp;
				}
				if (count == 1) {
					salary = (salary1) / 12;

				} else {
					salary = salary1;
				}
				
				
				String urlString = ConnectionUtil.urlstring
						+ "Mainservlet?action=schemesbut&salary=" + salary
						+ "&expenditure=" + expenditure;
				try {
					ConnectionUtil.sendRequest(urlString);

					String resp = ConnectionUtil.sendRequest(urlString);
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

						ConstanVarables.policy[a] = names[a];
						ConstanVarables.desc[a] = desc[a];
						ConstanVarables.period[a] = period[a];
						ConstanVarables.rate[a] = rate[a];
						ConstanVarables.instalments[a] = instalments[a];

					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Intent goToNextActivity = new Intent(getApplicationContext(),
						schemes.class);
				startActivity(goToNextActivity);
			}

		});

	}
}

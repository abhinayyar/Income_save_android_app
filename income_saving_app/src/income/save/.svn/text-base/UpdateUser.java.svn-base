package income.save;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.text.Spannable;
import android.util.Log;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateUser extends Activity {

	private TextView Name1;
	private EditText cngSalary;
	private EditText cngtime;
	private EditText cngPassword;
	Spinner spinner1;

	private Button cngbtnAdd;
	calculator ccHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.upadate_user);

		Name1 = (TextView) findViewById(R.id.Name);
		cngSalary = (EditText) findViewById(R.id.cngSalary);
		cngtime = (EditText) findViewById(R.id.cngtime);
		cngPassword = (EditText) findViewById(R.id.cngPassword);
		spinner1 = (Spinner) findViewById(R.id.spinner1);

		cngbtnAdd = (Button) findViewById(R.id.cngbtnAdd);
		String Name2 = ConstanVarables.Username.toString();
		Name1.setText("Hello "+Name2);


		// --spinner data-->
		String[] items = new String[] { "One", "Two", "Three" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items);
		adapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(adapter);

		// --ends here-->
		cngbtnAdd.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				try {
					Spannable spn = cngSalary.getText();
					Spannable spn1 = cngtime.getText();
					String Name = ConstanVarables.Username.toString();
					String Password = cngPassword.getText().toString();
					String Alert_Name = spinner1.getSelectedItem().toString();
					

					int Sal = Integer.valueOf(spn.toString());
					int time = Integer.valueOf(spn1.toString());
					

					Employee emp = new Employee(Name, Sal, time, Password);
					 Alarm_data dt = new Alarm_data(Alert_Name, time);
					
					ccHelper = new calculator(UpdateUser.this);
					
					int a = ccHelper.UpdateUSer(emp);
					
					if(a!=0)
					{
						Toast.makeText(UpdateUser.this, "Hello "+Name+" you have sucessfully updated your account", Toast.LENGTH_LONG).show();
						
					}

					int j=ccHelper.UpdateAlert(dt);
					Log.d("Message", "Reached in the same class");
					
					if(j!=0)
					{
						Intent goToNextActivity = new Intent(getApplicationContext(), home_view.class);
						startActivity(goToNextActivity);
					}
					

				} catch (Exception ex) {

					ex.getStackTrace();
				}

			}

		});

	}

}

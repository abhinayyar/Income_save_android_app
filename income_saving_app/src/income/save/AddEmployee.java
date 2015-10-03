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
import android.widget.Toast;

public class AddEmployee extends Activity {
	EditText txtName;
	EditText txtSal;
	EditText txttime;
	EditText txtPassword;
	Button btnAdd;
	Spinner spinner1;

	calculator ccHelper;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addemployee);
		txtName = (EditText) findViewById(R.id.txtName);
		txtSal = (EditText) findViewById(R.id.txtSal);
		txttime = (EditText) findViewById(R.id.txttime);
		txtPassword = (EditText) findViewById(R.id.txtPassword);
		spinner1=(Spinner)findViewById(R.id.spinner1);

		ccHelper = new calculator(this);
		btnAdd = (Button) findViewById(R.id.btnAdd);
		
		//--spinner data-->
		 String[] items = new String[] {"One", "Two", "Three"};
	       
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	                    android.R.layout.simple_spinner_item, items);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        spinner1.setAdapter(adapter);
	        
	     //--ends here-->

		btnAdd.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				try {
					Spannable spn = txtSal.getText();
					Spannable spn1 = txttime.getText();
					
					String Password=txtPassword.getText().toString();
					
					String Name = txtName.getText().toString();
					ConstanVarables.temp_user=Name;
					int mark=ccHelper.checkavail();
					String Alert_Name=spinner1.getSelectedItem().toString();

					int Sal = Integer.valueOf(spn.toString());
					int time = Integer.valueOf(spn1.toString());
					if(mark==1)
					{
						Toast.makeText(AddEmployee.this, "This username already exist please select some other username", Toast.LENGTH_LONG).show();
					}
					else{
						Employee emp = new Employee(Name, Sal, time,Password);
						Alarm_data dt=new Alarm_data(Alert_Name,time);
						ConstanVarables.Salary = txtSal.getText().toString();
						ConstanVarables.TIme = txttime.getText().toString();
						ConstanVarables.Password = txtPassword.getText().toString();
						ConstanVarables.Alert_CAT = spinner1.getSelectedItem().toString();
						int a=ccHelper.count();
						Log.d("Message", "value of a-->"+a);
						if(a==0)
				        {
				        	ccHelper.AddID();
				        }
						else
						{
							ccHelper.UpdateID();
						}
						ccHelper.UserInfo(emp);
						ccHelper.AddAlarmType(dt);
						ccHelper.insert_time();
						
				        
						
						Toast.makeText(AddEmployee.this, "Hello " +Name+" You have been Sucessfully Registered.Login now...", Toast.LENGTH_LONG).show();
						Intent goToNextActivity = new Intent(getApplicationContext(), Income_saving_appActivity.class);
						startActivity(goToNextActivity);
						
					}

					
                     
				} catch (Exception ex) {

					ex.getStackTrace();
				}

			}

		});

	}

}

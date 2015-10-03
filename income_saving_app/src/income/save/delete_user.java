package income.save;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;



import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class delete_user extends Activity {

	private EditText delUser;

	private Button butdel;
	calculator ccHelper;
	Employee emp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete_user);
		ccHelper = new calculator(this);

		delUser = (EditText) findViewById(R.id.delUser);

		butdel = (Button) findViewById(R.id.butdel);
		
		

		butdel.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				try {
					int salary = Integer.valueOf(ConstanVarables.Salary);
					int time = Integer.valueOf(ConstanVarables.TIme);
                    String Password=ConstanVarables.Password.toString();
					String name = delUser.getText().toString();
					int Expenditure=Integer.valueOf(ConstanVarables.exp);
					int Food=Integer.valueOf(ConstanVarables.food);
					int Shopping=Integer.valueOf(ConstanVarables.shopping);
					int Travel=Integer.valueOf(ConstanVarables.travel);
					int Rent=Integer.valueOf(ConstanVarables.rent);
					int Unknown=Integer.valueOf(ConstanVarables.unknown);
					int Others=Integer.valueOf(ConstanVarables.others);
					
					String Alert_Name=ConstanVarables.Alert_CAT;
					
					int Day=ConstanVarables.day;
					int Month=ConstanVarables.month;
					int Year=ConstanVarables.year;
					
					

					final Employee emp = new Employee(name, salary, time,Password);
					final spending_data spd=new spending_data(name,Expenditure,Day,Month,Year,Food,Shopping,Travel,Rent,Unknown,Others);
					final Alarm_data dt=new Alarm_data(Alert_Name,time);
					
					
					if(name.equals(ConstanVarables.Username))
					{
						ccHelper.DeleteEmp(emp);
						ccHelper.Deletealert(dt);
						ccHelper.Deletespd(spd);
						Toast.makeText(delete_user.this, "User Deleted Sucessfully ", Toast.LENGTH_LONG).show();
						Intent goToNextActivity = new Intent(getApplicationContext(), Income_saving_appActivity.class);
						startActivity(goToNextActivity);
						
					}
					else
					{
						Toast.makeText(delete_user.this, "You don't have acsess to delete this user.login into it's account to delete it", Toast.LENGTH_LONG).show();
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

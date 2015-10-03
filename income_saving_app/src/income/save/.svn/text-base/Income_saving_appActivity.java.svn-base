package income.save;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Income_saving_appActivity extends Activity {
    /** Called when the activity is first created. */
	EditText Username;
	EditText Password;
	Button login;
	Button register;
	calculator ccHelper;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        
        Username=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.butlog);
        register=(Button)findViewById(R.id.butreg);
        
        ccHelper = new calculator(this);
        
        startService(new Intent(this,AlaramSevice.class));
        
        
        login.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				String UserName = Username.getText().toString();
				String Pass = Password.getText().toString();
				ConstanVarables.Username = UserName.toString();
				ConstanVarables.Password = Pass.toString();
				SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
				String date=sd.format(new Date());
				ConstanVarables.datadate =date;
				
				
				SimpleDateFormat sdr = new SimpleDateFormat("HH");
				String currenttime = sdr.format(new Date());
				
				Log.d("Message", "value of time"+currenttime);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd");
				String day = sdf.format(new Date());
				int Day = Integer.valueOf(day);
				ConstanVarables.day1=day;
				ConstanVarables.day=Day;
				SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
				String month = sdf1.format(new Date());
				int Month = Integer.valueOf(month);
				ConstanVarables.month=Month;
				ConstanVarables.month1=month;
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
				String year = sdf2.format(new Date());
				int Year = Integer.valueOf(year);
				
				ConstanVarables.year=Year;
				
				
				int check=ccHelper.Logincheck();
				ccHelper.check_time();
				
				if(check!=0)
				{
					Intent goToNextActivity = new Intent(getApplicationContext(), home_view.class);
					startActivity(goToNextActivity);
				}
				else {
					Toast.makeText(Income_saving_appActivity.this, "You are not a valid user..", Toast.LENGTH_LONG).show();
				}
				
				
			}
        	
        });
        
        register.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent goToNextActivity = new Intent(getApplicationContext(), AddEmployee.class);
				startActivity(goToNextActivity);
				
			}
        	
        });
       
    }
}
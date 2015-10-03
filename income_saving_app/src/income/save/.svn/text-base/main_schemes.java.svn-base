package income.save;


import android.app.Activity;
import android.content.Intent;



import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class main_schemes extends Activity {
	TextView a;
	TextView aa;
	TextView aaa;
	TextView aaaa;
	
	TextView b;
	TextView bb;
	TextView bbb;
	TextView bbbb;
	
	
	TextView c;
	TextView cc;
	TextView ccc;
	TextView cccc;
	
	TextView d;
	TextView dd;
	TextView ddd;
	TextView dddd;
	
	
	TextView e;
	TextView ee;
	TextView eee;
	TextView eeee;
	
	Button butknow;
	
	calculator ccHelper;
	Schemes_show obj;
	
	

	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_schemes);
		ccHelper=new calculator(this);
		obj=new Schemes_show();
		
		a=(TextView)findViewById(R.id.a);
		aa=(TextView)findViewById(R.id.aa);
		aaa=(TextView)findViewById(R.id.aaa);
		aaaa=(TextView)findViewById(R.id.aaaa);
		
		butknow=(Button)findViewById(R.id.butknow);
		
		
		
			
			a.setText(ConstanVarables.policy[0]);
			aa.setText(ConstanVarables.instalments[0]);
			aaa.setText(ConstanVarables.period[0]);
			aaaa.setText(ConstanVarables.rate[0]);
			
			butknow.setOnClickListener(new OnClickListener(){

				public void onClick(View v) {
					
					Intent goToNextActivity = new Intent(getApplicationContext(), details.class);
					startActivity(goToNextActivity);
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			
			
			
			
		

		
	}
	
}
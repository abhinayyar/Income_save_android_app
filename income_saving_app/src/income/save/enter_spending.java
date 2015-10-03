package income.save;



import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;


import android.text.Spannable;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class enter_spending extends Activity {
	EditText food;
	EditText shopping;
	EditText travel;
	EditText rent;
	EditText unknown;
	EditText others;
	calculator ccHelper;
	Button butsub;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_view);
        ccHelper = new calculator(this);
        
        
        food = (EditText) findViewById(R.id.food);
    	shopping = (EditText) findViewById(R.id.shopping);
    	travel = (EditText) findViewById(R.id.travel);
    	rent = (EditText) findViewById(R.id.rent);
    	unknown = (EditText) findViewById(R.id.unknown);
    	others = (EditText) findViewById(R.id.others);
    	butsub=(Button)findViewById(R.id.butsub);
    	butsub.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				try
				{
					Spannable spn=food.getText();
					Spannable spn1=shopping.getText();
					Spannable spn2=travel.getText();
					Spannable spn3=rent.getText();
					Spannable spn4=unknown.getText();
					Spannable spn5=others.getText();
					
					
					int Food=Integer.valueOf(spn.toString());
					int Shopping=Integer.valueOf(spn1.toString());
					int Travel=Integer.valueOf(spn2.toString());
					int Rent=Integer.valueOf(spn3.toString());
					int Unknown=Integer.valueOf(spn4.toString());
					int Others=Integer.valueOf(spn5.toString());
					
					String Name=ConstanVarables.Username.toString();
					int Expenditure=Food+Shopping+Travel+Rent+Unknown+Others;
					ConstanVarables.exp=Expenditure;
					ConstanVarables.expnew=Expenditure;
					ConstanVarables.food=Food;
					ConstanVarables.shopping=Shopping;
					ConstanVarables.travel=Travel;
					ConstanVarables.rent=Rent;
					ConstanVarables.unknown=Unknown;
					ConstanVarables.others=Others;
					
					
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd");
					String day = sdf.format(new Date());
					int Day = Integer.valueOf(day);
					
					SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
					String month = sdf1.format(new Date());
					int Month = Integer.valueOf(month);
					
					
					SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
					String year = sdf2.format(new Date());
					int Year = Integer.valueOf(year);
					
					
					
					spending_data spd=new spending_data(Name,Expenditure,Day,Month,Year,Food,Shopping,Travel,Rent,Unknown,Others);
					ccHelper.AddSpending(spd);
					ccHelper.Expenditure_cal();
					ccHelper.insert_datainfo();
					
					Toast.makeText(enter_spending.this, "Hello "+ ConstanVarables.Username +" you have successfully entered the spendings", Toast.LENGTH_LONG).show();
					
					Intent goToNextActivity = new Intent(getApplicationContext(), home_view.class);
					startActivity(goToNextActivity);
					
					
				}
				catch(Exception ex)
				{
					
					ex.getStackTrace();
				}
				
				
			}
    		
    	});
    	

    }

}
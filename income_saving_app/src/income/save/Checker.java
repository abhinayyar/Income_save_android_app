package income.save;


	import org.json.JSONException;
	import org.json.JSONObject;

	import android.app.Activity;
	import android.os.Bundle;
	import android.util.Log;
	import android.widget.TextView;

	public class Checker extends Activity {
		TextView name;
		TextView expenditure;
		TextView date;
		TextView food;
		TextView shopping;
		calculator ccHelper;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.checker);
			ccHelper=new calculator(this);
			name=(TextView)findViewById(R.id.textView1);
			expenditure=(TextView)findViewById(R.id.textView2);
			date=(TextView)findViewById(R.id.textView3);
			food=(TextView)findViewById(R.id.textView4);
			shopping=(TextView)findViewById(R.id.textView5);
			calculator c = new calculator(this);
			JSONObject jsonObject = c.GetSavingDetails();
			Log.d("Message On Activity", jsonObject.toString());
			
			
			try {
				String s1=jsonObject.getString(calculator.MONTHLY_SAVING_INFOTABLE_NAME);
				String s2=jsonObject.getString(calculator.MONTHLY_SAVING_INFOTABLE_MONTH);
				String s3=jsonObject.getString(calculator.MONTHLY_SAVING_INFOTABLE_AMOUNT);
				
				
				name.setText(s1);
				expenditure.setText(s2);
				date.setText(s3);
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}



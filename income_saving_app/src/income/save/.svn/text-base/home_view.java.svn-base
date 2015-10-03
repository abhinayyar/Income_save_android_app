package income.save;


	import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;
import android.util.Log;
	import android.view.View;
	import android.widget.AdapterView;
	import android.widget.ArrayAdapter;
	import android.widget.ListView;
	
	import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

	public class home_view extends Activity {

		static final String[] HOME = new String[] { "Spending", "Saving",
				"Setting", "Schemes", "Graphical", "Exit" };
		ListView listView;
		calculator ccHelper;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.enter_spending);
			ccHelper=new calculator(this);
			// no more this
			// setContentView(R.layout.);
			listView = (ListView) findViewById(R.id.listView1);
			ArrayAdapter<String> menu = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, HOME);
			listView.setAdapter(menu);
			listView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// When clicked, show a toast with the TextView text
					
					if(position==0)
					{
						int j=ccHelper.DateChecker();
						Log.d("Message", "value of j"+j);
						
						if(j==0)
						{
							Intent goToNextActivity = new Intent(getApplicationContext(), enter_spending.class);
							startActivity(goToNextActivity);
							
							
						}
						else
						{
							Intent goToNextActivity = new Intent(getApplicationContext(), Spending_setting.class);
							startActivity(goToNextActivity);
							Toast.makeText(home_view.this, "Hello "+ConstanVarables.Username + " you have already entered the data for today.update data if you want", Toast.LENGTH_LONG).show();
							
						}
						
						
						
					}
					else if(position ==1)
					{
						int d=ccHelper.Datachecheker();
						if(d==0)
						{
							Toast.makeText(home_view.this, "Hello "+ConstanVarables.Username + " you have not entered the data please enter data and try again", Toast.LENGTH_LONG).show();
						}
						else
						{
							Intent goToNextActivity = new Intent(getApplicationContext(), Savings_interface.class);
							startActivity(goToNextActivity);
							
						}
						
						
					}
					else if(position==2)
					{
						Intent goToNextActivity = new Intent(getApplicationContext(), setting.class);
						startActivity(goToNextActivity);
					}
					else if(position==3)
					{
						Intent goToNextActivity = new Intent(getApplicationContext(), Schemes_show.class);
						startActivity(goToNextActivity);
						
					}
					else if(position==4)
					{
						Intent goToNextActivity = new Intent(getApplicationContext(), Interface_graph.class);
						startActivity(goToNextActivity);
					}
					else
					{
						Intent goToNextActivity = new Intent(getApplicationContext(), Income_saving_appActivity.class);
						startActivity(goToNextActivity);
					}
					
					Toast.makeText(home_view.this, HOME[position],
							Toast.LENGTH_SHORT).show();
				}
			});

		}

	}



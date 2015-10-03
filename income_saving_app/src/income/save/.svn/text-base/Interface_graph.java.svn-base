package income.save;



import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Interface_graph extends Activity {

	EditText enterintr;
	calculator ccHelper;
	Button butintr;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interface_year);

		enterintr = (EditText) findViewById(R.id.enterintr);
		butintr = (Button) findViewById(R.id.butintr);

		butintr.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Spannable spn = enterintr.getText();
				String year = String.valueOf(spn.toString());

				
				int a=year.charAt(0);
				int b=year.charAt(1);
				
				if((a=='2')&&(b=='0')){
					
					ConstanVarables.enteryear=year;
					Intent goToNextActivity = new Intent(
							getApplicationContext(), graph_show.class);
					startActivity(goToNextActivity);
				}
				else
				{
					Toast.makeText(Interface_graph.this, "Date format incorrect enter in form like 20..", Toast.LENGTH_LONG).show();
				}
					
						
			}

		});

	}
}

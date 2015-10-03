package income.save;



import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;

public class enter_saving extends Activity {
	TextView aaa;
	TextView bbb;
	TextView ccc;
	TextView ddd;
	TextView eee;
	TextView fff;
	TextView ggg;
	TextView hhh;
	TextView iii;
	TextView jjj;
	TextView kkk;
	TextView lll;
	TextView maintext;
	
	
	calculator ccHelper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table);
		ccHelper=new calculator(this);
		maintext = (TextView) findViewById(R.id.maintext);
		maintext.setText("Monthly data for the year "+ConstanVarables.enteryear);
		aaa=(TextView)findViewById(R.id.aaa);
		bbb=(TextView)findViewById(R.id.bbb);
		ccc=(TextView)findViewById(R.id.ccc);
		ddd=(TextView)findViewById(R.id.ddd);
		eee=(TextView)findViewById(R.id.eee);
		fff=(TextView)findViewById(R.id.fff);
		ggg=(TextView)findViewById(R.id.ggg);
		hhh=(TextView)findViewById(R.id.hhh);
		iii=(TextView)findViewById(R.id.iii);
		jjj=(TextView)findViewById(R.id.jjj);
		kkk=(TextView)findViewById(R.id.kkk);
		lll=(TextView)findViewById(R.id.lll);
		
		 

		
		
		try {
			int a=ccHelper.month_jan();
			int b=ccHelper.month_feb();
			int c=ccHelper.month_mar();
			int d=ccHelper.month_apr();
			int e=ccHelper.month_may();
			int f=ccHelper.month_jun();
			int g=ccHelper.month_jul();
			int h=ccHelper.month_aug();
			int i=ccHelper.month_sep();
			int j=ccHelper.month_oct();
			int k=ccHelper.month_nov();
			int l=ccHelper.month_dec();
			
			aaa.setText(""+a);
			bbb.setText(""+b);
			ccc.setText(""+c);
			ddd.setText(""+d);
			eee.setText(""+e);
			fff.setText(""+f);
			ggg.setText(""+g);
			hhh.setText(""+h);
			iii.setText(""+i);
			jjj.setText(""+j);
			kkk.setText(""+k);
			lll.setText(""+l);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

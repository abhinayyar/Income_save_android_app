package income.save;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ProgressBar;

public class yearly_graph extends Activity {

	@SuppressWarnings("unused")
	private static final int PROGRESS = 0x1;

	private ProgressBar mProgress1;
	private ProgressBar mProgress2;
	private ProgressBar mProgress3;
	private ProgressBar mProgress4;
	private ProgressBar mProgress5;
	private ProgressBar mProgress6;
	private ProgressBar mProgress7;
	private ProgressBar mProgress8;
	private ProgressBar mProgress9;
	private ProgressBar mProgress10;
	private ProgressBar mProgress11;
	private ProgressBar mProgress12;
	
	calculator ccHelper;

	

	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		setContentView(R.layout.yearly_saving);
		ccHelper = new calculator(this);

		mProgress1 = (ProgressBar) findViewById(R.id.progressBar1);
		mProgress1.setMax(1000);
		mProgress1.setProgress(ccHelper.month_jan());
		
		
		
		mProgress2 = (ProgressBar) findViewById(R.id.progressBar2);
		mProgress2.setMax(1000);
		mProgress2.setProgress(ccHelper.month_feb());
		
		mProgress3 = (ProgressBar) findViewById(R.id.progressBar3);
		mProgress3.setMax(1000);
		mProgress3.setProgress(ccHelper.month_mar());
		
		mProgress4 = (ProgressBar) findViewById(R.id.progressBar4);
		mProgress4.setMax(1000);
		mProgress4.setProgress(ccHelper.month_apr());
		
		mProgress5 = (ProgressBar) findViewById(R.id.progressBar5);
		mProgress5.setMax(1000);
		mProgress5.setProgress(ccHelper.month_may());
		
		mProgress6 = (ProgressBar) findViewById(R.id.progressBar6);
		mProgress6.setMax(1000);
		mProgress6.setProgress(ccHelper.month_jun());
		
		mProgress7 = (ProgressBar) findViewById(R.id.progressBar7);
		mProgress7.setMax(1000);
		mProgress7.setProgress(ccHelper.month_jul());
		
		mProgress8 = (ProgressBar) findViewById(R.id.progressBar8);
		mProgress8.setMax(1000);
		mProgress8.setProgress(ccHelper.month_aug());
		
		mProgress9 = (ProgressBar) findViewById(R.id.progressBar9);
		mProgress9.setMax(1000);
		mProgress9.setProgress(ccHelper.month_sep());
		
		mProgress10 = (ProgressBar) findViewById(R.id.progressBar10);
		mProgress10.setMax(1000);
		mProgress10.setProgress(ccHelper.month_oct());
		
		mProgress11 = (ProgressBar) findViewById(R.id.progressBar11);
		mProgress11.setMax(1000);
		mProgress11.setProgress(ccHelper.month_nov());
		
		mProgress12 = (ProgressBar) findViewById(R.id.progressBar12);
		mProgress12.setMax(1000);
		mProgress12.setProgress(ccHelper.month_dec());
	}

}


package income.save;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Context;
import android.content.Intent;

import android.os.IBinder;
import android.util.Log;

public class AlaramSevice extends Service {

	Context context;
	int vr = 0;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return START_STICKY;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		method();
	}

	private void method() {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				SimpleDateFormat sd = new SimpleDateFormat("HH");
				String currenttime = sd.format(new Date());
				calculator ccHelper = new calculator(AlaramSevice.this);
				int value = ccHelper.alarm_ret(currenttime);
				if (value > 0) {
					value = 1;
				} else {

				}
				if ((value != 0) & (vr == 0)) {
					Log.d("MesssGE", "ALARAM");
					Log.d("MesssGE", "value of vr= " + vr);
					vr++;
					dialog();
					onDestroy();

				} else {
					Log.d("MesssGE", "Noting found");

				}

			}
		}, 1000, 1000 * 20);

	}
	

	public void dialog() {

		// TODO Auto-generated method stub
		Intent dialogIntent = new Intent(getBaseContext(), display.class);
		dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		getApplication().startActivity(dialogIntent);

	}

}

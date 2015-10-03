package income.save;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class trialone extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.trialone);

Intent intent = new Intent(this, OneTimeAlarm.class);

PendingIntent pendingIntent = PendingIntent.getBroadcast(this,001000,intent,0);

PendingIntent pendingIntent2 = PendingIntent.getBroadcast(this,002000,intent,0);

PendingIntent pendingIntent3 = PendingIntent.getBroadcast(this,003000,intent,0);

AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), pendingIntent);
Toast.makeText(this, "Alarm set 1", Toast.LENGTH_LONG).show();

alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), pendingIntent2);
Toast.makeText(this, "Alarm set 2", Toast.LENGTH_LONG).show();

alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), pendingIntent3);
Toast.makeText(this, "Alarm set 3", Toast.LENGTH_LONG).show();
} 
}
	


	


package income.save;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class display extends Activity {

	MediaPlayer player;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		stopService(new Intent(display.this, AlaramSevice.class));
		final Dialog daiDialog = new Dialog(this);
		daiDialog.setTitle("Dialog Activity");
		daiDialog.setContentView(R.layout.display);
		Button stop = (Button) daiDialog.findViewById(R.id.stop);
		Button start = (Button) daiDialog.findViewById(R.id.buttonstart);
		start.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				startService(new Intent(display.this, AlaramSevice.class));
			}
		});
		stop.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				player.stop();
				daiDialog.dismiss();
			}

		});
		daiDialog.show();
		music(0);
	}

	private void music(int state) {
		// TODO Auto-generated method stub
		player = MediaPlayer.create(this, R.raw.small);
		player.setLooping(true); // Set looping
		player.start();

	}
}
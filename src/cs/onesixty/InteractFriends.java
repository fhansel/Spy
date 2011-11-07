package cs.onesixty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class InteractFriends extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.intefactfriends);
		
		Bundle extra = getIntent().getExtras();
		if (extra !=null){	
			TextView interactFriendsLabel = (TextView) findViewById(R.id.interactFriendsLabel);
			interactFriendsLabel.setText("Interact with " + extra.getString("friend_name"));
		}
		
		Button coop = (Button) findViewById(R.id.btnCoopMission);
		coop.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), MeetContact.class);
				startActivityForResult(intent, 0);
			}
		});
	}
}

package cs.onesixty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class DefuseBomb_Game extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bombgame);
        /*
        String url = "http://www.proprofs.com/games/jigsaw/bomb-defuse/";  
        Intent i = new Intent(Intent.ACTION_VIEW);  
        i.setData(Uri.parse(url));  
        startActivity(i);
        */
        ImageButton bomb = (ImageButton) findViewById(R.id.ib_bomb);
        bomb.setOnClickListener(new OnClickListener(){
        	public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), DefuseBomb_Game_End.class);
				startActivityForResult(intent, 0);
			}
        });
	}

}

package com.example.disastersfighter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
    }

public void btn(View v) {

	Uri uri = Uri
			.parse("http://a2s.netau.net"); // missing
																										// 'http://'
																										// will
																										// cause
																										// crashed
	Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	startActivity(intent);
}

}

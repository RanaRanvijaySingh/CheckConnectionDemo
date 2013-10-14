package com.example.checkconnectiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.message);
		checkConnection();
	}

	public void checkConnection() {
		ConnectionDetector connectionDetector = new ConnectionDetector(this);
		if (connectionDetector.isConnectedToInternet())
			textView.setText("connected");
		else
			textView.setText("Not Connected");
	}
}

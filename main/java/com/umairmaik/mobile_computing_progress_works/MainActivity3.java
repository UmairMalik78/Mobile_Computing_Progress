package com.umairmaik.mobile_computing_progress_works;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
	}
	@Override
	protected void onStart() {
		super.onStart();
		Log.d("ALC3","OnStart() Called");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("ALC3","OnStop() Called");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("ALC3","OnDestroy() Called");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("ALC3","OnPause() Called");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("ALC3","OnResume() Called");
	}
}
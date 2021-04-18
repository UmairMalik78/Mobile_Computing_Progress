package com.umairmaik.mobile_computing_progress_works;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	}
	@Override
	protected void onStart() {
		super.onStart();
		Log.d("ALC2","OnStart() Called");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("ALC2","OnStop() Called");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("ALC2","OnDestroy() Called");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("ALC2","OnPause() Called");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("ALC2","OnResume() Called");
	}

	public void SwitchToAcitivity3(View view) {
		Intent intent=new Intent(this,MainActivity3.class);
		startActivity(intent);
	}
}
package com.umairmaik.mobile_computing_progress_works;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	Button incrementButton;
	int count=0;
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		incrementButton=findViewById(R.id.incrementBtn);
		textView =findViewById(R.id.textViewCounter);
		Log.d("ALC","OnCreate() Called");
		if(savedInstanceState!=null){
			count=savedInstanceState.getInt("counterValue");
			textView.setText(String.valueOf(count));
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("ALC","OnStart() Called");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("ALC","OnStop() Called");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("ALC","OnDestroy() Called");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("ALC","OnPause() Called");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("ALC","OnResume() Called");
	}

	public void incrementCounterValue(View view){
		count= Integer.parseInt(textView.getText().toString());
		count++;
		textView.setText(String.valueOf(count));
	}

	public void SwitchToAcitivity2(View view) {
		Intent intent=new Intent(this,MainActivity2.class);
		startActivity(intent);
	}

	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("counterValue",count);
		Log.d("ALC","onSaveInstanceState() Called");

	}

	public void SwitchToAcitivity3(View view) {
		Intent intent=new Intent(this,MainActivity3.class);
		startActivity(intent);
	}
}
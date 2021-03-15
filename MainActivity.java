package com.umairmaik.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void Dial(View view){
		Uri uri=Uri.parse("+923314563914");
		Intent intent=new Intent(Intent.ACTION_DIAL,uri);
		startActivity(intent);
	}
	public void OpenFcitWebsite(View view){
		Uri uri=Uri.parse("https://pucit.edu.pk/");
		Intent intent=new Intent(Intent.ACTION_VIEW,uri);
		startActivity(intent);
	}
	public void MoveToSecondActivity(View view){
		Intent intent=new Intent(getBaseContext(),AnalogClockActivity.class);
		startActivity(intent);
	}
}
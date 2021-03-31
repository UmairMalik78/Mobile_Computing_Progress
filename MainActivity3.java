package com.umairmaik.mobile_computing_progress_works;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
	ListView listView;
	ArrayAdapter<String> arrayAdapter;
	ArrayList<String> tableArrayList=new ArrayList<String>();
	@RequiresApi(api = Build.VERSION_CODES.O)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		SeekBar mySeekBar=findViewById(R.id.mySeekBar);
		mySeekBar.setMax(200);
		ListView listView=findViewById(R.id.myListView);
		arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tableArrayList);
		listView.setAdapter(arrayAdapter);
		mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
			//	Log.d("Seekbar value is: ",String.valueOf(progress));
				tableArrayList.clear();
				for(int i=1;i<=10;i++){
					tableArrayList.add(progress+" X "+i+" = "+progress*i);
				}
				arrayAdapter.notifyDataSetChanged();
			}
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});
	}
}
/*	@Override
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
	}*/

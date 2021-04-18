package com.umairmaik.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	RecyclerView recyclerView;
	LinearLayoutManager layoutManager;
	List<ModelClass> itemsList;
	CustomAdapter customAdapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		initRecyclerView();


	}

	private void initData() {
		itemsList = new ArrayList<>();
		itemsList.add(new ModelClass(R.drawable.ramadan, "Ramadan", "12:00AM", "Ramadan Mubarak to All of You!", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.verses, "Quran", "01:55AM", "Recite Quran daily", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.umair, "Umair ", "10:50PM", "Assalam o Allaikum my friends!", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.danial, "Danial ", "08:40PM", "Waalaikum Salam brother!", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.haris, "Haris ", "03:450AM", "Hy Umair, lets go on walk", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.hussain, "Hussain ", "05:20AM", "Where are you?", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.sajid, "Sajid Bhai", "06:04AM", "Are you ok?", "_______________________________"));
		itemsList.add(new ModelClass(R.drawable.papa, "Papa", "08:01PM", "Come home,I've been waiting for you...", "_______________________________"));
	}

	private void initRecyclerView() {
		recyclerView = findViewById(R.id.myRecyclerView);
		layoutManager = new LinearLayoutManager(this);
		recyclerView.setLayoutManager(layoutManager);
		layoutManager.setOrientation(RecyclerView.VERTICAL);
		customAdapter = new CustomAdapter(itemsList);
		recyclerView.setAdapter(customAdapter);
		customAdapter.notifyDataSetChanged();

	}
}
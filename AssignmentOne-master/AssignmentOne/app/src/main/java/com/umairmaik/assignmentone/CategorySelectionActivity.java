package com.umairmaik.assignmentone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class CategorySelectionActivity extends AppCompatActivity {
	NavigationView navigationView;
	DrawerLayout drawer;
	Toolbar toolbar;
	ActionBarDrawerToggle toggle;
	MediaPlayer btnClickMediaPlayer;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_selection);
		toolbar = findViewById(R.id.myToolbar);
		setSupportActionBar(toolbar);
		navigationView = findViewById(R.id.navMENU);
		drawer = findViewById(R.id.myDrawer);
		toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close);
		drawer.addDrawerListener(toggle);
		toggle.syncState();
		navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				switch (item.getItemId()) {
					case R.id.engLanguage:
						Toast.makeText(getApplicationContext(), "English Language", Toast.LENGTH_SHORT).show();
						break;

					case R.id.urduLanguage:
						Toast.makeText(getApplicationContext(), "Urdu Language", Toast.LENGTH_SHORT).show();
						break;

					case R.id.Islamic:
						Toast.makeText(getApplicationContext(), "You selected Islamic Category", Toast.LENGTH_SHORT).show();
						Intent intent=new Intent(CategorySelectionActivity.this,QuizActivity.class);
						intent.putExtra("category","Islamic");
						startActivity(intent);
						break;

					case R.id.Science:
						Toast.makeText(getApplicationContext(), "You selected Science Category", Toast.LENGTH_SHORT).show();
						intent=new Intent(CategorySelectionActivity.this,QuizActivity.class);
						intent.putExtra("category","Science");
						startActivity(intent);
						break;

					case R.id.GeneralKnowledge:
						Toast.makeText(getApplicationContext(), "You selected General Knowledge Category", Toast.LENGTH_SHORT).show();
						intent=new Intent(CategorySelectionActivity.this,QuizActivity.class);
						intent.putExtra("category","General Knowledge");
						startActivity(intent);
						break;
				}
				return true;
			}
		});
	}

	public void MoveToQuizActivity(View view){
		onClickSound();
		String category=((Button)view).getText().toString();
		Intent intent=new Intent(this,QuizActivity.class);
		intent.putExtra("category",category);
		startActivity(intent);
	}

	public void onClickSound(){
		btnClickMediaPlayer=MediaPlayer.create(CategorySelectionActivity.this,R.raw.click);
		btnClickMediaPlayer.setLooping(false);
		btnClickMediaPlayer.start();
		btnClickMediaPlayer.setOnCompletionListener(new  MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				btnClickMediaPlayer.release();
			}
		});
	}
	@Override
	public void onBackPressed() {
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
			Toast.makeText(getApplicationContext(), "Start", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(getApplicationContext(), "End", Toast.LENGTH_SHORT).show();
		}
	}

}
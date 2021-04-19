package com.umairmaik.alertdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}


	public void ShowMultipleItemsDialog(View view) {
		String[] COLORS = {"Red", "Green", "Blue", "Yellow"};
		ArrayList<Integer> selectedItemsIndex = new ArrayList<Integer>();

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Choose a color").setMultiChoiceItems(COLORS, null, new DialogInterface.OnMultiChoiceClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which, boolean isChecked) {
				if (isChecked)
					selectedItemsIndex.add(which);
				else if (selectedItemsIndex.contains(which))
					selectedItemsIndex.remove(which);
			}
		}).setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				if(selectedItemsIndex.size()==0) {
					Toast.makeText(MainActivity.this, "No Items selected", Toast.LENGTH_SHORT).show();
					return;
				}
				String itemsList="";
				for(int i=0;i<selectedItemsIndex.size();i++){
					itemsList+=i+1+"."+COLORS[selectedItemsIndex.get(i)]+"\n";
				}
				Toast.makeText(MainActivity.this, "Total "+selectedItemsIndex.size()+" Items selected.\n "+itemsList, Toast.LENGTH_SHORT).show();
			}
		}).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "Dialog Box cancelled", Toast.LENGTH_SHORT).show();
			}
		}).setCancelable(false);
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
	}

	public void ShowCustomDialog(View view) {
		String[] COLORS = {"Red", "Green", "Blue", "Yellow"};
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		LayoutInflater inflater=this.getLayoutInflater();
		builder.setView(inflater.inflate(R.layout.dialog_design,null));
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
			}
		}).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "Negative Button Selected", Toast.LENGTH_SHORT).show();
			}
		}).setCancelable(false);
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
	}
	public void ShowDialog(View view) {
		String[] COLORS = {"Red", "Green", "Blue", "Yellow"};
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Choose a color");
		int checkedItem = -1, selectedItem = -1;
		builder.setSingleChoiceItems(COLORS, checkedItem, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, COLORS[which], Toast.LENGTH_SHORT).show();
			}
		}).setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
			}
		}).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "Negative Button Selected", Toast.LENGTH_SHORT).show();
			}
		}).setCancelable(false);
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
	}

}
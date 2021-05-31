package com.example.fragmentsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fragment1Btn;
    Button fragment2Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1Btn=findViewById(R.id.fragment1Btn);
        fragment2Btn=findViewById(R.id.fragment2Btn);

    }

    public void ShowFragment1(View view){
        Fragment1 fragment1=new Fragment1();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment1);
        fragmentTransaction.commit();
    }

    public void ShowFragment2(View view){
        Fragment2 fragment2=new Fragment2();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment2);
        fragmentTransaction.commit();
    }
}
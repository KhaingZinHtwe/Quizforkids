package com.example.quizforkids;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView welcome;
	ImageView img;
	Button Quizbtn,Animalbtn,Aboutbtn;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		welcome=(TextView) findViewById(R.id.welcome);
		img=(ImageView) findViewById(R.id.img);
		Quizbtn=(Button) findViewById(R.id.Quizbtn);
		Animalbtn=(Button) findViewById(R.id.Animalbtn);
		Aboutbtn=(Button) findViewById(R.id.Aboutbtn);
		
		Quizbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Animalbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Aboutbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		

	}
}

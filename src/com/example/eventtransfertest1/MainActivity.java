package com.example.eventtransfertest1;

import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 MyButton myButton =(MyButton)findViewById(R.id.myBtn);
		 myButton.setOnTouchListener(new OnTouchListener(){
			 public boolean onTouch(View v,MotionEvent event){
				 System.out.println("监听器中的触摸事件出发啦~~");
				 return false;
			 }
		 });
	}
	public boolean onTouch(MotionEvent event){
		 System.out.println("MainAvtivity中的触摸事件出发啦~~");
		 return false;
	}
}

	
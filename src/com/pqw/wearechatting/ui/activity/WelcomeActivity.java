package com.pqw.wearechatting.ui.activity;

import com.pqw.wearechatting.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class WelcomeActivity extends Activity {
	
	private KenBurnsView mKenBurnsView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		setupView();
	}
	
	private void setupView() {
		mKenBurnsView = (KenBurnsView) findViewById(R.id.welcome_picture);
		mKenBurnsView.setResourceIds(R.drawable.picture0, R.drawable.picture1);
		mKenBurnsView.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
				return false;
			}
			
		});
	}
}

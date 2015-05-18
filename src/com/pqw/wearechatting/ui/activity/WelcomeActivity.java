package com.pqw.wearechatting.ui.activity;

import com.pqw.wearechatting.R;
import com.pqw.wearechatting.ui.application.WeAreChattingApplication;
import com.pqw.wearechatting.utils.SharedPreferenceUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class WelcomeActivity extends Activity {
	
	private KenBurnsView mKenBurnsView = null;
	private WeAreChattingApplication mApplication;
	private SharedPreferenceUtil mSpUtil;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		mApplication = (WeAreChattingApplication) getApplication();
		mSpUtil = mApplication.getSpUtil();
		
		setupView();
	}
	
	private void setupView() {
		mKenBurnsView = (KenBurnsView) findViewById(R.id.welcome_picture);
		mKenBurnsView.setResourceIds(R.drawable.picture0, R.drawable.picture1);
		mKenBurnsView.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				String userId = mSpUtil.getUserId();
				Intent intent = null;
				if (TextUtils.isEmpty(userId)) {
					intent = new Intent(WelcomeActivity.this, LoginActivity.class);
				} else {
					intent = new Intent(WelcomeActivity.this, MainActivity.class);
				}
				WelcomeActivity.this.startActivity(intent);
				WelcomeActivity.this.finish();
				return false;
			}
			
		});
	}
}

package com.pqw.wearechatting.ui.application;

import com.baidu.frontia.FrontiaApplication;

import android.app.Application;

public class WeAreChattingApplication extends FrontiaApplication {
	
	private static WeAreChattingApplication mApplication;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mApplication = this;
	}
	
}

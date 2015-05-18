package com.pqw.wearechatting.ui.application;

import com.baidu.frontia.FrontiaApplication;
import com.pqw.wearechatting.utils.SharedPreferenceUtil;

import android.app.Application;

public class WeAreChattingApplication extends FrontiaApplication {
	
	private static WeAreChattingApplication mApplication;
	
	/**
	 * API_KEY
	 */
	public final static String API_KEY = "OhMCW1hzD6guH5SRODM3fyVd";
	/**
	 * SECRET_KEY
	 */
	public final static String SECRET_KEY = "CGvS2FMbT902D2nxojajK3iViqG2Ctw6";
	public final static String SP_FILE_NAME = "push_msg_sp";
	
	private SharedPreferenceUtil mSpUtil;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mApplication = this;
		initData();
	}
	
	public synchronized static WeAreChattingApplication getInstance() {
		return mApplication;
	}
	
	private void initData() {
		/*mBaiduPushServer = new BaiduPush(BaiduPush.HTTP_METHOD_POST,
				SECRET_KEY, API_KEY);
		// 不转换没有 @Expose 注解的字段
		mGson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
				.create();*/
		mSpUtil = new SharedPreferenceUtil(this, SP_FILE_NAME);
		/*mNotificationManager = (NotificationManager) getSystemService(android.content.Context.NOTIFICATION_SERVICE);
		userDB = new UserDB(this);
		messageDB = new MessageDB(this);*/
	}
	
	public synchronized SharedPreferenceUtil getSpUtil() {
		if (mSpUtil == null) {
			mSpUtil = new SharedPreferenceUtil(this, SP_FILE_NAME);
		}
		return mSpUtil;
	}
	
	
}

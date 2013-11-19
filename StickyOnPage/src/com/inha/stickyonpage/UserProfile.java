package com.inha.stickyonpage;

import android.content.Context;
import android.content.SharedPreferences;

public class UserProfile {

	private String userId;
	private String userName;
	private String loginStatus;

	private static UserProfile instance; 
	
	private UserProfile(Context context) {
		// TODO Auto-generated constructor stub
		
		SharedPreferences mSharedPref = context.getSharedPreferences(Const.PREFERENCE, context.MODE_PRIVATE);
		
		setLoginStatus(mSharedPref.getString(Const.PREF_LOGINSTATUS, ""));
		setUserId(mSharedPref.getString(Const.PREF_LOGINID, ""));
		setUserName("");
	}
	
	public static UserProfile getInstacne(Context context){
		
		if(instance == null)
			instance = new UserProfile(context);
		return instance;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
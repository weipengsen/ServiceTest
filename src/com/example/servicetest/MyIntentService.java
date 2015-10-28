package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService{
	public MyIntentService(){
		super("MyIntentService");
	}
	protected void onHandleIntent(Intent intent){
		Log.d("MyIntentService","Thread"+Thread.currentThread().getId());
	}
	public void onDestroy(){
		super.onDestroy();
		Log.d("MyIntentService","onDestroy");
	}

}

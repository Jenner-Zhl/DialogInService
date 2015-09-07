package com.zhl.dialoginservice;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.IntentService;
import android.content.Intent;

public class MyService extends IntentService {

	public MyService() {
		super("zhlService");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		android.util.Log.d("zhl", "handle intent");
		
		AlertDialog.Builder build = new AlertDialog.Builder(getApplicationContext());
		build.setTitle("Dialog")
		.setMessage("showing Dialog")
		.setPositiveButton(android.R.string.ok, null)
		.show();
	}

}

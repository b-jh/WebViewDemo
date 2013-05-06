package com.bjh.webviewdemo;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class MyObject {
	Context mContext;
	MyObject (Context c){
		mContext=c;
	}
	//该方法会暴露该javaScript
	public void showToast(String name){
		Log.v("aa", "执行到此");
		Toast.makeText(mContext, "你好", 2000).show();
	}
	//该方法会暴露该javaScript
	public void showDialog(){
		Log.v("aa", "执行到此1111111");
		new AlertDialog.Builder(mContext).setTitle("弹出对话框").setPositiveButton("确定", null).create().show();
	}
}

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
	//�÷����ᱩ¶��javaScript
	public void showToast(String name){
		Log.v("aa", "ִ�е���");
		Toast.makeText(mContext, "���", 2000).show();
	}
	//�÷����ᱩ¶��javaScript
	public void showDialog(){
		Log.v("aa", "ִ�е���1111111");
		new AlertDialog.Builder(mContext).setTitle("�����Ի���").setPositiveButton("ȷ��", null).create().show();
	}
}

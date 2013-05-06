package com.bjh.webviewdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        //加载本地的html文件
        webView.loadUrl("file:///android_asset/test.html");
        //获取webView的设置对象
        WebSettings webSettings=webView.getSettings();
        //设置处理javaScript 的引擎
        webView.setWebChromeClient(new WebChromeClient());
        //开启JavaScript 调用
        webSettings.setJavaScriptEnabled(true);
        //将MyObject对象 暴露给javaScript，这样test.html页面中的javaScript
        //可以通过myObj调用MyObject 的方法
        webView.addJavascriptInterface(new MyObject(this), "myObj");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

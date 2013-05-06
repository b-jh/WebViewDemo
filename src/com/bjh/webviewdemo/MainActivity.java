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
        //���ر��ص�html�ļ�
        webView.loadUrl("file:///android_asset/test.html");
        //��ȡwebView�����ö���
        WebSettings webSettings=webView.getSettings();
        //���ô���javaScript ������
        webView.setWebChromeClient(new WebChromeClient());
        //����JavaScript ����
        webSettings.setJavaScriptEnabled(true);
        //��MyObject���� ��¶��javaScript������test.htmlҳ���е�javaScript
        //����ͨ��myObj����MyObject �ķ���
        webView.addJavascriptInterface(new MyObject(this), "myObj");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

package com;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.vito.teaapp.R;


/**
 * 自定义a面
 * 手写A面
 */
public class SlotsCasinoWeb extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView slotscasinoweb = findViewById(R.id.slotscasinoweb);
        slotscasinoweb.getSettings().setDomStorageEnabled(true);
        slotscasinoweb.getSettings().setJavaScriptEnabled(true);
        slotscasinoweb.getSettings().setAllowFileAccess(true);
        slotscasinoweb.loadUrl("file:///android_asset/17.html");
    }
}

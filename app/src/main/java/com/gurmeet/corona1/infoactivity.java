package com.gurmeet.corona1;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

import android.os.Bundle;

public class infoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoactivity);
        WebView webview1 = (WebView) findViewById(R.id.webview1);
        webview1.loadUrl("https://www.who.int/health-topics/coronavirus#tab=tab_1");
    }
}

package com.example.tajakhabar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FullNews extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_news_layout);

        String url = getIntent().getStringExtra("url");
        webView = findViewById(R.id.web_View);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set WebViewClient to handle page loading within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Load the URL
        if (url != null) {
            webView.loadUrl(url);
        }
    }

    @Override
    public void onBackPressed() {
        // If the WebView can go back, go back in the WebView; otherwise, finish the activity
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}



//
//package com.example.tajakhabar;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.webkit.WebSettings;
//import android.webkit.WebView;
//
//public class FullNews extends AppCompatActivity {
//
//    WebView webView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_full_news_layout);
//
//        String url = getIntent().getStringExtra("url");
//        webView = findViewById(R.id.web_View);
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.loadUrl(url);
//    }
//
//    public void onBackPressed(){
//        if(webView.canGoBack())
//            webView.goBack();
//        else
//            super.onBackPressed();
//    }
//}
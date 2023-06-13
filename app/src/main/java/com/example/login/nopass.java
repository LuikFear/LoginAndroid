package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.webkit.WebView;
import android.os.Bundle;

public class nopass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nopass);


        WebView myWebView = (WebView) findViewById(R.id.rick);
        myWebView.loadUrl("https://youtu.be/dQw4w9WgXcQ");





    }
}
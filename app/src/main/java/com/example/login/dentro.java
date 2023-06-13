package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dentro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentro);


        //webview page
        WebView trollWebView = (WebView) findViewById(R.id.urin);
        trollWebView.loadUrl("https://cdn.donmai.us/original/a8/b4/__lumine_hu_tao_aether_venti_tartaglia_and_7_more_genshin_impact_and_3_more_drawn_by_inanami27__a8b4982082537c5e2360f41c0a1ccac0.mp4");


    }

}
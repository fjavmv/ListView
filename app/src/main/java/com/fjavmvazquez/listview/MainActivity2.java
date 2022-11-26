package com.fjavmvazquez.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mWebView = findViewById(R.id.webvMusica);
        recuperarData();
    }

    public void recuperarData(){
        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("data");
        mWebView.loadUrl(data);
    }
}
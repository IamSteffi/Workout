package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Visor extends AppCompatActivity {
    WebView direccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor);

        direccion = (WebView) findViewById(R.id.wvb);
        String url = getIntent().getStringExtra("SitioWeb");
        direccion.setWebViewClient(new WebViewClient());
        direccion.loadUrl("http://"+url);
        direccion.getSettings().setJavaScriptEnabled(true);
        direccion.getSettings().setUseWideViewPort(true);
        direccion.getSettings().setDomStorageEnabled(true);
        direccion.getSettings().setLoadWithOverviewMode(true);
        }

    public void Cerrar(View view) {
        finish();
    }
}
package com.sozial.sozial;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fr1 extends Fragment {

    private WebView mWebView1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        mWebView1 = (WebView) rootView.findViewById(R.id.webView2);

        WebSettings webSettings = mWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView1.loadUrl("https://www.instagram.com/");
        mWebView1.setWebViewClient(new WebViewClient());
        mWebView1.setWebViewClient(new MyAppWebViewClient());

        return rootView;
    }
}

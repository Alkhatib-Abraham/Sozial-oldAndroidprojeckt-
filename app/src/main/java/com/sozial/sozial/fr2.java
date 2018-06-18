package com.sozial.sozial;

/**
 * Created by ibr12 on 11/08/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fr2 extends Fragment {


    private WebView mWebView2;

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        mWebView2 = (WebView) rootView.findViewById(R.id.webView2);

        WebSettings webSettings = mWebView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView2.loadUrl("https://twitter.com/");
        mWebView2.setWebViewClient(new WebViewClient());
        mWebView2.setWebViewClient(new MyAppWebViewClient());


        return rootView;
    }
}
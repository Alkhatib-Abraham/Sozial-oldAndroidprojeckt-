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
import android.widget.Toast;

public class fr extends Fragment {

    private WebView mWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

<<<<<<< HEAD
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        mWebView = (WebView) rootView.findViewById(R.id.webView1);
=======
      View v = inflater.inflate(R.layout.fragment_blank, container, false);

    mWebView = (WebView) v.findViewById(R.id.webView1);

>>>>>>> refs/heads/master
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.facebook.com/");
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.setWebViewClient(new WebViewClient());
            }
        });
        mWebView.setWebViewClient(new MyAppWebViewClient());
        return rootView;
    }
    public void f ()
    {


<<<<<<< HEAD
=======
       return v;
>>>>>>> refs/heads/master
    }
}

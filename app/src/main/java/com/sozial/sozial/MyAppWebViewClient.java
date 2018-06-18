package com.sozial.sozial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ibr12 on 11/08/2016.
 */
public class MyAppWebViewClient extends WebViewClient {

/*
    @Override
   public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("facebook.com")) {
            return false;
        }
        if(Uri.parse(url).getHost().endsWith("instagram.com")) {
            return false;
        }
        if(Uri.parse(url).getHost().endsWith("twitter.com")) {
            return false;
        }



        



            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
    */


    private Activity activity = null;
    private UrlCache urlCache = null;

    public WebViewClientImpl(Activity activity) {
        this.activity = activity;
        this.urlCache = new UrlCache(activity);

        this.urlCache.register("http://tutorials.jenkov.com/", "tutorials-jenkov-com.html",
                "text/html", "UTF-8", 5 * UrlCache.ONE_MINUTE);

    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.indexOf("jenkov.com") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {

        return this.urlCache.load(url);
    }




}
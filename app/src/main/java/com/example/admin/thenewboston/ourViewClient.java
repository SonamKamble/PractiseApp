package com.example.admin.thenewboston;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ADMIN on 24/04/2016.
 */
public class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}

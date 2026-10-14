package com.polymathwizard.marks;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    webView = new WebView(this);
    webView.setOverScrollMode(View.OVER_SCROLL_IF_CONTENT_SCROLLS);
    WebSettings settings = webView.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setDatabaseEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setAllowContentAccess(true);
    webView.setWebViewClient(new WebViewClient());
    webView.setWebChromeClient(new WebChromeClient());
    setContentView(webView);
    webView.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() {
    if (webView != null && webView.canGoBack()) webView.goBack(); else super.onBackPressed();
  }
}

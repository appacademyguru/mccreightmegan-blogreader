package android.mccreightm.blogreader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class BlogWebActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_web);

        Intent intent = getIntent();
        Uri blogUri = intent.getData();

        final WebView webView = (WebView)findViewById(R.id.webView);

        webView.loadUrl(blogUri.toString());

        final ProgressBar progressBar = (ProgressBar)findViewById(R.id.webprogressBar);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }
}

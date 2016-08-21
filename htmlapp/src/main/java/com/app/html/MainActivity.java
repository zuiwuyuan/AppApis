package com.app.html;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        initView();

        updateData();
    }


    private void initView() {

        final WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);

        settings.setDefaultTextEncodingName("UTF-8");

        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);

        settings.setBlockNetworkImage(true);

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                settings.setBlockNetworkImage(false);
            }
        });

        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
            }
        });
    }


    public void updateData() {

        try {

            AssetManager assetManager = getAssets();

            InputStream inputStream = assetManager.open("test.html");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int len = -1;
            byte[] buf = new byte[128];

            while ((len = inputStream.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            baos.flush();

            String body = baos.toString();
            System.out.println(body);


            String css = "<link rel=\"stylesheet\" href=\"file:///android_asset/css/iconfont.css\" type=\"text/css\">";

            String css1 = "<link rel=\"stylesheet\" href=\"file:///android_asset/css/body.css\" type=\"text/css\">";

            String html = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>" + css + css1 + "</head><body>" + body + "</body></html>";

            webView.loadDataWithBaseURL("x-data://base", html, "text/html", "UTF-8", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

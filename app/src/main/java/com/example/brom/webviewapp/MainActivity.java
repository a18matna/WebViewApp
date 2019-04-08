package com.example.brom.webviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private View.OnClickListener view;
    private WebView webView;
    // Create a private member variable that can hold our WebView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* This code is run when the App is created. Include code that creates your WebView */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //fab
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show(); */
                webView.loadUrl("http://wwwlab.iit.his.se/a18matna/Appdesign/Prototyp/prototyp1.html");
            }
        });


       /* action_setting.setOnClickListenet(new View.OnClickListener(){
        @Override
        public void onClick(View veiw) {


                                          }
                                          });*/
        //först lägger vi till ett webview element
        webView = findViewById(R.id.viewwindow);


        // vi gör
       //setContentView(webView);

        //webView.loadUrl("http://wwwlab.iit.his.se/a18matna/Appdesign/Prototyp/prototyp1.html");
       // webView.loadUrl("file:///android_asset/about.html");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            webView.loadUrl("file:///android_asset/about.html");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

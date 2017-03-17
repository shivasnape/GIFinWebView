package com.snape.shivichuhome.animatedhorse;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import static com.snape.shivichuhome.animatedhorse.R.id;
import static com.snape.shivichuhome.animatedhorse.R.layout;


public class MainActivity extends AppCompatActivity {

    Button btnStart, btnStop;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        //Casting
        btnStart = (Button) findViewById(id.btn1);
        btnStop = (Button) findViewById(id.btn2);
        wv = (WebView) findViewById(id.webView);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //load the gif file as a url
                wv.loadUrl("file:///android_asset/Animhorse.gif");
                wv.resumeTimers();

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.pauseTimers();
            }
        });

    }
}

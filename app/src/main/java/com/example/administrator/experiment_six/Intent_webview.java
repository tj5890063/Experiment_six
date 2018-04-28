package com.example.administrator.experiment_six;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Intent_webview extends AppCompatActivity {
       protected EditText editText;
       protected Button btn;
       protected String url;
       public static String NAME="value";
       protected WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_webview);
        inview();
        setListern();
    }

    private void setListern()
    {
          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  url = editText.getText().toString();
                  Intent intent = new Intent(Intent_webview.this, MainActivity_two.class);
                  intent.putExtra(NAME, url);
                  startActivity(intent);
              }
          });
    }

            private void inview() {
                editText = findViewById(R.id.edit_url);
                btn = findViewById(R.id.btn_url);


            }
        }
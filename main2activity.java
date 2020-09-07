package com.sh1r0.caffe_android_demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends Activity {
    private Button btnSelect,btweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnSelect = (Button) findViewById(R.id.button2);
        btweb = (Button) findViewById(R.id.button3);
        btnSelect.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        btweb.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),WebViewAct.class);
                startActivity(i);
            }
        });
    }
}

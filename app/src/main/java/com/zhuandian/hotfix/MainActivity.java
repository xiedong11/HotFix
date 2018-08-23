package com.zhuandian.hotfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        APP.msgDisplayListener = new APP.MsgDisplayListener() {
            @Override
            public void handle(final String msg) {
                System.out.println("---------------------"+msg);
            }
        };

        Toast.makeText(this, "---------------a----------------------", Toast.LENGTH_SHORT).show();
    }
}

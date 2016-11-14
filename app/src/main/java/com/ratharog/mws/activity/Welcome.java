package com.ratharog.mws.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.ratharog.mws.R;

/**
 * Created by rathaROG on 11/14/2016.
 */

public class Welcome extends Activity {

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.welcome);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(0xFF33B5E5);
        }


        loginButton = (Button) findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}

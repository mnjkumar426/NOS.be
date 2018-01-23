package com.example.sc61.websiteconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by sc61 on 10-Jan-18.
 */

public class ActivitySplash extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent(getApplicationContext(), EasyOnlineConverter.class);
                startActivity(intent);
                finish();
               /* if (!frontUser.isUser()) {

                    Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                    //intent.putExtra("isReg","1");
                    startActivity(intent);
                    finish();


                } else if (frontUser.getIsVarified() == 1) {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    //intent.putExtra("isReg", "0");
                    startActivity(intent);
                    finish();

                } else {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    //intent.putExtra("isReg", "0");
                    startActivity(intent);
                    finish();
                }*/

            }
        }, 4000);
    }
}

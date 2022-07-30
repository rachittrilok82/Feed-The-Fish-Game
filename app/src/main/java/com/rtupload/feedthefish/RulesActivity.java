package com.rtupload.feedthefish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                try{
                    sleep(4000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent mainIntent1=new Intent(RulesActivity.this,MainActivity.class);
                    startActivity(mainIntent1);

                }
            }
        };
        thread.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
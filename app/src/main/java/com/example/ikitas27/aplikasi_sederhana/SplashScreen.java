package com.example.ikitas27.aplikasi_sederhana;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.ikitas27.aplikasi_sederhana.MainActivity;
import com.example.ikitas27.aplikasi_sederhana.R;


@SuppressLint("Registered")
public class SplashScreen extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tvSplash = (TextView) findViewById(R.id.tvSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }

    public void Click(View view) {
        Intent intent = new Intent(SplashScreen.this,SplashScreen.class);
        startActivity(intent);
    }
}
package com.example.programmer.simplifyads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adslibrary.InterstitialByTaHa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.show_ads_buton);
        final InterstitialByTaHa interstitial = new InterstitialByTaHa(this,
                "ca-app-pub-3940256099942544/1033173712");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interstitial.show();
            }
        });


    }
}

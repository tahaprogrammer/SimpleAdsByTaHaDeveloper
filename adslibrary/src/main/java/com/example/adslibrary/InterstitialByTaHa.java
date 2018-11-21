package com.example.adslibrary;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialByTaHa {

    private InterstitialAd mInterstitialAd;

    public InterstitialByTaHa(Context context , String id) {

        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId(id);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void show() {

        if(mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }



    }





}

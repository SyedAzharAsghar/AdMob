package com.example.azhar.admob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import static com.example.azhar.admob.R.id.adView;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MobileAds.initialize(this,"ca-app-pub-5818966252923407~6079550519");
        MobileAds.initialize(this,  getResources().getString(R.string.banner_ad_unit_id));


        mAdView = (AdView)findViewById(adView);
//        mAdView.setAdListener(new ToastListener(this));
        AdRequest adRequest = new AdRequest.Builder()
        .addTestDevice("DF3AC08CDD630177F1719EF8950F138D")
        .build();

        mAdView.loadAd(adRequest);

    }

//    @Override
//    public void onPause() {
//        if (mAdView != null) {
//            mAdView.pause();
//        }
//        super.onPause();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (mAdView != null) {
//            mAdView.resume();
//        }
//    }
//
//    @Override
//    public void onDestroy() {
//        if (mAdView != null) {
//            mAdView.destroy();
//        }
//        super.onDestroy();
//    }
}

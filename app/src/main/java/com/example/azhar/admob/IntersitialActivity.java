package com.example.azhar.admob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class IntersitialActivity extends AppCompatActivity {

    private Button mShowButton;
    private InterstitialAd mInterstitial;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intersitial_ads);


        mShowButton = (Button) findViewById(R.id.showButton);
        mShowButton.setEnabled(false);
    }

    public void loadInterstitial(View unusedView) {
        mShowButton.setEnabled(false);
        mShowButton.setText(getResources().getString(R.string.interstitial_loading));

        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString(R.string.intersitial_as_unit_id));
        mInterstitial.setAdListener(new ToastListener(this) {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mShowButton.setText(getResources().getString(R.string.interstitial_show));
                mShowButton.setEnabled(true);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                super.onAdFailedToLoad(errorCode);
                mShowButton.setText(getErrorReason());
            }
        });

        AdRequest ar = new AdRequest.Builder().addTestDevice("DF3AC08CDD630177F1719EF8950F138D").build();
        mInterstitial.loadAd(ar);
    }

    public void showInterstitial(View unusedView) {
        if (mInterstitial.isLoaded()) {
            mInterstitial.show();
        }

        mShowButton.setText(getResources().getString(R.string.interstitial_not_ready));
        mShowButton.setEnabled(false);
    }
}

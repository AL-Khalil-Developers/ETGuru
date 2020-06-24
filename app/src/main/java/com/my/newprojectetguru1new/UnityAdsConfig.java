package com.my.newprojectetguru1new;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBanners;

public class UnityAdsConfig {
    //UnityAdsConfigDetails
    public static boolean TestModeON = false;                                  // Enable or Disable UnityAds
    public static String UnityAdsAppID = "3667861";                           // Unity Game/App ID
    public static String UnityInterstitialAdPlacement = "InterstitialAdID";       // Unity Interstitial Ad-Placement ID
    public static String UnityBannerAdPlacement = "BannerAdID";                   // Unity Banner Ad-Placement ID













    ///////////////////////// Don't Edit Anything Here /////////////////////////
    public static void loadAndShowUnityBannerAds(final Activity activity, final ViewGroup adContainer){
        if (UnityAds.isInitialized()){

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    final IUnityBannerListener bannerListener = new IUnityBannerListener() {
                        @Override
                        public void onUnityBannerLoaded(String s, View view) {
                            // When the banner content loads, add it to the view hierarchy:

                            if (view == null) {
                                Log.d("motya" , "Banner View is : Null");
                                return;
                            }
                            if (view.getParent() != null){
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            if (adContainer != null){
                                adContainer.removeAllViews();
                            }
                            adContainer.addView(view);
                            adContainer.invalidate();
                        }

                        @Override
                        public void onUnityBannerUnloaded(String s) {
                            // When the banner’s no longer in use, remove it from the view hierarchy:
                        }

                        @Override
                        public void onUnityBannerShow(String s) {

                        }

                        @Override
                        public void onUnityBannerClick(String s) {

                        }

                        @Override
                        public void onUnityBannerHide(String s) {

                        }

                        @Override
                        public void onUnityBannerError(String s) {

                        }
                    };
                    UnityBanners.setBannerListener(bannerListener);

                    UnityAds.initialize(activity,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);
                    UnityBanners.loadBanner(activity,UnityAdsConfig.UnityBannerAdPlacement);
                    UnityAds.load(UnityAdsConfig.UnityInterstitialAdPlacement);
                   /* Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                showUnityInterstitialAd(activity);
                            }
                        },3000);*/
                }
            },5000);
        }else {
            UnityAds.initialize(activity,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    final IUnityBannerListener bannerListener = new IUnityBannerListener() {
                        @Override
                        public void onUnityBannerLoaded(String s, View view) {
                            // When the banner content loads, add it to the view hierarchy:


                            if (view == null) {
                                Log.d("motya" , "Banner View is : Null");
                                return;
                            }
                            if (view.getParent() != null){
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            adContainer.removeAllViews();
                            adContainer.addView(view);
                            adContainer.invalidate();
                        }

                        @Override
                        public void onUnityBannerUnloaded(String s) {
                            // When the banner’s no longer in use, remove it from the view hierarchy:
                        }

                        @Override
                        public void onUnityBannerShow(String s) {

                        }

                        @Override
                        public void onUnityBannerClick(String s) {

                        }

                        @Override
                        public void onUnityBannerHide(String s) {

                        }

                        @Override
                        public void onUnityBannerError(String s) {

                        }
                    };
                    UnityBanners.setBannerListener(bannerListener);


                    /*UnityAds.initialize(activity,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);
                    UnityBanners.loadBanner(activity,UnityAdsConfig.UnityBannerAdPlacement);
                    UnityAds.load(UnityAdsConfig.UnityInterstitialAdPlacement);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                showUnityInterstitialAd(activity);
                            }
                        },3000);*/
                }
            },5000);
        }
    }

    public static void showUnityBannerAd(Activity activity,final ViewGroup adContainer){
        final IUnityBannerListener bannerListener = new IUnityBannerListener() {
            @Override
            public void onUnityBannerLoaded(String s, View view) {
                // When the banner content loads, add it to the view hierarchy:


                if (view == null) {
                    Log.d("khalil" , "Banner View is : Null");
                    return;
                }
                if (view.getParent() != null){
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                adContainer.removeAllViews();
                adContainer.addView(view);
                adContainer.invalidate();
            }

            @Override
            public void onUnityBannerUnloaded(String s) {
                // When the banner’s no longer in use, remove it from the view hierarchy:
            }

            @Override
            public void onUnityBannerShow(String s) {

            }

            @Override
            public void onUnityBannerClick(String s) {

            }

            @Override
            public void onUnityBannerHide(String s) {

            }

            @Override
            public void onUnityBannerError(String s) {

            }
        };
        UnityBanners.setBannerListener(bannerListener);
        UnityBanners.loadBanner(activity,UnityAdsConfig.UnityBannerAdPlacement);
    }

    public static void loadUnityInterstitialAd(){
        UnityAds.load(UnityInterstitialAdPlacement);
    }
    public static void showUnityInterstitialAd(Activity activity){
        if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)){
            UnityAds.show(activity,UnityAdsConfig.UnityInterstitialAdPlacement);
        }
    }


    public static void destroyUnityBannerAd(){
        UnityBanners.destroy();
    }
}
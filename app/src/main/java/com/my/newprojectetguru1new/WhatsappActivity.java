package com.my.newprojectetguru1new;

import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.webkit.*;

import java.util.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.webkit.WebView;

import com.unity3d.ads.UnityAds;

public class WhatsappActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private WebView webview1;
	private ViewGroup bannerAdContainer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		UnityAds.initialize(this,UnityAdsConfig.UnityAdsAppID,UnityAdsConfig.TestModeON);
		setContentView(R.layout.whatsapp);

		bannerAdContainer  = (LinearLayout) findViewById(R.id.bannerAdContainer);
		UnityAdsConfig.loadUnityInterstitialAd();
		UnityAdsConfig.loadAndShowUnityBannerAds(WhatsappActivity.this,bannerAdContainer);

		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	private void initializeLogic() {
		setTitle("Whatsapp Group ");
		webview1.loadUrl("https://etguru2.simdif.com/contact.html");
		SketchwareUtil.showMessage(getApplicationContext(), "Loading Please Wait !");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}

	@Override
	protected void onStart() {
		UnityAdsConfig.destroyUnityBannerAd();
		UnityAdsConfig.showUnityBannerAd(WhatsappActivity.this,bannerAdContainer);
		UnityAdsConfig.showUnityInterstitialAd(WhatsappActivity.this);
		super.onStart();
	}


	@Override
	protected void onResume() {
		UnityAdsConfig.showUnityBannerAd(WhatsappActivity.this,bannerAdContainer);
		super.onResume();
	}

	@Override
	protected void onDestroy() {
		UnityAdsConfig.destroyUnityBannerAd();
		super.onDestroy();
	}
}

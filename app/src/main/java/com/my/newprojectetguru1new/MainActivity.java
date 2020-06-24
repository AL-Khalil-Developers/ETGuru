package com.my.newprojectetguru1new;

import android.os.*;
import android.widget.*;
import android.util.*;

import java.util.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double rotation = 0;
	
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear18;
	private TextView _drawer_textview1;
	private Button _drawer_button14;
	private Button _drawer_button10;
	private Button _drawer_button15;
	private Button _drawer_button12;
	private Button _drawer_button13;
	private LinearLayout _drawer_linear19;
	private Button _drawer_button11;
	private Button _drawer_button16;
	
	private Intent i = new Intent();
	private Intent t = new Intent();
	private Intent shortnote = new Intent();
	private Intent books = new Intent();
	private Intent contact = new Intent();
	private Intent papers = new Intent();
	private Intent youtube = new Intent();
	private Intent marking = new Intent();
	private Intent onlineclasses = new Intent();
	private Intent start = new Intent();
	private Intent i2 = new Intent();
	private TimerTask timer;
	private Intent whatsapp = new Intent();
	private Intent facebook = new Intent();
	private Intent developer = new Intent();
	private Intent quiz = new Intent();
	private Intent questionbank = new Intent();
	private AlertDialog.Builder d;
	private Intent back = new Intent();
	private AlertDialog.Builder dialog;
	private Intent sms = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_button14 = (Button) _nav_view.findViewById(R.id.button14);
		_drawer_button10 = (Button) _nav_view.findViewById(R.id.button10);
		_drawer_button15 = (Button) _nav_view.findViewById(R.id.button15);
		_drawer_button12 = (Button) _nav_view.findViewById(R.id.button12);
		_drawer_button13 = (Button) _nav_view.findViewById(R.id.button13);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_button11 = (Button) _nav_view.findViewById(R.id.button11);
		_drawer_button16 = (Button) _nav_view.findViewById(R.id.button16);
		d = new AlertDialog.Builder(this);
		dialog = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				setTitle("Syllabus ");
				t.setClass(getApplicationContext(), TestActivity.class);
				startActivity(t);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				books.setClass(getApplicationContext(), BooksActivity.class);
				startActivity(books);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				papers.setClass(getApplicationContext(), PapersActivity.class);
				startActivity(papers);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				marking.setClass(getApplicationContext(), MarkingActivity.class);
				startActivity(marking);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shortnote.setClass(getApplicationContext(), ShortnoteActivity.class);
				startActivity(shortnote);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contact.setClass(getApplicationContext(), ContactActivity.class);
				startActivity(contact);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube.setClass(getApplicationContext(), YoutubeActivity.class);
				startActivity(youtube);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onlineclasses.setClass(getApplicationContext(), OnlineclassActivity.class);
				startActivity(onlineclasses);
			}
		});
		
		_drawer_button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				quiz.setClass(getApplicationContext(), QuizActivity.class);
				startActivity(quiz);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				whatsapp.setClass(getApplicationContext(), WhatsappActivity.class);
				startActivity(whatsapp);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				questionbank.setClass(getApplicationContext(), QuestionbankActivity.class);
				startActivity(questionbank);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				facebook.setClass(getApplicationContext(), FacebookActivity.class);
				startActivity(facebook);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				contact.setClass(getApplicationContext(), ContactActivity.class);
				startActivity(contact);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				developer.setClass(getApplicationContext(), DeveloperActivity.class);
				startActivity(developer);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sms.setAction(Intent.ACTION_VIEW);
				sms.setData(Uri.parse("smsto: +94714816485"));
				startActivity(sms);
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
	}
	private void initializeLogic() {
		i.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(i);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	private void _download_path (final String _file_path) {
		
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
	
}

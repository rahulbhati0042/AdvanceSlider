package com.advance.slider;

import com.advance.slider.fragment.Black;
import com.advance.slider.fragment.Blue;
import com.advance.slider.fragment.Green;
import com.advance.slider.fragment.Red;
import com.advance.slider.fragment.White;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView listViewleft;
	String arrayItem[];

public	SlidingDrawer slidingDrawer;
	int position;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listViewleft = (ListView) findViewById(R.id.content);
		arrayItem = getResources().getStringArray(R.array.list);
		listViewleft.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, arrayItem));
		slidingDrawer = (SlidingDrawer) findViewById(R.id.slidingDrawer);
		navigationPostion(0);
		listViewleft.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				if (slidingDrawer.isOpened()) {
					slidingDrawer.close();
					navigationPostion(arg2);
				}
			}
		});

	}

	public void navigationPostion(int position) {
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new White();
			
			break;
		case 1:
			fragment = new Red();

			break;
		case 2:
			fragment = new Black();

			break;
		case 3:
			fragment = new Green();

			break;
		case 4:
			fragment = new Blue();

			break;

		default:
			break;
			
		}
		if(fragment!=null)
		{
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, fragment).commit();
 
		}

	}

}

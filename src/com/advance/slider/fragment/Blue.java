package com.advance.slider.fragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.advance.slider.R;

public class Blue extends Fragment {
	TextView txt;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 View rootView = inflater.inflate(R.layout.fragment, container, false);
		 txt=(TextView)rootView.findViewById(R.id.txt);
         txt.setText("Blue");
         txt.setBackgroundColor(Color.BLUE);
			return rootView;
	}
}

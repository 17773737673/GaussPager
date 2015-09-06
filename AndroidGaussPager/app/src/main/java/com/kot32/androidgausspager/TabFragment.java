package com.kot32.androidgausspager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class TabFragment extends Fragment
{
	public static final String TITLE = "title";
	private String mTitle = "Defaut Value";
	private WebView webView;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		if (getArguments() != null)
		{
			mTitle = getArguments().getString(TITLE);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_tab, container, false);
		webView= (WebView) view.findViewById(R.id.sss);
		webView.loadUrl("http://www.zhihu.com");
		return view;

	}

	public static TabFragment newInstance(String title)
	{
		TabFragment tabFragment = new TabFragment();
		Bundle bundle = new Bundle();
		bundle.putString(TITLE, title);
		tabFragment.setArguments(bundle);
		return tabFragment;
	}

}

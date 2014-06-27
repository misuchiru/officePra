package com.example.office;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public abstract class BaseActivity extends Activity{

	Context CONTEXT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		init();
		setContentView(getLayoutId());
		findViewById();
		setListener();
		setView();
		doExtra();
	}
	
	public void init(){
		CONTEXT = this;
	}
	
	public abstract int getLayoutId();
	public abstract void findViewById();
	public abstract void setListener();
	public abstract void setView();	
	public abstract void doExtra();
}

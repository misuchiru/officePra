package com.example.office;

import android.widget.Adapter;
import android.widget.ListView;


public class Contract extends BaseActivity{
	
	private ListView lv;	
	private ContractAdapter adapter;
	

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.contract;
	}

	@Override
	public void findViewById() {
		// TODO Auto-generated method stub
		lv = (ListView) findViewById(R.id.contract_list);
		
		
	}

	@Override
	public void setListener() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doExtra() {
		// TODO Auto-generated method stub
		adapter = new ContractAdapter(getApplicationContext());
		lv.setAdapter(adapter);
	}

}

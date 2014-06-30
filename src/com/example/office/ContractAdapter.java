package com.example.office;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContractAdapter extends BaseAdapter {
	private String title[] = { "Apple", "Banana", "Cat", "Dog", "Eat" };
	private String subTitle[] = { "100", "200", "300", "400", "500" };
	private int[] contractImg = { R.drawable.ic_launcher,
			R.drawable.ic_launcher, R.drawable.ic_launcher,
			R.drawable.ic_launcher, R.drawable.ic_launcher };
	private LayoutInflater inflater;

	public ContractAdapter(Context context) {
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return title.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return title[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup root) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.contract_list, null);
		TextView tvTitle = (TextView) view.findViewById(R.id.contract_people_name);
		TextView tvSubTitle = (TextView) view.findViewById(R.id.contract_people);
		ImageView ivImg=(ImageView)view.findViewById(R.id.image_list);
		
		tvTitle.setText(title[position]);
		tvSubTitle.setText(subTitle[position]);
		ivImg.setImageResource(contractImg[position]);
		
		return view;
	}

}

package com.zhao.soga;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

public class MyAdapterClass  extends ArrayAdapter<MyClass>{
	int resources;
	public MyAdapterClass(Context context, int resource,
			int textViewResourceId, List<MyClass> objects) {
		super(context, resource, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		resources=resource;
	}


	public int getResources() {
		return resources;
	}

	public void setResources(int resources) {
		this.resources = resources;
	}


	LinearLayout newView;
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(newView==null){
			newView=new LinearLayout(getContext());
			String inflater=Context.LAYOUT_INFLATER_SERVICE;
			LayoutInflater li;
			li=(LayoutInflater)getContext().getSystemService(inflater);
			li.inflate(resources, newView,true);
		}
		else
		{
			newView=(LinearLayout)convertView;
			MyClass m=getItem(position);
			
		}
		return newView;
	}
	
	

}

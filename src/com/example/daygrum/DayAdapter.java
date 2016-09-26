package com.example.daygrum;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DayAdapter extends ArrayAdapter<Day> {
	
	private int resourceId;
	
	public DayAdapter(Context context, int textViewResourceId, List<Day> objects){
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Day day = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view=LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.dayImage = (ImageView) view.findViewById(R.id.day_image);
			viewHolder.dayName = (TextView) view.findViewById(R.id.day_name);
			view.setTag(viewHolder);
		}else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.dayImage.setImageResource(day.getImageId());
		viewHolder.dayName.setText(day.getName());
		return view;
	}
	
	class ViewHolder {
		
		ImageView dayImage;
		
		TextView dayName;
	}
}

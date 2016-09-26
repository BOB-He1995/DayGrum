package com.example.daygrum;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity<View> extends Activity {
	
	private List<Day> dayList = new ArrayList<Day>();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initDays();
		DayAdapter adapter = new DayAdapter(MainActivity.this, R.layout.day_item, dayList);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent,
				android.view.View view, int position, long id) {
				Day day = dayList.get(position);
				Toast.makeText(MainActivity.this, day.getName(), Toast.LENGTH_SHORT).show();
				String data = day.getName();
				Intent intent = new Intent(MainActivity.this, EditActivity.class);
				intent.putExtra("extra_data", data);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}

		});
	}

	private void initDays() {
		Day day1 = new Day("Day1",R.drawable.button);
		dayList.add(day1);
		Day day2 = new Day("Day2",R.drawable.button);
		dayList.add(day2);
		Day day3 = new Day("Day3",R.drawable.button);
		dayList.add(day3);
		Day day4 = new Day("Day4",R.drawable.button);
		dayList.add(day4);
		Day day5 = new Day("Day5",R.drawable.button);
		dayList.add(day5);
		Day day6 = new Day("Day6",R.drawable.button);
		dayList.add(day6);
		Day day7 = new Day("Day7",R.drawable.button);
		dayList.add(day7);
		Day day8 = new Day("Day8",R.drawable.button);
		dayList.add(day8);
		Day day9 = new Day("Day9",R.drawable.button);
		dayList.add(day9);
		Day day10 = new Day("Day10",R.drawable.button);
		dayList.add(day10);
		Day day11 = new Day("Day11",R.drawable.button);
		dayList.add(day11);
		Day day12 = new Day("Day12",R.drawable.button);
		dayList.add(day12);
		Day day13 = new Day("Day13",R.drawable.button);
		dayList.add(day13);
		Day day14 = new Day("Day14",R.drawable.button);
		dayList.add(day14);
		Day day15 = new Day("Day15",R.drawable.button);
		dayList.add(day14);
		Day day16 = new Day("Day16",R.drawable.button);
		dayList.add(day16);
		Day day17 = new Day("Day17",R.drawable.button);
		dayList.add(day17);
		Day day18 = new Day("Day18",R.drawable.button);
		dayList.add(day18);
		Day day19 = new Day("Day19",R.drawable.button);
		dayList.add(day19);
		Day day20 = new Day("Day20",R.drawable.button);
		dayList.add(day20);
		Day day21 = new Day("Day21",R.drawable.button);
		dayList.add(day21);
		Day day22 = new Day("Day22",R.drawable.button);
		dayList.add(day22);
		Day day23 = new Day("Day23",R.drawable.button);
		dayList.add(day23);
		Day day24 = new Day("Day24",R.drawable.button);
		dayList.add(day24);
		Day day25 = new Day("Day25",R.drawable.button);
		dayList.add(day25);
		Day day26 = new Day("Day26",R.drawable.button);
		dayList.add(day26);
		Day day27 = new Day("Day27",R.drawable.button);
		dayList.add(day27);
		Day day28 = new Day("Day28",R.drawable.button);
		dayList.add(day28);
		Day day29 = new Day("Day29",R.drawable.button);
		dayList.add(day29);
		Day day30 = new Day("Day30",R.drawable.button);
		dayList.add(day30);
		// TODO Auto-generated method stub		
	}
}

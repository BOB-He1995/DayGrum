package com.example.daygrum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends Activity {
	
	private EditText type;
	String data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.edit);
		Intent intent = getIntent();
		data = intent.getStringExtra("extra_data");
		Log.d("EditActivity", data);
		type = (EditText) findViewById(R.id.edit_text);
		String inputText = load();
		if (!TextUtils.isEmpty(inputText)) {
			type.setText(inputText);
			type.setSelection(inputText.length());
			Toast.makeText(this, "Restoring succeeded", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		String inputText = type.getText().toString();
		save(inputText);
	}
	
	public void save(String inputText) {
		FileOutputStream out = null;
		BufferedWriter writer = null;
		try {
			out = openFileOutput(data, Context.MODE_PRIVATE);
			writer = new BufferedWriter(new OutputStreamWriter(out));
			writer.write(inputText);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer !=null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String load() {
		FileInputStream in = null;
		BufferedReader reader = null;
		StringBuilder content = new StringBuilder();
		try {
			in = openFileInput(data);
			reader = new BufferedReader(new InputStreamReader(in));
			String line="";
			while ((line = reader.readLine()) !=null) {
				content.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader !=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content.toString();
	}
}

package com.example.daygrum;

public class Day {
	
	private String name;
	
	private int imageId;
	
	
	public Day(String name, int imageId){
		this.name = name;
		this.imageId = imageId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public int getImageId(){
		return imageId;
	}
}

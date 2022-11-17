package com.example.springbootrestwdemo.model;

public class User {

	
	String to;
	String from;
	Integer toc;
	
	String TypeOfCab;
	String typeOfCab;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	//Integer toc;
	//setToc(1) = new String("luxury car"); 
	//setToc(2) = new String("ordinary car");		
	
	
		    //toc 1 = new toc();
		    //1.setName("Luxury"); // Set the value of the name variable to "Luxury"
		    //System.out.println(myObj.gettoc());






	public User(String typeOfCab) {
		this.typeOfCab = typeOfCab;
	}










	public String getTypeOfCab() {
		return TypeOfCab;
	}



	public void setTypeOfCab(String typeOfCab) {
		TypeOfCab = typeOfCab;
	}



	public Integer getToc() {
		return toc;
	}



	public User(String to, String from, Integer toc) {
		this.to = to;
		this.from = from;
		this.toc = toc;
	}



	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Integer gettoc() {
		return toc;
	}
	public void setToc(Integer toc) {
		this.toc = toc;
	}
	@Override
	public String toString() {
		return "User [to=" + to + ", from=" + from + ", typeOfCab=" + toc + "]";
	}



}

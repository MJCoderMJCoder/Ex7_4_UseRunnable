package com.userunnable;

class Student {
	String Name;
	
	public Student(String Name) {
		this.Name = Name;
	}
	
	public void printInformation() {
		System.out.println("我是一名大学生！我叫" + this.Name);
	}
}

package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparable<Student>{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		if(this.roll== o.roll){
			return this.name.compareTo(o.name);
		}return this.roll-o.roll;
	}
}
public class Compare {
	public static void main(String[] args) {
	ArrayList<Student> ar=new ArrayList<>();
	ar.add(new Student(10,"ranu"));
	ar.add(new Student(11,"rash"));
	ar.add(new Student(11,"raan"));
	ar.add(new Student(9,"preeti"));
	Comparator<Student> ob=new Comparator<Student>(){
     @Override
		public int compare(Student o1, Student o2) {
			if(o1.getRoll()>o2.getRoll()) return 1;
			else if(o1.getRoll()<o2.getRoll()) return -1;
			else return o1.getName().compareTo(o2.getName());
		}
	};   
	Collections.sort(ar,ob);
	for(Student s:ar){
		System.out.println(s.name + " "+s.roll);
	}
	
	
	}

}

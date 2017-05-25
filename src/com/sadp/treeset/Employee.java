package com.sadp.treeset;

public class Employee implements Comparable<Employee>{
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Employee(String name) {
	super();
	this.name = name;
}


@Override
public int compareTo(Employee o) {
	
	return this.getName().compareTo(o.getName());
}


}

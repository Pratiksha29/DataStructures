package com.sadp.treeset;

import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeTreeSetImple {
public static void main(String[] args) {
	Employee  emp1=new Employee("Ram");
	Employee emp2=new Employee("Shyam");
	Employee  emp3=new Employee("hari");
	TreeMap map=new TreeMap(String.CASE_INSENSITIVE_ORDER);
	
	map.put(emp1.getName(), emp1);
	
	map.put(emp2.getName(), emp2);
	
	map.put(emp3.getName(), emp3);
	
	System.out.println(map);
 }
}

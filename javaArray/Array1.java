package javaArray;

import java.util.ArrayList;
import java.util.List;

import List.Student;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------Array-----------");
		int arrays[] = new int[5];
		
		arrays[0] = 20;
		arrays[1] = 30;
		arrays[2] = 40;
		arrays[3] = 50;
		arrays[4] = 60;
		
		for(int value: arrays)
		{
			System.out.println(value);
		}
		System.out.println("---------Collection-----------");
		
		List values = new ArrayList();
		
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		values.add(new Student()); //We can also add object in the list
		
		for(Object value: values)
		{
			System.out.println(value);
		}
		
		System.out.println("---------Rempve-----------");
		values.remove(3);
		for(Object value: values)
		{
			System.out.println(value);
		}
		
		System.out.println("--------Add------------");
		values.add("Hello");
		for(Object value: values)
		{
			System.out.println(value);
		}
		
		System.out.println(arrays.length);
		//System.out.println(values.size);
	}

}

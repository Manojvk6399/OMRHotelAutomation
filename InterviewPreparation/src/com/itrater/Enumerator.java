package com.itrater;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Enumerator {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(10);
		v.add(20);
		System.out.println(v);
		Enumeration<Integer> elements = v.elements();
		while (elements.hasMoreElements()) {
			Integer integer = (Integer) elements.nextElement();
			System.out.println(integer);

		}
//			Iterator<Integer> iterator = v.iterator();
//			while (iterator.hasNext()) {
//				Integer integer = (Integer) iterator.next();
//				System.out.println(integer);
//				if (integer==40) {
//					iterator.remove();
//				}
//			}
//			System.out.println(v);
			
//		ListIterator<Integer> listIterator = v.listIterator();
//		while (listIterator.hasNext()) {
//			Integer integer = (Integer) listIterator.next();
//			System.out.println(integer);
//			if (integer==40) {
//				listIterator.remove();
//			}
//			
//		}
//		System.out.println("After Removing");
//		for (Integer integer : v) {
//			System.out.println(integer);
//		}
//		System.out.println(v);
			}
		}
	



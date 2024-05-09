package javabasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		
		
		long alStartTime = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			al.add("ArrayList"+i);
		}
		long alEndTime = System.currentTimeMillis();
		
		
		long alStartTime2 = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			al.add("ArrayList"+i);
		}
		long alEndTime2 = System.currentTimeMillis();
		
		long llStartTime = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			ll.add("LinkedList"+i);
			System.out.println("LinkedList"+i);
		}
		long llEndTime = System.currentTimeMillis();
		
		long llStartTime2 = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			ll.add("LinkedList"+i);
			System.out.println("LinkedList"+i);
		}
		long llEndTime2 = System.currentTimeMillis();
		
		System.out.println("al add"+(alEndTime - alStartTime));
		System.out.println("al get"+(alEndTime2 - alStartTime2));
		System.out.println("ll add"+(llEndTime - llStartTime));
		System.out.println("ll get"+(llEndTime2 - llStartTime2));
		
		
		
	}//main
}//class












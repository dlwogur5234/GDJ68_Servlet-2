package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		//ArrayList
		//배열기반
		ArrayList ar = new ArrayList();
		//autoboxing
		ar.add(1);
		ar.add(3.1);
		ar.add("test");
		//ar.add(1, "add");
		//ar.set(0, "first");
		//ar.remove(0);
		//ar.remove("test");
		//ar.clear();
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		int num = (Integer)ar.get(0);
		
//		HashSet hs = new HashSet();
//		hs.add(1);
//		hs.add(2);
//		hs.add("f1");
//		hs.add(2);
//		hs.size();
//		System.out.println(hs);
//		System.out.println(hs.size());
		
//		ListStudy listStudy = new ListStudy();
//		listStudy.ex1();

	}

}

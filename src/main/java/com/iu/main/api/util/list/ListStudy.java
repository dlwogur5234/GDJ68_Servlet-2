package com.iu.main.api.util.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import com.iu.main.bankBook.BankBookDTO;

public class ListStudy {
	
	public void s1() {
		//<> Generic
		//E  Element : 변수
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(2);
		
		
		int num = ar.get(0);
		
	}
	
	public void ex1() {
		Random random = new Random();
		HashSet hs = new HashSet();
		while(hs.size() != 6) {
			hs.add(random.nextInt(44)+1);	
		}
//		for(int i=0;i>-1;i++) {
//			hs.add(random.nextInt(44)+1);
//			if(hs.size()==6) {
//				break;
//			}
//		}
		System.out.println(hs);
	}

}

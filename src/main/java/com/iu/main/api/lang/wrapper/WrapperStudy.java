package com.iu.main.api.lang.wrapper;

import java.util.Scanner;

import com.iu.main.bankBook.BankBookDTO;

public class WrapperStudy {
	
	public void s1() {
		String str="청약저축-5.2-1";
		String [] datas = str.split("-");
		
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName(datas[0]);
		bankBookDTO.setBookRate(Double.parseDouble(datas[1]));
		bankBookDTO.setBookSale(Integer.parseInt(datas[2]));
		
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		//String jumin=sc.next();
		String jumin="951223-2234567";
		//1. 남녀 구분
		char ch = jumin.charAt(7);
		
		int num=Integer.parseInt(String.valueOf(ch));
		if(num%2==0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		
//		String s = jumin.substring(7, 8);
//				
//		if(s.equals("1") || s.equals("3")) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
		//2. 나이
		String year = jumin.substring(0,2);
		int myBirth=0;
		if(num==1 ||num==2) {
			myBirth=1900+Integer.parseInt(year);
		}else {
			myBirth=2000+Integer.parseInt(year);
		}
		System.out.println("Age : "+(2023-myBirth));
		
		//3. 3-5 :봄, 6-8:여름, 9-11:가을, 12-2:겨울
		String month = jumin.substring(2,4);
		int m = Integer.parseInt(month);
		if(m>=3&&m<=5) {
			System.out.println("봄");
		}else if(m>=6&&m<=8){
			System.out.println("여름");
		}else if(m>=9&&m<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		String jumin="951226-1234567";
		int num=2;
		int sum=0;
		for(int i=0;i<jumin.length()-1;i++) {
			char ch = jumin.charAt(i);
			
			if(ch=='-') {
				continue;
			}
			
			if(num>9) {
				num=2;
			}
			
			System.out.println(ch*2);//18:114
			
			sum=sum+Integer.parseInt(String.valueOf(ch))*num;
			num++;
			System.out.println("Sum :"+sum);
			
			
			
			
//			String d = jumin.substring(i, i+1);
//			if(d.equals("-")) {
//				continue;
//			}
			
		}
		
		sum=sum%11;
		
		if(sum>9) {
			sum=sum%10;
		}
		
		int check=Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		if(sum==check) {
			System.out.println("올바른 번호");
		}else {
			System.out.println("잘못된 번호");
		}
		
		
//		char [] jumins=jumin.toCharArray();
//		for(int i=0;i<jumins.length;i++) {
//			System.out.println(jumins[i]);
//		}
		
		
	}

}

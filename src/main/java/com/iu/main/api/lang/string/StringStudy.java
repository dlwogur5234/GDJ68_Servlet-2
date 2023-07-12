package com.iu.main.api.lang.string;

import java.util.Scanner;

public class StringStudy {

	private Scanner sc;
	
	public StringStudy() {
		sc = new Scanner(System.in);
	}
	
	public void s1() {
		//문자열
		// length()
		// indexOf()
		// lastIndexOf()
		String str = "Hello World";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		int ch=str.indexOf("W"); //int ch(char)
		System.out.println("Ch : "+ch);
		ch = str.indexOf("H", 4);
		
		str="iu.winter.suji.jpg";
		str.lastIndexOf(".");
		
	}
	
	public void s2() {//파싱, 전처리
		//split()
		//replace()
		
		String data="서울 비 대구 눈-광주 맑음,부산,우박,제주,안개";
		
		 data = data.replace(" ", ",");
		 data = data.replace("-", ",");
		
		String [] datas = data.split(",");
		
		for(int i=0;i<datas.length;i++) {
			System.out.println(datas[i]);
		}
		
	}
	
	public void s3() {
		String str="iu.suji.winter.jpg";
		
		//begin 이상 end 미만
		str =str.substring(str.lastIndexOf(".")+1);
		
		System.out.println(str);
		
		str=String.valueOf(2);
		
	}
	
	public void ex1() {
		//파일명.확장자 abc.gif
		//확장자가 jpg면 이미지파일 출력
		//확장자가 doc면 문서파일 출력
		//확장자가 mp3면 오디오파일 출력
		//그외   알수없는 파일 형식 출력
		
	}
	
	public void ex2() {
		//파일명.확장자 abc.gif
		//확장자가 jpg,jpeg,png,gif면 이미지파일 출력
		//확장자가 doc,txt,hwp면 문서파일 출력
		//확장자가 mp3, wav, midi, pcm 면 오디오파일 출력
		//그외   알수없는 파일 형식 출력
		//return;
		
	}
	
	
	
	
}

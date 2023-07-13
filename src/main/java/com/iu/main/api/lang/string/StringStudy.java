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
		System.out.println("파일명 입력");
		String fileName = sc.nextLine();
		System.out.println(fileName);
	
		//2가지, 1) split, subString
//		int index = fileName.lastIndexOf(".");
//		fileName.substring(index);
		
		fileName=fileName.substring(fileName.lastIndexOf(".")+1);
		//fileName = fileName.toLowerCase();
		//fileName.equals("jpg");
		
		if(fileName.toLowerCase().equals("jpg")) {
			System.out.println("이미지");
		}else if(fileName.equals("doc")) {
			System.out.println("문서");
		}else if(fileName.equals("mp3")) {
			System.out.println("음악");
		}else {
			System.out.println("알수 없음");
		}
		
		
		
	}
	
	public void ex2() {
		//파일명.확장자 abc.gif
		//확장자가 jpg,jpeg,png,gif면 이미지파일 출력
		//확장자가 doc,txt,hwp면 문서파일 출력
		//확장자가 mp3, wav, midi, pcm 면 오디오파일 출력
		//그외   알수없는 파일 형식 출력
		//return;
		String fileName="abc.jpg";
		
		String [] images= {"jpg", "jpeg", "png", "gif"};
		String [] docs = {"doc","txt","hwp"};
		
		fileName=fileName.substring(fileName.lastIndexOf(".")+1);
	
		for(int i=0;i<images.length;i++) {
			if(fileName.equals(images[i])) {
				
				return;
			}
		}	
		
		for(int i=0;i<docs.length;i++) {
			if(fileName.equals(docs[i])) {
				
				return;
			}
		}
		
		System.out.println("알수 없는 파일");
	}
	
	
	
	
}

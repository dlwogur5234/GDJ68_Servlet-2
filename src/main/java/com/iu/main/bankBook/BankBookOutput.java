package com.iu.main.bankBook;

public class BankBookOutput {
	
	public void view(BankBookDTO bankBookDTO) {
		System.out.println("BookNum : "+bankBookDTO.getBookNum());;
		System.out.println("BookName : "+bankBookDTO.getBookName());;
		System.out.println("BookRate : "+bankBookDTO.getBookRate());;
		System.out.println("BookSale : "+bankBookDTO.getBookSale());;
		
	}
	
	public void view(String str) {
		System.out.println("======== "+str+" =========");
	}

}

package com.iu.main;

import com.iu.main.bankBook.BankBookController;
import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.bankBook.BankBookInput;
import com.iu.main.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		try {
			BankBookController bankBookController = new BankBookController();
			bankBookController.start();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

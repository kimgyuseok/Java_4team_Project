package com.java.project.mart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SellManagement {
	
	private static Scanner scan;
	
	static {
		
		scan = new Scanner(System.in);
		
	}
	
	public SellManagement() throws Exception {
		
		boolean loop = true;
		
		while (loop) {
		
			sellMenu();
			
			System.out.print("ìë ¥: ");
			Scanner scan = new Scanner(System.in);
			
			String input = scan.nextLine();
			
			if (input.equals("1")) {
				
				total();
			} else if (input.equals("2")) {
				
				cash();
			} else if (input.equals("3")) {
				
				card();
			} else if (input.equals("4")) {
				
				System.out.println();
				loop = false;
			} else {
				
				System.out.println();
				System.out.println("ð¥ ì¬ë°ë¥¸ ë²í¸ë¥¼ ìë ¥í´ì£¼ì¸ì. ð¥");
				System.out.println();
			}
		}
		
	}

	private void sellMenu() {
		
		System.out.println();
		System.out.println("ë¬´ìì ì¶ë ¥íìê² ìµëê¹?");
		System.out.println();
		System.out.println("âââââââââââââââââ");
		System.out.println("1. ì´ ë§¤ì¶ ì¶ë ¥");
		System.out.println("2. íê¸ ë§¤ì¶ ì¶ë ¥");
		System.out.println("3. ì¹´ë ë§¤ì¶ ì¶ë ¥");
		System.out.println("4. ë¤ë¡ê°ê¸°");
		System.out.println("âââââââââââââââââ");
		System.out.println(
				"ï¿£ï¿£ï¿£ï¿£ï¿£ï¼¼ï¼ï¿£ï¿£ï¿£ï¿£\r\n"
				+ "ãããã â§ï¼¿â§ãããã\r\n"
				+ "ãããï¼Â´ã»Ïã»ï¼ ã\r\n"
				+ "ãï¼¿ï¼¿_(ã£ æ¦oï¼¿ï¼¿\r\n"
				+ "ã|lï¿£l||ï¿£ãï¾ãï¾ï¿£|i\r\n"
				+ "");
		System.out.println();
		
	}

	private void card() throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader(Path.PAYMENTLISTDIR));
		
		String line = null;
		int cardSum = 0;
		
		while ((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			if (temp[6].equals("ì¹´ë")) {
				
				cardSum += Integer.parseInt(temp[4]);
				
			}
			
		}
		System.out.println("ââââââââââââââââââââââââââââ");
		System.out.println();
		System.out.printf("ì¹´ë ë§¤ì¶ ë´ì­: %,dì\r\n", cardSum);
		
		System.out.println("ââââââââââââââââââââââââââââ");
		
		reader.close();
		
		turnback();
		
	}

	private void cash() throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader(Path.PAYMENTLISTDIR));
		
		String line = null;
		int cashSum = 0;
		
		while ((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			if (temp[6].equals("íê¸")) {
				
				cashSum += Integer.parseInt(temp[4]);
				
			}
			
		}
		
		System.out.println("ââââââââââââââââââââââââââââ");
		System.out.println();
		System.out.printf("íê¸ ë§¤ì¶ ë´ì­: %,dì\r\n", cashSum);
		
		System.out.println("ââââââââââââââââââââââââââââ");
		
		reader.close();
		
		turnback();
		
	}

	private void total() throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader(Path.PAYMENTLISTDIR));
		
		String line = null;
		int totalSum = 0;
		
		while ((line = reader.readLine()) != null) {
			
			String[] temp = line.split(",");
			
			totalSum += Integer.parseInt(temp[4]);
			
		}
		
		System.out.println("ââââââââââââââââââââââââââââ");
		System.out.println();
		System.out.printf("ì´ ë§¤ì¶ ë´ì­: %,dì\r\n", totalSum);
	
		System.out.println("ââââââââââââââââââââââââââââ");
		
		reader.close();
		
		turnback();
		
	}

	private void turnback() {
		
		boolean loop = true;
		
		while (loop) {
		
			
			System.out.println();
			System.out.println("0. ë¤ë¡ê°ê¸°");
			
			System.out.println();
			System.out.print("ìë ¥: ");
			String back = scan.nextLine();
			
			if (back.equals("0")) {
				
				System.out.println();
				loop = false;
			} else {
				
				System.out.println();
				System.out.println("ð¥ ì¬ë°ë¥¸ ë²í¸ë¥¼ ìë ¥í´ì£¼ì¸ì. ð¥");
				System.out.println();
			}
			
		}
		
		
	}

}//ë§¤ì¶ê´ë¦¬
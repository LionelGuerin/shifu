package com.nenel.shifu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Shifu !");
		Boolean continu = true;
		while (continu) {
			System.out.println("");
			System.out.println("Play (n/o)?");
			String again = "";
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    try {
				again = bufferRead.readLine().toLowerCase();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    continu = again.contains("n") ? false : true;
		    if(continu){
		    	String result = start();
				System.out.println("");
				System.out.printf("You %s", result);
		    }else{
		    	System.out.println("Bye");
		    	System.exit(0);
		    }
		}
		
	}

	public static String start(){
		System.out.println("Enter C / P / F");
		String player = "";
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    try {
			player = bufferRead.readLine().toLowerCase();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    double nbcomputer = Math.random();
	    System.out.println(nbcomputer);
	    String computer = nbcomputer < 0.64 && nbcomputer > 0.34 ? "p" : nbcomputer < 0.34 ? "c" : "f";
	    
	    System.out.printf("computer %s", computer);
		int intresult = compareResult(player , computer);
		String result = (intresult == 1) ? "win" : (intresult == -1) ? "loose" : "make an egality";
		result = (intresult == 666) ? "try to bug" : result;
		
		return result;
	}
	
	public static int compareResult(String player, String computer) {
		int result = 0;
		if (player.contains("p")) {
			result = (computer.contains("c")) ? 1 : (computer.contains("f")) ? -1 : 0;
		} else if (player.contains("c")) {
			result = (computer.contains("f")) ? 1 : (computer.contains("p")) ? -1 : 0;
		} else if (player.contains("f")) {
			result = (computer.contains("p")) ? 1 : (computer.contains("c")) ? -1 : 0;
		} else {
			result = 666;
		}
		return result;
	}
	
}
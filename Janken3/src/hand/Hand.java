package hand;

import java.util.Random;
import java.util.Scanner;

public class Hand{

	private static Scanner scanner;

	public static void hand(String[] args) {

	     //（COM）手の形をランダムに表示させる
	       Random r = new Random();
	       int pcNum = r.nextInt(3);
	        System.out.println("手の形を（数値で）入力してください");
	       
	        
	       scanner = new Scanner(System.in);
		int playerNum = scanner.nextInt();
		
	}
	
	}
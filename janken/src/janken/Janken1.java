package janken;

import java.util.Random;
import java.util.Scanner;


public class Janken1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
	//勝敗数
	int Win = 0;
	
	
	 //開始
		
       for(int i =1; i<=10; i++) {
       System.out.println("");
       System.out.println("【"+i+"回戦目】");
       
       System.out.println("-------------------");
       System.out.println("0:グー");
       System.out.println("1:チョキ");
       System.out.println("2:パー");
       System.out.println("-------------------");
       
       
      //（COM）手の形をランダムに表示させる
       Random r = new Random();
       int pcNum = r.nextInt(3);
        System.out.println("手の形を（数値で）入力してください");
       
        
       scanner = new Scanner(System.in);
	int playerNum = scanner.nextInt();
       
       //勝ち
       if(pcNum == 0 && playerNum == 2 || 
          pcNum == 1 && playerNum == 0 || 
          pcNum == 2 && playerNum == 1 ) {
        
    	if(pcNum == 0) {
    		System.out.println("");
    		System.out.println("あなた：パー vs COM:グー");
    	}else if(pcNum == 1) {
    		System.out.println("");
    		System.out.println("あなた：グー vs COM:チョキ");
    	}else {
    		System.out.println("");
    		System.out.println("あなた：チョキ vs COM:パー");
    	}
    	System.out.println("あなたの勝ち！");
    	Win ++ ;
    
    	
    	//負け
       }
    	else if (pcNum == 0 && playerNum == 1||
    		 pcNum == 1 && playerNum == 2||
    		 pcNum == 2 && playerNum == 0) {
    	   
        	if(pcNum == 0) {
        		System.out.println("");
        		System.out.println("あなた：チョキ vs COM:グー");
        	}else if(pcNum == 1) {
        		System.out.println("");
        		System.out.println("あなた：パー vs COM:チョキ");
        	}else {
        		System.out.println("");
        		System.out.println("あなた：グー vs COM:パー");

        
       	
        	} System.out.println("あなたの負け!");
    	}
       //引き分け
       else {
       	   
           	if(pcNum == 0) {
           		System.out.println("");
           		System.out.println("あなた：グー vs COM:グー");
           	}else if(pcNum == 1) {
           		System.out.println("");
           		System.out.println("あなた：チョキ vs COM:チョキ");
           	}else {
           		System.out.println("");
           		System.out.println("あなた：パー vs COM:パー");
           	}

          	System.out.println("引き分け");
       }
    	
      
          	
          	
          	
       } 
    		   
       if (Win==0) {
    	   System.out.println("0勝");
       }
       else if(Win<=3) {
           System.out.println("1^3勝");
       }
       else if(Win<=7) {
    	   System.out.println("4^7勝") ;
       }
	   else if(Win<=9) {
 	   System.out.println("8^9勝") ;
    }
	   else {
		   System.out.println("10勝");
	   }
	
	
	}
}




package hellow;

import java.util.Scanner;

public class hellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ");
		Scanner in =new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
		int price=0;
	    int amount=100;
	    System.out.println("��������:");
	    
        amount=in.nextInt();
//	    System.out.println(price);
        
		System.out.print("������Ʊ��");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
		

	}
} 
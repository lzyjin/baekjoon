package no2292;

import java.util.Scanner;

public class Hive {

	public static void main(String[] args) {
		
		System.out.print("입력값 : ");
		
		int input = new Scanner(System.in).nextInt();
		
		
		int result = new Hive().func(input);
		
		System.out.println("결과값 : " + result);
	}
	 
	// 1 
	// 2 7 
	// 8 19 
	// 20 37 
	
	public int func(int num) {
		
		int result = 0;
		int min = 0;
		int max = 0;
		
		if(num == 1) {
			result = 1;
		} else {
			for(int i=0; i < 1000000000; i++) {
				min += 1+(6*i);
				max = min + 6*(i+1)-1;
				if(num >= min && num <= max) {
					result = i+2;
					break;
				}
				
			}
		}
		
		return result;
		
	}

}

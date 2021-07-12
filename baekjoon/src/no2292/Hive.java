package no2292;

import java.util.Scanner;

public class Hive {

	public static void main(String[] args) {
		
		System.out.print("방번호를 입력하세요 : ");
		
		int input = new Scanner(System.in).nextInt();
		
		
		int result = new Hive().func(input);
		
		System.out.println("최소 " + result + "개의 방을 지납니다");
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

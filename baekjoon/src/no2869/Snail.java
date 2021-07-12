package no2869;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("올라가자 : ");
		int a = scanner.nextInt();
		System.out.print("내려가자 : ");
		int b = scanner.nextInt();
		System.out.print("높이 : ");
		int v = scanner.nextInt();
		
		if(1 <= b && b < a && a <= v && v <= 1000000000) {
			
				for(int day=1;; day++) {
					
					if(a*day + -b*(day-1) >= v) {
						
						System.out.println(v + "m를 올라가는데 " + day + " 일이 걸린다");
						return;
						
					}
				}
			
		}
		
		
	}

}

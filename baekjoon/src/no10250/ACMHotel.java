package no10250;

import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 테스트데이터 수 ( 반복수 ) 
		System.out.print("테스트데이터 수 : ");
		int t = scanner.nextInt();
		
		for(int i=0; i < t; i++) {
			
			// 호텔의 층 수 
			System.out.print("호텔의 층 수 : ");
			int h = scanner.nextInt();
			
			// 각 층의 방 수 
			System.out.print("각 층의 방 수 : ");
			int w = scanner.nextInt();
			
			// 몇번째 손님인지 
			System.out.print("몇번째 손님 : ");
			int n = scanner.nextInt();
			
			// 방번호
			int roomNo = 0;
			
			if(h >=1 && w >= 1 && h <= 99 && w <= 99 && n >= 1 && n <= h*w) {
				
				if(n%h != 0) {
					roomNo = (n%h)*100 + (n/h)+1; 
				} else {
					roomNo = h*100 + n/h;
				}
				System.out.println(n + "번째 손님은 " + roomNo + "번 방에 배정된다");
				System.out.println("-----------------------------------------");
			}
		}
		
		
	}

}

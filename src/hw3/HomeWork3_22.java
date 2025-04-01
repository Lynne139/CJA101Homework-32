package hw3;

import java.util.Scanner;

public class HomeWork3_22 {
	public static void main(String[] args) {			
//		進階
//		1.產生一個介於0-100之間的亂數
		int game2 = (int)(Math.random() * 101);
		
//		2.讓使用者可以輸入數字並確認是否為整數
		Scanner sc2 = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		
		
//		3.比對數字是否相等
		while(true) {
			if (sc2.hasNextInt()) {
				int i = sc2.nextInt();
				if(i >= 0 && i <= 100) {
					if(game2 == i) {
						System.out.println("答對了!答案就是" + game2);
						break;
					}
					else if(game2 < i){
						System.out.println("猜錯囉"+"小於");
					}	 
					else {
						System.out.println("猜錯囉"+"大於");
					}
				}
				else {
					System.out.println("請輸入0~100的整數");
				}
			}
			else {
				System.out.println("請輸入整數");
				sc2.next();
			}
		}
		sc2.close();
	}
}

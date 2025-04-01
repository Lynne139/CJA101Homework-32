package hw5;

import java.util.Scanner;

public class HomeWork5_1 {
	public static void main(String[] args) {
//		• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//		圖：
		System.out.println("請輸入寬與高:");
		int[] sq = new int[2];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(sc.hasNextInt()) {
				sq[0] = sc.nextInt();
				
				while(true) {
					if(sc.hasNextInt()) {
						sq[1] = sc.nextInt();
						starSquare(sq[0], sq[1]);
						break;
					}else {
						System.out.println("高請輸入整數");
						sc.next();
					}
				}
				break;	
			}
			System.out.println("請重新輸入整數的寬與高");
			sc.nextLine();
		}
		sc.close();
	}
	
	
	public static void starSquare(int width, int height) {
		for(int i = 1; i <= height ; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

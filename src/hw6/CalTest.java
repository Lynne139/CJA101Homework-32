package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		Calculator myCal = new Calculator();

		while (true) {
			System.out.println("請輸入x的值:");
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				myCal.setx(x);
				
				System.out.println("請輸入y的值:");
				if (sc.hasNextInt()) {
					y = sc.nextInt();
					try {
						myCal.sety(y);
					}catch(Exception e) {
						System.out.println(e.getMessage());
						continue;
					}
					
					try {
						myCal.powerXY(x, y);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("輸入格式不正確");
					sc.next();
				}
			} 
			else {
				System.out.println("輸入格式不正確");
				sc.next();
			}
		}
		sc.close();
	}
}

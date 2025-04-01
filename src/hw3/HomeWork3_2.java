package hw3;

import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {	
//		• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
//		(提示：Scanner，亂數方法，無窮迴圈)
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

//		1.產生一個介於0-9之間的亂數
		int game = (int)(Math.random() * 10);
		
//		2.讓使用者可以輸入數字
		Scanner sc1 = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		
//		3.比對數字是否相等
		while(true) {
			if (sc1.hasNextInt()) {
				int i = sc1.nextInt();
				if(game == i) {
					System.out.println("答對了!答案就是" + game);
					break;
				}
				else if(game != i){
					System.out.println("猜錯囉");
				}
			}
			else {
				System.out.println("請輸入0~9的整數");
				sc1.next();
			}
		}
		sc1.close();
	}
}

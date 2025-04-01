package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] args) {
//	• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
//	(提示：Scanner，三角形成立條件，判斷式if else)
//	(進階功能：加入直角三角形的判斷)
		
//	1.宣告一個長度為3的一為矩陣
		int[] tri = new int[3];
	
//	2.讓使用者可以輸入數字
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
	
//	3.將數字放進矩陣
		for (int i = 0; i < tri.length; i++) {
				tri[i] = sc.nextInt();
		}
			
//	4.將數字排序
		Arrays.sort(tri);
	
//	5.比對是什麼三角形
		if(tri[0] == tri[1] && tri[0] == tri[2]) {
			System.out.println("正三角形");
		}
		else if((tri[0] == tri[1] || tri[1] == tri[2]) && tri[0] + tri[1] > tri[2]) {
			System.out.println("等腰三角形");
		}
		else if(Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
			System.out.println("直角三角形");
		}
		else if(tri[0] + tri[1] <= tri[2]) {
			System.out.println("不是三角形");
		}
		else {
			System.out.println("其他三角形");
		}
		sc.close();
	}
}

package hw3;

import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args) {
//		• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：
//		(提示：Scanner)
//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

//		1.讓使用者輸入數字並取得數字

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		if (sc.hasNextInt()) {
			int n = sc.nextInt();

//		2.宣告矩陣
			int[] x;
			if (n <= 4) {
				x = new int[35];
			} else {
				x = new int[44];
			}

//		3.把數字放到矩陣
			int count = 0;
			for (int number = 1; number < 50; number++) {

				if (number % 10 != n && (number < 10 * n || number > 10 * n + 9)) {
					x[count] = number;
					count++;
				}
			}

//		4.列印矩陣
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + " ");
			}

			System.out.print("總共有" + count + "數字可選");
			System.out.println();

//			進階
//			1.宣告亂數陣列getnumber
			int i = 0;
			int[] getnumber = new int[6];
//			2.可能會有重複的數字，所以不知道會跑幾次使用while，條件是陣列放入六個數字，索引值最大到5
			while (i < 6) {
//				3.隨機產生數字指定給變數ran作為可選數字陣列x的索引值，取得對應數字指定給變數num
				int ran = (int) (Math.random() * (x.length));
				int num = x[ran];
//				4.將變數num透過for迴圈逐一檢查是否重複，再放進getnumber陣列
				for (int j = 0; j < 6; j++) {
//					5.使用if-else檢查num的數字是否和陣列內的數字重複
//					6.如果有重複，利用break跳出for迴圈，重新取值
					if (num == getnumber[j]) {
						break;
						
					} 
//					7.如果沒有重複，也已經將陣列內所有數字比對完，也就是陣列最後一個索引值為5時候，就可以將數字放進陣列
					else if (j == 5) {
							getnumber[i] = num;
							i++;
					}

				}

			}
			for (int j = 0; j < getnumber.length; j++) {
				System.out.print(getnumber[j] + " ");

			}
			System.out.println("祝您中獎!");
		}

		else {
			System.out.println("請輸入0~9的整數");
		}
		sc.close();

	}

}

package hw4;

import java.util.Scanner;

public class HomeWork4_5 {
//	• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)年份是的4倍數閏年
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

	public static void main(String[] args) {
		int[] date = new int[3];

		int[] monthCommon = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] monthLeap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("三個整數，分別代表西元yyyy年，mm月，dd日");
		Scanner sc = new Scanner(System.in);
		while (true) {
//			檢驗是否為整數
			if (sc.hasNextInt()) {
				date[0] = sc.nextInt();

				if (sc.hasNextInt()) {
					date[1] = sc.nextInt();

					if (sc.hasNextInt()) {
						date[2] = sc.nextInt();
					} else {
						System.out.println("請輸入有效日期");
						sc.nextLine();
						continue;
					}
				} else {
					System.out.println("請輸入有效日期");
					sc.nextLine();
					continue;
				}

			} else {
				System.out.println("請輸入有效日期");
				sc.nextLine();
				continue;
			}

//			檢驗是否為有效日期
			if (date[0] > 0) {

				if (date[1] > 0 && date[1] < 12) {
//					依照平年閏年的月份取得天數
					int checkday;
					if (checkyear(date[0])) {
						checkday = monthCommon[date[1] - 1];
					} else {
						checkday = monthLeap[date[1] - 1];
					}
					if (date[2] > 0 && date[2] <= checkday) {

						break;
					} else {
						System.out.println("日期超出當月天數");
					}
				}
			}

			System.out.println("請輸入有效日期");
		}
		sc.close();

//		計算天數
		int sum = 0;

		if (checkyear(date[0])) {
			for (int i = 0; i < (date[1] - 1); i++) {
				sum += monthCommon[i];
			}
		} else {
			for (int i = 0; i < (date[1] - 1); i++) {
				sum += monthLeap[i];
			}
		}
		int days = sum + date[2];
		System.out.println("輸入的日期為該年第" + days + "天");
	}

//	判斷平年閏年
	public static boolean checkyear(int year) {
		boolean b = (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0));// true平年,false閏年
		return b;
	}
}

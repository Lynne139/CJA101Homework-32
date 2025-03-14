package hw1;

public class HomeWork1_32 {
	public static void main(String[] args) {
//	• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		//1.宣告變數
		int num1 = 12, num2 = 6;
		//2.計算和與積並列印顯示
		int num3 = num1 + num2;
		int num4 = num1 * num2;
		System.out.println("和 =" + num3);
		System.out.println("積 =" + num4);

	
//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		//1.宣告變數
		int egg1 = 200,dozen1 = 12;
		//2.計算打數及餘數並顯示列印
		int dozen2 = egg1 / dozen1;
		int egg2 = egg1 % dozen1;
		System.out.println("200顆蛋共是" + dozen2 + "打" + egg2 + "顆");

	
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		//1.宣告變數
		int second1 = 256559;
		//2.計算並顯示列印
		int minute1 = second1 / 60;
		int second2 = second1 % 60;
		int hour1 = minute1 / 60;
		int minute2 = minute1 % 60;
		int day1 = hour1 / 24;
		int hour2 = hour1 % 24;
		System.out.println("256559秒是" + day1 + "天"+hour2 + "小時" + minute2 + "分" + second2 + "秒");


//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		//1.宣告變數
		final double PI = 3.1415;
		int r = 5;
		//2.計算並顯示列印
		double area = PI * r * r;
		double circumference = 2 * PI * r;
		System.out.printf("圓面積 = %.4f%n" , area);
		System.out.printf("圓周長 = %.3f%n" , circumference);

	
//	• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//	金加利息共有多少錢(用複利計算，公式請自行google){
		//1.宣告變數
		long principal = 1500000;
		double rate = 0.02;
		//2.計算並顯示列印
		double money = principal * Math.pow((1+rate) , 10);
		System.out.printf("本金加利息共有 %.0f元%n" , money);

	
//	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);
		//5+5，兩個5都是數字。
		//因為是數字運算，所以答案是10。
		System.out.println(5 + '5');
		//5+'5'，第一個5是數字，第二個5是字元。
		//字元對電腦來說是數字，可以進行運算。字元5的unicode是53，所以5+53=58。
		System.out.println(5 + "5");
		//5+"5"，第一個5是數字，第二個5是字串。
		//遇到文字會直接串接，例如:1+"2"會產生12，這邊5+"5"會產生55。
	}

}

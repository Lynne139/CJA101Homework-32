package hw2;

public class Homework2_32 {
	
	public static void main(String[] args) {
		
//		• 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i, sum1 = 0;
		for(i = 2; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum1 += i ;
			}
		}
		System.out.println("1~1000的偶數和=" + sum1);
		System.out.println();
		
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int j, sum2 = 1;
		for(j = 1; j <= 10; j++) {
				sum2 *= j ;
		}
		System.out.println("1~10的連乘積=" + sum2);
		System.out.println();
		
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int k = 1;
		int sum3 = 1;
		while(k <= 10) {
				sum3 *= k ;
				k++ ;
		}
		System.out.println("1~10的連乘積=" + sum3);
		System.out.println();
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int m, sum4 = 0;
		for(m = 1; sum4 < 100; m += 2) {
				sum4 += m;
		System.out.print(sum4 + " ");
		}
		System.out.println();
		System.out.println();	
//		• 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		for(int j1 =1; j1 < 50; j1++) {
			if(j1 % 10 != 4 && j1 <40)
			System.out.print(j1 + " ");
		}System.out.println();
		System.out.println();
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int a, b;
		for(a = 10; a >= 0; a--) {
			for(b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}System.out.println();
		}
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int i1, i2;
		for(i1 = 1; i1 <= 10; i1++) {
			for(i2 = 1; i2 <=i1; i2++) {
				if(i1 == 1) {
				System.out.print('A');
				}
				else if(i1 == 2) {
				System.out.print('B');	
				}
				else if(i1 == 3) {
					System.out.print('C');
				}
				else if(i1 == 4) {
					System.out.print('D');
				}
				else if(i1 == 5) {
					System.out.print('E');
				}
				else if(i1 == 6) {
					System.out.print('F');
				}
			}System.out.println();
		}
//		•
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		•
		
//		一：使用for迴圈+ while迴圈
		int num1;
		for(num1 = 1; num1 <= 9; num1++) {
			int num2 = 1;
			while(num2 <= 9) {
				System.out.print(num1 + "*" + num2 + "=" + num1 * num2 + "\t");
				num2++;
			}
			System.out.println();
		}System.out.println();
		
//		•
//		二：使用for迴圈+ do while迴圈
		
		for(int num3 =1;num3 <= 9;num3++) {
			int num4 =1;
			do {System.out.print(num3 + "*" + num4 + "=" + num3 * num4 + "\t");
				num4++;
			}while(num4 <=9);
		System.out.println();
		}System.out.println();
		
//		•
//		三：使用while迴圈+ do while迴圈
		int num5 =1;
		while(num5 <= 9) {
			int num6 =1;
			do {System.out.print(num5 + "*" + num6 + "=" + num5 * num6 + "\t");
				num6++;
			}while(num6 <=9);
		System.out.println();
		num5++;
		}
		
	}

}

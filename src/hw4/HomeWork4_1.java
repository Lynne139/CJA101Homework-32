package hw4;

public class HomeWork4_1 {
	public static void main(String[] args) {
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		System.out.println("平均值=" + sum/array1.length);
		System.out.print("大於平均值的元素:");
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] > sum/array1.length) {
			System.out.print(array1[i] + " ");
			}
		}
		System.out.println();
		System.out.println("===============================");
		
//		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		String s ="Hello World";
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		
		System.out.println();
		System.out.println("===============================");
//		• 有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
//		二維陣列
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for(int i = 0; i < planet.length; i++) {
			for(int j = 0; j < planet[i].length(); j++) {
				
			
				switch(planet[i].charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
				}
			}
		}
			
		System.out.println("共有" + count + "個母音");
		System.out.println("===============================");
	}
}

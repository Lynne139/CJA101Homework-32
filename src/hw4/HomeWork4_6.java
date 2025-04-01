package hw4;

public class HomeWork4_6 {
	public static void main(String[] args) {
//		• 班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)

//		1.建立二維陣列
		int[][] score = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, { 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, { 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };

//		2.找到小陣列的最大值，放到陣列內
		int[] highest = new int[6];
		for (int k = 0; k < highest.length;) {
			for (int i = 1; i < score.length; i++) {
				int max = 0;
				for (int j = 0; j < score[i].length; j++) {
					if (max < score[i][j]) {
						max = score[i][j];
					}
				}
				highest[k] = max;
				k++;
			}
		}
		
//		3.對應的學生計次，並列印出結果
		int[] count = new int[8];
		int k = 0;
		for(int i = 1; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {		
				if(highest[k] == score[i][j]) {
					for(int n = j; n < count.length;) {
						count[n]++;
						break;
					}
					k++;
					break;
				}	
			}
		}
		for(int i = 0; i < count.length;i++) {
			System.out.println(i+1 +"號考了" + count[i] + "次最高分");
		}	

	}

}

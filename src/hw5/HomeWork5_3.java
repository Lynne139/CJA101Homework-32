package hw5;


public class HomeWork5_3 {
	public static void main(String[] args) {	
//		• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		可以找出二維陣列的最大值並回傳，如圖：
			
			int[][] intArray = {
					{1, 6, 3},
					{9, 5, 2}
			};
		
			double[][] doubleArray = {
					{1.2, 3.5, 2.2},
					{7.4, 2.1, 8.2}
			};
			
			System.out.println(maxElement(intArray));
			System.out.println(maxElement(doubleArray));
		}
		
		
		public static int maxElement(int x[][]) {
			int max = 0;
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length; j++) {
					if(max < x[i][j]) {
						max = x[i][j];
					}
				}
			}
			return max;
		}
		
		public static double maxElement(double x[][]) {
			double max = 0;
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length; j++) {
					if(max < x[i][j]) {
						max = x[i][j];
					}
				}
			}
			return max;
		}
}

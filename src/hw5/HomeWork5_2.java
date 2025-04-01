package hw5;

public class HomeWork5_2 {
	public static void main(String[] args) {	
//		• 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

		randAvg();
	}
	
	public static void randAvg() {
		int[] random = new int[10];
		for(int i = 0; i < random.length;) {
			int n = (int)(Math.random() * 101);
			for(int j = 0; j < random.length; j++) {
				if(n == random[j]) {
					break;
				}
				else if(j == 9) {
					random[i] = n;
					i++;
				}
				
			}
			
		}
		
		System.out.println("本次亂數結果:");
		for(int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < random.length; i++) {
			sum += random[i];
		}
		System.out.println(sum / 10);
	}

}

package hw5;

public class HomeWork5_5 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，如圖：
	
	public static void main(String[] args) {
		genAuthCode();
	}
	
	public static void genAuthCode(){
		String c = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < 8; i++) {
			System.out.print(c.charAt((int)(Math.random()*62)));
		}
	}
}

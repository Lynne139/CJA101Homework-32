package hw5;

public class Pencil extends Pen{
//	• 建立兩個子類別Pencil與InkBrush繼承Pen父類別

//	• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
//	• (2) Pencil實際售價為定價8折，InkBrush為定價9折
	public Pencil(String brand, int price) {
		super(brand, price);
	}
	
	public int getprice() {
		return((int)(super.getprice()*0.8f));
	}
		

	


	
}

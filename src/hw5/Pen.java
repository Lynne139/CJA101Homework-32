package hw5;

public abstract class Pen {
//	• 建立父類別Pen
//	• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
	private String brand;
	private int price;
	
//	• (2) 建構子設計：一個無參數與一個根據屬性而設計
	public Pen() {
		
	}
	public Pen(String brand, int price) {
		setbrand(brand);
		setprice(price);
	}
//	• (3) 定義Getter/Setter方法
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public void setprice(int price) {
		if(price < 0) {
			System.out.println("價格不能是負數");
		}
		else {
			this.price = price;
		}
	}
	public String getbrand() {
		return brand;
	}
	public int getprice() {
		return price;
	}
	//	• (4) 宣告一個抽象方法write()
	public abstract void write();
	

}

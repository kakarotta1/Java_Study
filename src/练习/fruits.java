package Á·Ï°;

public class fruits {
	
	private String fruitName;
	private int price;
	private int num;
	private String info;
	

	public fruits(String fruitName, int price, int num, String info) {
		super();
		this.fruitName = fruitName;
		this.price = price;
		this.num = num;
		this.info = info;
	}


	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString(){
		return getFruitName()+"\t"+getPrice()+"\t"+getNum()+"\t"+getInfo();
	}
	
	
}

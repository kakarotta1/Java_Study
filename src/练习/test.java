package Á·Ï°;

public class test {

	public static void main(String[] args){
		menu m = new menu();
		boolean result = true;
		while(result)
		{
			int n = m.showMenuMain();
			switch (n) {
			case 1:
				m.showAllFruits();
				break;
			case 2:
				m.findIndoByName();
				break;
			case 3:
				m.newFruitInfo();
				break;			
			case 4:
				m.showFruitsByPriceAsc();
				break;			
			case 5:
				m.showFruitByNumDesc();	
				break;
					
			default:
				break;
			}
			result = m.askCountine();
		}
		System.out.println("thx,goodbye!");
	}
}

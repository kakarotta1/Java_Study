package 练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class menu {
	
	private Scanner input = new Scanner(System.in);
	// private fruits[] fruit = new fruits[5];
	private List<fruits> list = new ArrayList<fruits>();
	
    /**
     * 初始化数据库
     */
	public void fruitData(){
	
		list.add(new fruits("苹果", 2, 20, "123"));
		list.add(new fruits("香蕉", 30, 10, "1234"));
		list.add(new fruits("梨", 4, 40, "1235"));
	}
	
	public menu(){
		fruitData();
	}
	
    /**
     * 显示系统菜单
     */
	public int showMenuMain(){
		System.out.println("==============水果管理系统==============");
		System.out.println("1.显示全部水果信息");
		System.out.println("2.查询水果信息");
		System.out.println("3.添加/修改水果信息");
		System.out.println("4.按水果价格升序显示");
		System.out.println("5.按水果数量降序显示");
		System.out.println("6.退出");
		System.out.println("==============水果管理系统==============");
		System.out.print("请选择：");
		int Num = input.nextInt(); 
		return Num;
	}
	
    /**
     * 显示全部水果信息
     */
	public void showAllFruits(){
		System.out.println("水果名称"+"\t"+"价格"+"\t"+"库存"+"\t"+"备注");
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}                                                                                               
	                                                      
	public boolean askCountine(){
		System.out.print("按N键退出，任意键继续！");
		return !"N".equals(input.next()) ? true : false;
	}
	
    /**
     * 根据水果名称查询水果信息
     */
	private fruits fruitInfo(String fruitname){
		for(int i = 0; i < list.size(); i++) {
			fruits fruit = list.get(i);
			if(fruit.getFruitName().equals(fruitname)) 
			{
				return fruit;	
			}
		}
		return null;
	}
	
    /**
     * 根据水果名称显示水果信息
     */
	public void findIndoByName() {
		System.out.println("请输入您要查询的水果名称：");
		String fruitName = input.next();
		fruits fruit3 = fruitInfo(fruitName);
		if (fruit3 == null) {
			System.out.println("库存中没有该水果");
		}else {
			System.out.println("该水果信息为：");
			System.out.println("水果名称"+"\t"+"价格"+"\t"+"库存"+"\t"+"备注");
			System.out.println(fruit3);
		}
		
	}
	
    /**
     * 添加新水果信息
     */
	public void newFruitInfo(){
		System.out.println("请输入水果名称:");
		String newFruitName = input.next();
		fruits fruit4 = fruitInfo(newFruitName);
		if (fruit4 == null){
			System.out.println("请输入价格:");
			int newprice = input.nextInt();
			System.out.println("请输入库存:");
			int newnum = input.nextInt();
			System.out.println("请输入备注:");
			String newinfo = input.next();
			System.out.println("添加成功！您添加的水果信息如下");
			System.out.println("水果名称"+"\t"+"价格"+"\t"+"库存"+"\t"+"备注");
			System.out.println(newFruitName+"\t"+newprice+"\t"+newnum+"\t"+newinfo);
			list.add(new fruits(newFruitName, newprice, newnum, newinfo));
		}else {
			System.out.println("请输入新增库存：");
			int addNum = input.nextInt();
			fruit4.setNum(fruit4.getNum() + addNum);
		}		
		System.out.println("入库成功");
	}
	
	public void showFruitsByPriceAsc() {
		Collections.sort(list, new Comparator<fruits>() {
			public int compare(fruits a1, fruits a2) {
				if (a1.getPrice() > a2.getPrice()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		showAllFruits();
	}
	
	public void showFruitByNumDesc() {
		Collections.sort(list, new Comparator<fruits>() {
			public int compare(fruits a1, fruits a2) {
				if (a1.getNum() < a2.getNum()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		showAllFruits();
	}
}
	



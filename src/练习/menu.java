package ��ϰ;

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
     * ��ʼ�����ݿ�
     */
	public void fruitData(){
	
		list.add(new fruits("ƻ��", 2, 20, "123"));
		list.add(new fruits("�㽶", 30, 10, "1234"));
		list.add(new fruits("��", 4, 40, "1235"));
	}
	
	public menu(){
		fruitData();
	}
	
    /**
     * ��ʾϵͳ�˵�
     */
	public int showMenuMain(){
		System.out.println("==============ˮ������ϵͳ==============");
		System.out.println("1.��ʾȫ��ˮ����Ϣ");
		System.out.println("2.��ѯˮ����Ϣ");
		System.out.println("3.���/�޸�ˮ����Ϣ");
		System.out.println("4.��ˮ���۸�������ʾ");
		System.out.println("5.��ˮ������������ʾ");
		System.out.println("6.�˳�");
		System.out.println("==============ˮ������ϵͳ==============");
		System.out.print("��ѡ��");
		int Num = input.nextInt(); 
		return Num;
	}
	
    /**
     * ��ʾȫ��ˮ����Ϣ
     */
	public void showAllFruits(){
		System.out.println("ˮ������"+"\t"+"�۸�"+"\t"+"���"+"\t"+"��ע");
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}                                                                                               
	                                                      
	public boolean askCountine(){
		System.out.print("��N���˳��������������");
		return !"N".equals(input.next()) ? true : false;
	}
	
    /**
     * ����ˮ�����Ʋ�ѯˮ����Ϣ
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
     * ����ˮ��������ʾˮ����Ϣ
     */
	public void findIndoByName() {
		System.out.println("��������Ҫ��ѯ��ˮ�����ƣ�");
		String fruitName = input.next();
		fruits fruit3 = fruitInfo(fruitName);
		if (fruit3 == null) {
			System.out.println("�����û�и�ˮ��");
		}else {
			System.out.println("��ˮ����ϢΪ��");
			System.out.println("ˮ������"+"\t"+"�۸�"+"\t"+"���"+"\t"+"��ע");
			System.out.println(fruit3);
		}
		
	}
	
    /**
     * �����ˮ����Ϣ
     */
	public void newFruitInfo(){
		System.out.println("������ˮ������:");
		String newFruitName = input.next();
		fruits fruit4 = fruitInfo(newFruitName);
		if (fruit4 == null){
			System.out.println("������۸�:");
			int newprice = input.nextInt();
			System.out.println("��������:");
			int newnum = input.nextInt();
			System.out.println("�����뱸ע:");
			String newinfo = input.next();
			System.out.println("��ӳɹ�������ӵ�ˮ����Ϣ����");
			System.out.println("ˮ������"+"\t"+"�۸�"+"\t"+"���"+"\t"+"��ע");
			System.out.println(newFruitName+"\t"+newprice+"\t"+newnum+"\t"+newinfo);
			list.add(new fruits(newFruitName, newprice, newnum, newinfo));
		}else {
			System.out.println("������������棺");
			int addNum = input.nextInt();
			fruit4.setNum(fruit4.getNum() + addNum);
		}		
		System.out.println("���ɹ�");
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
	



package com.projrct.library_v1;
/**
 * 图书仓库 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月9日 下午10:03:17
 */
public class Datas {
	/** 图书仓库就是一个数组 */
	public static Book[] bookStore = new Book[999]; 
	
	static {
		Book book1 = new Book();
		book1.setBookId("1024");
		book1.setBookName("从你的全世界路过");
		book1.setISBN("896721-324549");
		book1.setPrice(20.2);
		book1.setCount(25);
		bookStore[0] = book1;
		
		Book book2 = new Book();
		book2.setBookId("1025");
		book2.setBookName("让我留在你身边");
		book2.setISBN("896721-324549");
		book2.setPrice(23.2);
		book2.setCount(22);
		bookStore[1] = book2;
		
		Book book3 = new Book();
		book3.setBookId("1026");
		book3.setBookName("摆渡人");
		book3.setISBN("896721-324549");
		book3.setPrice(25.2);
		book3.setCount(20);
		bookStore[2] = book3;
		
		Book book4 = new Book();
		book4.setBookId("1027");
		book4.setBookName("我与全世界只差一个你");
		book4.setISBN("896721-324549");
		book4.setPrice(35);
		book4.setCount(12);
		bookStore[3] = book4;
		
		Book book5 = new Book();
		book5.setBookId("1028");
		book5.setBookName("十里春风不如你");
		book5.setISBN("896721-324549");
		book5.setPrice(22.2);
		book5.setCount(15);
		bookStore[4] = book5;
		
	} 
	
}

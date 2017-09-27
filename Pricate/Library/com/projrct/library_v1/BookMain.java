package com.projrct.library_v1;



/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月10日 下午3:09:49
 */
public class BookMain {

	public static void main(String[] args) {
		
//		AbstractBookView bookView = new BookViewImpl();
//		bookView.doMainView();
//		AbstractBookView bookView = new AbstractBookJapImpl();//使用对话框的实现类
//		bookView.doMainView();
//		System.out.println(Datas.bookStore.length);
//		FileUtil.saveBooks(Datas.bookStore);
		Book[] bookArray =FileUtil.loadBooks();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] == null) break;
			System.out.println(bookArray[i].getBookId() + "\t"
						 + bookArray[i].getBookName() + "\t"
						 + bookArray[i].getISBN() + "\t"
						 + bookArray[i].getPrice() + "\t"
						 + bookArray[i].getCount());
		}
	}
	
	
	
//	public static void show() {
//		BookBiz bookBiz = new BookBiz();
//		if (bookBiz.getBookCount() == 0) {
//			System.out.println("仓库空空如也");
//			return;
//		}
//		System.out.println("编号\t书名\t\t库存");
//		for (int i = 0; i < bookBiz.getBookCount(); i++) {
//			
//			System.out.println(Datas.bookStore[i].getBookId() + "\t" + 
//								Datas.bookStore[i].getBookName() + "\t" +
//								Datas.bookStore[i].getCount());
//			
//		}
//		
//		
//	}

}

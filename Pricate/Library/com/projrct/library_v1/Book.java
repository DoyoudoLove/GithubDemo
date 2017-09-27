package com.projrct.library_v1;

/**
 * 图书管理系统 父类
 *1、抽取图书相关的属性和方法
 *2、实现图书信息的录入
 *3、实现图书的排序功能
 *4、实现对图书的精准查询
 *5、实现对图书的分类查询
 *6、实现对图书的删除
 *7、实现图书的借阅和归还
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月9日 下午8:56:40
 */
public class Book {
	/** 书名 */
	private String bookName;
	/** 编号 */
	private String bookId;
	/** 条码 */
	private String ISBN;
	/** 库存 */
	private int count;
	/** 作者 */
	private String autor;
	/** 出版社 */
	private String publishing;
	/** 单价 */
	private double price;
	/** 类型 */
	private String type;
	
	public Book() {
		
	}
	
	/**
	 * 重写图书对象的equlas方法
	 */
	@Override
	public boolean equals(Object obj) {
		//如果传入的对象为空 或者不是Book类型的实例化 直接返回false
		if (null == obj || !(obj instanceof Book)) {
			return false;
		}
		Book book = (Book)obj;
		return bookId.equals(book.getBookId()) ;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getBookId() {
		return bookId;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

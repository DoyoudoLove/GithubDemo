package com.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 以图书ISBN为主键
 * 某一个ISBN对应多个实体
 * 图书信息---ISBN书号，图书类别，图书名称，作者，出版社，出版日期，价格，馆藏数量，可借数量，图书简介
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月23日 下午6:38:18
 */
public class BookInfo implements Serializable {
	private static final long serialVersionUID = -1493942138258903877L;
	private String isbn;
	private String type;
	private String name;
	private String author;
	private String pushiler;
	private Date pushDate;
	private double price;
	private int count;  //馆藏量
	private int brCount;
	private String message;
	//分析得知BookInfo和Book是一对多的关系
	private List<Book> bookList;
	
	/**
	 * 向ISBN类别的图书信息添加真是的图书对象
	 * @param book
	 */
	public void add(Book book) {
		if (null == book) return;
		if (null == bookList) {
			bookList = new ArrayList<>();
		}
		if (!isbn.equals(book.getIsbn())) return;
		//如果是同一本书
		if (bookList.contains(book)) return;
		//再为已添加的图书对象设置图书信息
		book.setBookinfo(this);
		bookList.add(book);
		
	}
	
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPushiler() {
		return pushiler;
	}

	public void setPushiler(String pushiler) {
		this.pushiler = pushiler;
	}

	public Date getPushDate() {
		return pushDate;
	}

	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getBrCount() {
		return brCount;
	}

	public void setBrCount(int brCount) {
		this.brCount = brCount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

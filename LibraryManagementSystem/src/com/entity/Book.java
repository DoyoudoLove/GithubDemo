package com.entity;

import java.io.Serializable;

/**
 * 具体到每一本书的信息 读者在借书的时候借的是 book对象 book对象包含bookInfo对象 ISBN书号，是否可借，图书书号
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月23日 下午6:45:13
 */
public class Book implements Serializable {
	private static final long serialVersionUID = 9040209022637233220L;
	// 对应的ISBN图书对象
	private String isbn;
	// 图书的内部编号 --- 某一本书的编号
	private String bookId;
	// 是否可借
	private BookState state;
	private BookInfo bookinfo;
	

	@Override
	public boolean equals(Object obj) {
		//验证传入的obj对象是否跟本对象中是一本书
		//两本书的内部编号是否相同
		if (null == obj) return false;
		if (obj instanceof Book) {
			return false;
		}
		Book book = (Book)obj;
		return bookId.equals(book.getBookId());
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public BookState getState() {
		return state;
	}

	public void setState(BookState state) {
		this.state = state;
	}

	public BookInfo getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(BookInfo bookinfo) {
		this.bookinfo = bookinfo;
	}

}

enum BookState {

	isCanBorrow, Borrowed, appointment, Delete

}
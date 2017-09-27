package com.projrct.library_v1;

import javax.swing.JOptionPane;

/**
 * 对话框实现控制台
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月13日 上午11:36:27
 */
public class AbstractBookJapImpl extends AbstractBookView {
	
	private BookBiz bookBiz = null;
	private Book newBook = null;
	
	public AbstractBookJapImpl() {
		bookBiz = new BookBiz();
		newBook = new Book();
	}

	@Override
	public String showMainView() {
		String strMen = "\n<我烤皮>图书管理系统 >> 主菜单";
		strMen += "\n\t1.增加图书\n\t"
				+ "2.删除图书\n\t"
				+ "3.查看所有图书\n\t"
				+ "4.按编号查询\n\t"
				+ "5.图书入库\n\t"
				+ "6.图书出库\n\t"
				+ "0.退出";
		//显示对话框
		String result = JOptionPane.showInputDialog(strMen);
		//如果用户点击取消 则退出对话框
		if (result == null) {
			result = "0";
		}
		return result;
		
	}

	@Override
	public Book showAddNewBook() {
		String bookName = null;
		String bookId = null;
		String ISBN = null;
		int count = -1;
		try {
			bookId = JOptionPane.showInputDialog("请输入图书编号："); 
			bookName = JOptionPane.showInputDialog("请输入图书名称：");
			count = Integer.parseInt(JOptionPane.showInputDialog("库存"));
			
		} catch (Exception e) {
			System.err.println("输入有误: " + e.getMessage());
		}
		newBook.setBookId(bookId);
		newBook.setBookName(bookName);
		newBook.setCount(count);
		if (bookBiz.addBook(newBook)) {
			JOptionPane.showMessageDialog(null, "添加成功！");
		} else {
			JOptionPane.showMessageDialog(null, "添加失败！");
		}
		return newBook;
	}

	@Override
	public void showDelBookView() {
		String strMen = "\n<我烤皮>图书管理系统 >> 删除图书"
				+ "\n\t请输入删除的图书编号：";
		String bookId = null;
		bookId = JOptionPane.showInputDialog(strMen);
		newBook.setBookId(bookId);
		if (bookBiz.delBook(newBook)) {
			JOptionPane.showMessageDialog(null, "删除成功！");
		} else {
			JOptionPane.showMessageDialog(null, "删除失败！");
		}
	}

	@Override
	public void showFindById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOutStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBooks(Book... BookArry) {
		// TODO Auto-generated method stub
		
	}

	
}

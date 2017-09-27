package com.projrct.library_v1;

import java.util.Scanner;
/**
 * 抽象类AbstractBookView --- 实现类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月12日 下午3:45:55
 */
public class BookViewImpl extends AbstractBookView{
	
	private Scanner input = null;
	private BookBiz bookBiz = null;
	
	public BookViewImpl() {
		input = new Scanner(System.in);
		bookBiz = new BookBiz();
		
		System.out.println("************************************");
		System.out.println("\t欢迎登录<我烤皮>图书管理系统\n");
		System.out.println("\t1.登录\n\n\t2.退出系统\n");
		System.out.println("************************************");
		System.out.print("请选择：");
		String choice = input.next();
		if ("1".equals(choice)) {
			 //验证登录信息
			//验证成功 显示主菜单
			System.out.println("登录系统暂未开放，直接转到操作界面\n");
			doMainView();
		}
		System.out.println("退出系统，欢迎您再次使用<我烤皮>图书管理系统");
		System.exit(0);
	}	
	
	@Override
	public String showMainView() {
		System.out.println("\n<我烤皮>图书管理系统 >> 主菜单");
		System.out.println("\t1.增加图书\n\t"
				+ "2.删除图书\n\t"
				+ "3.查看所有图书\n\t"
				+ "4.按编号查询\n\t"
				+ "5.图书入库\n\t"
				+ "6.图书出库\n\t"
				+ "0.退出");
		System.out.print("请选择：");
		String result = input.next();
		return result;
	}

	@Override
	public Book showAddNewBook() {

		System.out.println("\n<我烤皮>图书管理系统 >> 新增图书");
		System.out.print("内部编号: ");
		String bookId = input.next();
		//判断用户输入编号是否重复
		Book newBook = bookBiz.findById(bookId);
		if (newBook == null) {
			//添加图书 
			newBook = new Book();
			newBook.setBookId(bookId);
			System.out.print("图书名称：");
			newBook.setBookName(input.next());
			System.out.print("ISBN编码：");
			newBook.setISBN(input.next());
			System.out.print("单价：");
			newBook.setPrice(input.nextDouble());
			System.out.print("库存：");
			newBook.setCount(input.nextInt());

			bookBiz.addBook(newBook);
		} else {
			System.out.println("输入编号有误！请重新输入！");
			//重新调用本方法，让用户重新输入
			newBook = showAddNewBook();
		}
		return newBook;
	
		
	}

	@Override
	public void showDelBookView() {

		System.out.println("\n<我烤皮>图书管理系统 >> 删除图书");
		System.out.print("请输入删除的图书编号：");
		//用户输入删除编号
		String delId = input.next();
		//创建删除图书对象
		Book delBook = new Book();
		//调用删除方法 删除ID
		delBook.setBookId(delId);
		//判断能否删除成功
		if (bookBiz.delBook(delBook)) {
			System.out.println("删除成功！");
			//打印所有图书 ---相当于刷新显示当前仓库的内容
			showBooks(null);
		} else {
			System.out.println("删除失败！");
		}
	
		
	}

	@Override
	public void showFindById() {

		System.out.println("\n<我烤皮>图书管理系统 >> 按编号查询");
		System.out.print("请输入要查询的图书编号：");
		String bookId = input.next();
		Book book = bookBiz.findById(bookId);
		//如果没找到 提示用户
		if (book == null) {
			System.out.println("\n\t没有找到任何图书信息！");
		} else {
			showBooks(book);
		}
	
		
	}

	@Override
	public void showInStore() {
		//入库需要两个参数
		System.out.println("\n<我烤皮>图书管理系统 >> 图书入库");
		System.out.print("请输入要增加的图书编号：");
		String bookId = input.next();
		System.out.print("请输入要增加的图书数量：");
		int bookCount = input.nextInt();
		//如果添加失败 提示用户图书编号是否输入正确
		if (bookBiz.inStore(bookId, bookCount)) {
			System.out.println("添加成功！");
			//显示所有图书
			showBooks(null);
		} else {
			System.err.println("入库失败！请检查图书编号是否输入正确！");
		}
	
	}

	@Override
	public void showOutStore() {

		//出库需要两个参数
		System.out.println("\n<我烤皮>图书管理系统 >> 图书出库");
		System.out.print("请输入要出库的图书编号：");
		String bookId = input.next();
		System.out.print("请输入要出库的图书数量：");
		int bookCount = input.nextInt();
		
		if (bookBiz.outStore(bookId, bookCount)) {
			System.out.println("出库成功！");
			showBooks(null);
		} else {
			System.out.println("出库失败！请检查图书编号（图书库存）是否输入正确！");
		}
	
		
	}

	@Override
	public void showBooks(Book... BookArry) {

		System.out.println("图书编号\t图书名称\t\tISBN编码\t\t单价\t\t库存");
		if (BookArry == null) {
			BookArry = Datas.bookStore;
		}
		int bookCount = bookBiz.getBookCount(BookArry);
		for (int i = 0; i < bookCount; i++) {
			System.out.printf("\n%s\t%s\t\t%s\t%f\t%d\n",
					BookArry[i].getBookId() ,
					BookArry[i].getBookName() ,
					BookArry[i].getISBN(),
					BookArry[i].getPrice(),
					BookArry[i].getCount());
			 
		}
		
	
		
	}

}

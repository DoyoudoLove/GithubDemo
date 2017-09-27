package com.projrct.library_v1;

/**
 * 图书管理器---- 业务类
 *	1、抽取图书相关的属性和方法
 *	2、实现图书信息的录入
 *	3、实现图书的排序功能
 *	4、实现对图书的精准查询
 *	5、实现对图书的分类查询
 *	6、实现对图书的删除
 *	7、实现图书的借阅和归还
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月9日 下午9:57:18
 */
public class BookBiz {
	/**
	 * 获取图书仓库Datas.bookStore数组图书对象的个数
	 * @return 非空元素
	 */
	public int getBookCount() {
		int count = 0;
		for(Book book : Datas.bookStore) {
			if (book == null) {
				break;
			}
			count++;
		}
		return count;
	}
	/**
	 * 重载图书数量方法 --- 获取数组的长度
	 * @param books
	 * @return
	 */
	public int getBookCount(Book ... books) {
		int count = 0;
		for(Book book : books) {
			if (book == null) {
				break;
			}
			count++;
		}
		return count;
		
	}
	/**
	 * -----增加图书
	 * 将传入的图书对象放进图书仓库的数组中Datas.bookStore；
	 * @param book 
	 * @return 如果放入的元素数组已满 返回false
	 */
	public boolean addBook(Book book) {
		/** 获取当前图书数量 */
		int bookCount = getBookCount();
		/** 判断当前数组是否已满 */
		if (Datas.bookStore.length == bookCount) {
			//元素已满
			return false;
		}	 
		/** 反之元素没有满的情况下 就将图书对象放入数组最后一个位置（第一个非null位置） */	
		Datas.bookStore[bookCount] = book;
		return true;
	}
	/**
	 * 删除图书 即 删除对象数组
	 * @param book
	 * @return
	 */
	public boolean delBook(Book book) {
		/** 获取当前图书数量 */
		int bookCount = getBookCount();
		/** 定义下标 --- 要删除的数组下标 */
		int delIndex = -1;
		/** 元素相等 将元素下标保存下来 */
		for (int i = 0; i < bookCount; i++) {
			//if (book.getBookId().equals(Datas.bookStore[i].getBookId())) {
			if (book.equals(Datas.bookStore[i])) {
				delIndex = i;
				break;
			}
		}
		/** 没有找到要删除的元素 直接返回false */
		if (delIndex == -1) {
			return false;
		}
		
		/** 执行数组删除 */
		for (int i = delIndex; i < book.getCount() - 1; i++) {
			Datas.bookStore[i] = Datas.bookStore[i + 1];
		}
		//将最后一个元素赋值为null
		Datas.bookStore[bookCount - 1] = null;
		return true;
	}
	/**
	 * 通过读书ID查找对应的图书对象
	 * @param bookId 
	 * @return 没有找到返回 null
	 */
	public Book findById(String bookId) {
		int bookCount = getBookCount();
		for (int i = 0; i < bookCount; i++) {
			if (bookId.equals(Datas.bookStore[i].getBookId())) {
				return Datas.bookStore[i];
			}
		}

		return null;
	}
	/**
	 * 图书入库:为现有图书加入库存
	 * @param bookId 查找的bookId
	 * @param count 入库数量
	 * @return 如果bookId不存在 返回false
	 */
	public boolean inStore(String bookId, int count) {
		Book book = findById(bookId);
		//如果bookId不存在 返回false
		if (null == book) {
			return false;
		}
		//增加库存 引用出传递
		book.setCount(book.getCount() + count);
		return true;
	}
	/**
	 * 出库：将仓库现有库存减小
	 * @param bookId
	 * @param count 
	 * @return 现有库存小于count 出库失败
	 */
	public boolean outStore(String bookId, int count) {
		Book book = findById(bookId);
		//查找是否有此Id
		if (null == bookId) {
			return false;
		}
		//现有库存小于count 出库失败
		if (book.getCount() < count) {
			return false;
		}
		//删除库存
		book.setCount(book.getCount() - count);
		return true;
		
	}
	
	
	
	
	
}

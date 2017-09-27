package com.projrct.library_v1;

/**
 * 用户界面抽象类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月12日 下午3:46:33
 */
public abstract class AbstractBookView {
	
	public AbstractBookView() {
		
	}
	public void doMainView() {
		String result = showMainView();
		switch (result) {
		case "1"://增加图书
			showAddNewBook();
			showBooks(Datas.bookStore);
			break;
		case "2"://删除图书
			showDelBookView();
			break;
		case "3"://查询所有图书
			showBooks(null);
			break;
		case "4"://按编号查询图书
			showFindById();
			break;
		case "5"://入库
			showInStore();
			break;
		case "6"://出库
			showOutStore();
			break;
		case "0"://退出
			return;
		default:
			break;
		}
		doMainView();
	}
	/**
	 * 显示主菜单
	 */
	public abstract String showMainView();
	/**
	 * 增加图书的视图方法
	 * @return
	 */
	public abstract Book showAddNewBook();
	/**
	 * 删除图书的视图方法
	 * @return 返回删除的图书对象
	 */
	public abstract void showDelBookView();
	/**
	 * 编号查找图书视图
	 */
	public abstract void showFindById();
	/**
	 * 图书入库视图 --- 增加库存
	 */
	public abstract void showInStore();
	/**
	 * 图书出库视图  --- 减少库存
	 */
	public abstract void showOutStore();
	
	/**
	 * 打印方法---显示图书的所有信息
	 */
	public abstract void showBooks(Book ... BookArry); 
	

}

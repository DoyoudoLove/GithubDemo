package biz;

import com.entity.BookInfo;

/**
 * 图书业务类的父接口
 * 增删改查
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月24日 下午12:28:08
 */
public interface bookInfoBiz extends Biz<BookInfo> {
	public BookInfo findById(String id);
	/**
	 * 出库
	 * @param isbn 
	 * @param outCount 出库的数量
	 * @return 是否出库成功
	 */
	public boolean outStore(String isbn, int outCount);
	/**
	 * 入库
	 * @param isbn
	 * @param inCount 入库的数量
	 * @return 是否入库成功
	 */
	public boolean inStore(String isbn, int inCount);
	
	
}

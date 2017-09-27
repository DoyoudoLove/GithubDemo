package biz.impl;

import java.util.Map;

import com.entity.BookInfo;

import Util.FileUtil;
import biz.bookInfoBiz;

/**
 * 图书业务类的第一版实现类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月24日 下午12:47:56
 */
public class BookInfoBizImplV1 implements bookInfoBiz {
	private static final long serialVersionUID = -4165024822979257749L;

	@Override
	public boolean add(BookInfo bookInfo) {
		//1.获得所有图书信息
		//2.向Map中添加BookInfo对象
		//3.将Map对象重新写回文件
		if (null == bookInfo) return false;
		Map<String, BookInfo> bookInfoMap = findAll() ;
		if (null == bookInfoMap) return false;
		//不能添加重复的ISBN
		if (bookInfoMap.containsKey(bookInfo.getIsbn())) {
			return false;
		}
		bookInfoMap.put(bookInfo.getIsbn(), bookInfo);
		FileUtil.SaveBookInfos(bookInfoMap); 
		
		return true;
	}

	@Override
	public boolean del(BookInfo bookInfo) {
		if (null == bookInfo) return false;
		Map<String, BookInfo> bookInfoMap = findAll();
		if (null == bookInfoMap) return false;
		//删除包含的重复主键
		if (!bookInfoMap.containsKey(bookInfo.getIsbn())) {
			return false;
		}
		//删除以主键相同的map信息
		bookInfoMap.remove(bookInfo.getIsbn(), bookInfo);
		//写入文件
		FileUtil.SaveBookInfos(bookInfoMap);
		return true;
	}

	@Override
	public BookInfo update(BookInfo bookInfo) {
		if (null == bookInfo) return null;
		Map<String, BookInfo> bookInfoMap = findAll();
		if (null == bookInfoMap) return null;
		//没有找到图书编号
		if (!bookInfoMap.containsKey(bookInfo.getIsbn())) {
			return null;
		}
		bookInfoMap.put(bookInfo.getIsbn(), bookInfo);
		//写回文件中区
		FileUtil.SaveBookInfos(bookInfoMap);
		return bookInfo;
	}

	@Override
	public BookInfo findById(String id) {
		throw new UnsupportedOperationException("BookInfoBiz不支持根据Id的查找操作，请使用findByIsdn(isdn)方法");
		
	}

	@Override
	public Map<String, BookInfo> findAll() {
		FileUtil.ReadBookInfoMap();
		return null;
	}

	@Override
	public boolean outStore(String isbn, int outCount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inStore(String isbn, int inCount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

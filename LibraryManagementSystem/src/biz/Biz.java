package biz;

import java.io.Serializable;
import java.util.Map;

/**
 * 所有业务类的父接口
 * 定义所有业务类的通用操作
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月24日 下午12:31:43
 */
public interface Biz<T> extends Serializable{//使用泛型编程
	/** 通用的添加方法 */
	public boolean add(T t);
	/** 通用的删除方法 */
	public boolean del(T t);
	/** 更改图书的方法 */
	public T update(T t);
	/** 通过Id找到图书的方法 */
	public T findById(String id);
	/** 查找所有图书 */
	public Map<String, T> findAll();
	
	
}

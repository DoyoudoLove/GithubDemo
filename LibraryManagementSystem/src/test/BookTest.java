package test;

import java.util.HashMap;
import java.util.Map;

import com.entity.Book;
import com.entity.BookInfo;

import Util.FileUtil;
import biz.impl.BookInfoBizImplV1;

public class BookTest {

	public static void main(String[] args) {
		//测试图书实体类的定义();
		测试图书业务类();

	}
	public static void 测试图书业务类() {
		BookInfoBizImplV1 impl = new BookInfoBizImplV1();
		impl.findById("123-234");
		
	}
	
	public static void 测试图书实体类的定义() {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("123-354");
		bookInfo.setName("三生三世");
		Book book = new Book();
		//相当于扫描了图书的ISBN
		book.setIsbn("123-354");
		bookInfo.add(book);
		
		Map<String, BookInfo> infoMap = new HashMap<>();
		infoMap.put(bookInfo.getIsbn(), bookInfo);
		FileUtil.SaveBookInfos(infoMap);
		System.out.println(book.getBookinfo().getName());
		
		infoMap = FileUtil.ReadBookInfoMap();
		System.out.println("从文件中读取的信息");
		for (String isbn : infoMap.keySet()) {
			System.out.println(isbn);
		}
		
		
		
	}

}

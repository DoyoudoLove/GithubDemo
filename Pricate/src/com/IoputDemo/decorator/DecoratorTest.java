package com.IoputDemo.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 *   
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��30�� ����9:10:59
 */
public class DecoratorTest {

	public static void main(String[] args) throws FileNotFoundException {
		// ����Ҫ��װ�ε�ԭʼ����
		Component component = new TrueComponet();
		//Ϊԭʼ����͸�������ӹ���
		ComponentImplA componentA = new ComponentImplA(component);
//		componentA.read();
		ComponentImplB componentB = new ComponentImplB(componentA);
		componentB.read(); 
		
//		InputStream inStream = new FileInputStream("");
//		//ʹ�ô�����ĵ�������װ���������
//		BufferedInputStream bInStream = new BufferedInputStream(inStream);
		
	}

}

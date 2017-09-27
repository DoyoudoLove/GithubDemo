package com.IoputDemo.decorator;
/**
 * װ������ --- ����
 * ����Ϊ���������ʵ�ֻ�������չ
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��30�� ����7:31:36
 */
public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component =component; 
	}
	
	@Override
	public void read() {
		//˭ʵ��read����
		//������ת����component����ת�����ִ��һЩ��չ���� 
		component.read();
	}
}

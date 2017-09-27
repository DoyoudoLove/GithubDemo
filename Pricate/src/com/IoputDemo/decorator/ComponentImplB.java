package com.IoputDemo.decorator;
/**
 * װ����ʵ����B   
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��30�� ����7:39:13
 */
public class ComponentImplB extends Decorator {
	
	
	public ComponentImplB(Component component) {
		super(component);
	}
	@Override
	public void read() {
		//��ԭʼ��read����ǰ�󣬷ֱ�����Զ���ķ���
		//ʵ���˶�ԭread�����Ĺ�����չ
		this.extendsReadA();
		super.read();  //ԭʼ��read����
		this.extendsReadB();
	}
	
	private void extendsReadA() {
		System.out.println("ComponentImplBʵ�ֵ���չ������extendsReadA");
	}
	
	private void extendsReadB() {
		System.out.println("ComponentImplBʵ�ֵ���չ������extendsReadB ");
	}
	
	
}

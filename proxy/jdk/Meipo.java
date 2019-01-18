package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//����������࣬���д�����
public class Meipo implements InvocationHandler {

	//����һ������Ķ���
	private Person target;
	
	//��ȡ�������˵ĸ�������
	public Object getInstance(Person person) throws Exception{
		this.target = person;
		Class<? extends Person> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), 
				clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//���Զ�����  ���е�����
		System.out.format("����Ա� %s \n");
		//�������������������е��÷�������Ǯ�Ĳ���
		System.out.println("-------------"+method.getName());
		//this.target.findLove();
		method.invoke(this.target, args);
		//���еĹ���
		System.out.println("-------------");
		System.out.println("���");
		return null;
	}

}

package proxy.custom;

import java.lang.reflect.Method;


import proxy.jdk.Person;

public class MyMeipo implements MyInvocationHander {

	// ����һ������Ķ���
	private Person target;

	// ��ȡ�������˵ĸ�������
	public Object getInstance(Person person) throws Exception {
		this.target = person;
		Class<? extends Person> clazz = target.getClass();
		 return MyProxy.newProxyInstance(new MyClassLoader(),
		 clazz.getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// ���Զ����� ���е�����
		System.out.format("����Ա� %s \n",method.getName());
		// �������������������е��÷�������Ǯ�Ĳ���
		System.out.println("-------------" + method.getName());
		// this.target.findLove();
		method.invoke(this.target, args);
		// ���еĹ���
		System.out.println("-------------");
		System.out.println("���");

		return null;
	}

}

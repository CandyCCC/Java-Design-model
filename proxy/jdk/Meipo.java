package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//集成了这个类，就有代理功能
public class Meipo implements InvocationHandler {

	//产生一个代理的对象
	private Person target;
	
	//获取被代理人的个人资料
	public Object getInstance(Person person) throws Exception{
		this.target = person;
		Class<? extends Person> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), 
				clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//会自动调用  具有的属性
		System.out.format("你的性别 %s \n");
		//你可以用这个东西机进行调用方法调用钱的操作
		System.out.println("-------------"+method.getName());
		//this.target.findLove();
		method.invoke(this.target, args);
		//进行的过程
		System.out.println("-------------");
		System.out.println("完毕");
		return null;
	}

}

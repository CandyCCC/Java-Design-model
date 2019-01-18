package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class NewMeipo implements MethodInterceptor{
	
	/**
	 * 传入一个类名，返回一个实例
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public Object getInstance(Class<? extends NewPerson> clazz) throws Exception{
		
		Enhancer enhancer = new Enhancer();
		//将父类设置为谁
		enhancer.setSuperclass(clazz);
		//设置回调intercept方法
		enhancer.setCallback(this);
		/**
		 * 1，生成源代码
		 * 2，编译class文件
		 * 3，加载到jvm中
		 */
		return enhancer.create();
	}
	
	/*
	 * cglib同样也是字节码的重组，完成一个类来继承被代理人
	 * 然后在生成的类中持有被代理人引用
	 * */
	
	@Override
	public Object intercept(Object paramObject, Method paramMethod,
			Object[] paramArrayOfObject, MethodProxy paramMethodProxy)
			throws Throwable {
		// TODO Auto-generated method stub
		//会自动调用  具有的属性
				//System.out.format("你的性别 %s \n");
				//你可以用这个东西机进行调用方法调用钱的操作
				System.out.println("-------------"+paramMethod.getName());
				//this.target.findLove();
				//paramMethod.invoke(paramObject, paramArrayOfObject);
				//调用父类的方法，调用子类的invoke会死循环
				//paramObject 这个obj是cglib继承了我们的被代理对象的新类，他内部会重写方法，字节码重组
				paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
				//进行的过程
				System.out.println("-------------");
				System.out.println("完毕");
				return null;
	}
}

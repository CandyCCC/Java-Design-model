package proxy.custom;

import java.lang.reflect.Method;

//代理模式，就是字节码重组
public interface MyInvocationHander {
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable;
}

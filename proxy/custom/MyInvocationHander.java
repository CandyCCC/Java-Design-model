package proxy.custom;

import java.lang.reflect.Method;

//����ģʽ�������ֽ�������
public interface MyInvocationHander {
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable;
}

package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class NewMeipo implements MethodInterceptor{
	
	/**
	 * ����һ������������һ��ʵ��
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public Object getInstance(Class<? extends NewPerson> clazz) throws Exception{
		
		Enhancer enhancer = new Enhancer();
		//����������Ϊ˭
		enhancer.setSuperclass(clazz);
		//���ûص�intercept����
		enhancer.setCallback(this);
		/**
		 * 1������Դ����
		 * 2������class�ļ�
		 * 3�����ص�jvm��
		 */
		return enhancer.create();
	}
	
	/*
	 * cglibͬ��Ҳ���ֽ�������飬���һ�������̳б�������
	 * Ȼ�������ɵ����г��б�����������
	 * */
	
	@Override
	public Object intercept(Object paramObject, Method paramMethod,
			Object[] paramArrayOfObject, MethodProxy paramMethodProxy)
			throws Throwable {
		// TODO Auto-generated method stub
		//���Զ�����  ���е�����
				//System.out.format("����Ա� %s \n");
				//�������������������е��÷�������Ǯ�Ĳ���
				System.out.println("-------------"+paramMethod.getName());
				//this.target.findLove();
				//paramMethod.invoke(paramObject, paramArrayOfObject);
				//���ø���ķ��������������invoke����ѭ��
				//paramObject ���obj��cglib�̳������ǵı������������࣬���ڲ�����д�������ֽ�������
				paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
				//���еĹ���
				System.out.println("-------------");
				System.out.println("���");
				return null;
	}
}

package factory.simple;

import factory.Audi;
import factory.Benz;
import factory.Bmw;
import factory.Car;

/**
 * ���ּ򵥵Ĺ���̫ǿ����
 * ʲô��������������ʵ���ǲ����������Ĺ���
 * @author Pop��
 *
 */
public class SimpleFactory {

	//ʵ��ͳһ������רҵ������
	//���û�й���ģʽ��С������û��ִ�б�׼
	//������Դ��򻯲���
	public static Car getCar(String name){
		
		if("BMW".equalsIgnoreCase(name)){
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)){
			return new Benz();
		}else if("Audi".equalsIgnoreCase(name)){
			return new Audi();
		}else{
			System.out.println("û�й���");
			return null;
		}
	}
	
}

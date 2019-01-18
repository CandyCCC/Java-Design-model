package factory.abstrac;

import factory.Car;

/**
 * Ϊ�˽��֮ǰ����ϸ�֣������ÿͻ�����ʹ�����ĸ�����������
 * ���ǿ���ʹ��һ��Ĭ�ϵĹ���������������Է������ǵ�����
 * ������û�г��󷽷���ʱ����Ϊһ���࣬��Ҳ������һЩ����
 * @author Pop��
 *
 */
public abstract class AbstractFactory {

	protected abstract Car getCar();
	
	public Car getCar(String name){

		if("BMW".equalsIgnoreCase(name)){
			return new BmwFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)){
			return new BenzFactory().getCar();
		}else if("Audi".equalsIgnoreCase(name)){
			return new AudiFactory().getCar();
		}else{
			System.out.println("û�й���");
			return null;
		}
	}
	
}

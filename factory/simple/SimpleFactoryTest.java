package factory.simple;

import factory.Car;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		//������������˵������ֻ��Ҫ�õ�һ�����ͺ���
			Car car  = SimpleFactory.getCar("BMW");
			System.out.println(car.getName());
	}
}

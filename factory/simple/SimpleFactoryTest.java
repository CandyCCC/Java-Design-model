package factory.simple;

import factory.Car;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		//对于消费者来说，我们只需要得到一辆车就好了
			Car car  = SimpleFactory.getCar("BMW");
			System.out.println(car.getName());
	}
}

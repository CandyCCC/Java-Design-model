package factory.func;

import factory.Benz;
import factory.Car;
/**
 * 专门生产奥迪的工厂
 * @author Pop酱
 *
 */
public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}

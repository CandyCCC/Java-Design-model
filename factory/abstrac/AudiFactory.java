package factory.abstrac;

import factory.Audi;
import factory.Car;
/**
 * 专门生产奥迪的工厂
 * @author Pop酱
 *
 */
public class AudiFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}

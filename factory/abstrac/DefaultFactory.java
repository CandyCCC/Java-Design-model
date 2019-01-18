package factory.abstrac;

import factory.Car;

public class DefaultFactory extends AbstractFactory{

	private AudiFactory default0 = new AudiFactory();
	
	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return default0.getCar();
	}

}

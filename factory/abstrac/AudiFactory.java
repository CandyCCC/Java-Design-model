package factory.abstrac;

import factory.Audi;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class AudiFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}

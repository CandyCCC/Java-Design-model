package factory.abstrac;

import factory.Benz;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class BenzFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}

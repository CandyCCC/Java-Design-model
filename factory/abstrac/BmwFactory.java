package factory.abstrac;

import factory.Bmw;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class BmwFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}

package factory.func;

import factory.Benz;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}

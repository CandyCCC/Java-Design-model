package factory.func;

import factory.Bmw;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class BmwFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}

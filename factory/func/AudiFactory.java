package factory.func;

import factory.Audi;
import factory.Car;
/**
 * ר�������µϵĹ���
 * @author Pop��
 *
 */
public class AudiFactory implements Factory{

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}

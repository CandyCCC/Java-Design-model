package factory.abstrac;

import factory.Car;

/**
 * 为了解决之前工厂细分，但是让客户关心使用了哪个工厂的问题
 * 我们可以使用一个默认的工厂，抽象类很明显符合我们的需求，
 * 本身在没有抽象方法的时候，作为一个类，他也可以做一些事情
 * @author Pop酱
 *
 */
public abstract class AbstractFactory {

	protected abstract Car getCar();
	
	public Car getCar(String name){

		if("BMW".equalsIgnoreCase(name)){
			return new BmwFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)){
			return new BenzFactory().getCar();
		}else if("Audi".equalsIgnoreCase(name)){
			return new AudiFactory().getCar();
		}else{
			System.out.println("没有工艺");
			return null;
		}
	}
	
}

package factory.func;

import factory.Car;
/**
 * 工厂接口，就定一了所有的执行标准
 * @author Pop酱
 *
 */
public interface Factory {

	//符合汽车的上路标准
	/**
	 * 气囊，轮胎什么之类的汽车标准
	 * @return
	 */
	Car getCar();
}

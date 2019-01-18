package factory.simple;

import factory.Audi;
import factory.Benz;
import factory.Bmw;
import factory.Car;

/**
 * 这种简单的工厂太强大了
 * 什么都可以制作，现实中是不存在这样的工厂
 * @author Pop酱
 *
 */
public class SimpleFactory {

	//实现统一管立，专业化管理
	//如果没有工厂模式，小作坊，没有执行标准
	//这个可以大大简化操作
	public static Car getCar(String name){
		
		if("BMW".equalsIgnoreCase(name)){
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)){
			return new Benz();
		}else if("Audi".equalsIgnoreCase(name)){
			return new Audi();
		}else{
			System.out.println("没有工艺");
			return null;
		}
	}
	
}

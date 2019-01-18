package factory.func;

public class FactoryTest {
	public static void main(String[] args) {
		
		//更加细分的工厂模式
		/**
		 * 但是这对于用户来说是不太合理的，用户不在意你是什么工厂
		 * 我想要车
		 */
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//抽象工厂模式
	}
}

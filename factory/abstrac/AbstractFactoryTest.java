package factory.abstrac;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		DefaultFactory df = new DefaultFactory();
		System.out.println(df.getCar("Bmw"));
		
		/**
		 * 设计模型的经典之处，就在于，解决了编写代码的人和调用代码的人的痛处
		 * 解放双手
		 * 编写代码的人可以更好的维护
		 * 调用的代码的人只要调用就可以了
		 * 
		 * 工厂模式，隐藏复杂的逻辑处理过程，只关心执行接过
		 */
	}
}

package prototype.simple;

public class CloneTest {

	public static void main(String[] args) {
		
		ConcretePrototype cp = new ConcretePrototype();
		cp.setAge(18);
		cp.list.add("pop");
		try {
			ConcretePrototype copy = (ConcretePrototype) cp.clone();
			System.out.println(cp.list==copy.list);
			System.out.println(copy.getAge()+","+copy.list.size());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//就是一个现成的对象，这个对象已经初始化好了，属性什么都好了
		/**
		 * 当我新建一个对象，并且愮给新建对象赋值，并且赋值内容和之间一模一样的时候
		 * 
		 * ORM常常用到
		 * 
		 *当你的对象属性很多的时候，可以克隆，克隆是直接复制字节码
		 *本生克隆出来，地址不一样了，应该是使用了new即便是反射也要用newInstance
		 *而对于克隆来说是直接复制字节码
		 *对于jvm来说，对象的运行本质上也是字节码的运行
		 *
		 *
		 *深拷贝与浅拷贝
		 *
		 *浅拷贝
		 *能够直接拷贝其实际内容的数据类型，只支持9种，八大基本类型+String
		 *如果你使用了ArrayList之类的，也能能够打印出来，但是使用的是同一个内存
		 *指向还是同一个地址
		 */
	}
	
}

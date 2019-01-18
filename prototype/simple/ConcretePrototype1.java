package prototype.simple;

import java.util.ArrayList;
/**
 * 直接拿来使用的类，不采用继承的，只是单独拿来测试
 * @author Pop酱
 *
 */
public class ConcretePrototype1 implements Cloneable {

	public int age;

	public ArrayList<String> list = new ArrayList<String>();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// 如果你想要实现深拷贝，那么这个地方就需要改造
		// 不然就是arraylist公用的情况

		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			prototype.list = (ArrayList) list.clone();

			// 克隆是基于字节码的
			//所以如果当我们的类型很复杂的时候，例如map里面有list，然后又有对象的时候
			//我们的深克隆就会有问题
			//但因为克隆是基于字节码的，所以我们还是可以使用反射或者循环完成
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		return prototype;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

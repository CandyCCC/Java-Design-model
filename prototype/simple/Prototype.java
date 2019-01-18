package prototype.simple;

import java.util.ArrayList;

/**
 * 原型模式的实现
 * @author Pop酱
 *
 */
public class Prototype implements Cloneable{

	public ArrayList<String> list = new ArrayList<String>();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//如果你想要实现深拷贝，那么这个地方就需要改造
		//不然就是arraylist公用的情况
		
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
			prototype.list = (ArrayList)list.clone();
			
			//克隆是基于字节码的
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return prototype;
	}

}

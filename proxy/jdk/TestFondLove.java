package proxy.jdk;

import java.io.FileOutputStream;

import proxy.custom.MyMeipo;
import sun.misc.ProxyGenerator;

public class TestFondLove {
	 public static void main(String[] args) {
//		 new Zhangsan().findLove();
		 try {
			//Person obj=(Person)new Meipo().getInstance(new Zhangsan());
			//obj.findLove();//此时这个obj已经不再是Person，这个方法的调用只是为了唤醒代理的
			//invoke方法，具体的内容，我们还需要再invoke中进行处理
			/*
			 * 那么代理对象的原理
			 * 
			 * 1。拿到被代理对象的引用，然后获取他的接口
			 * 2.JDK代理重新生成一个类，同时实现我们给的代理对象的接口。
			 * 3.把被代理对象的引用拿到也会拿到了
			 * 4.重新动态生成一个class字节码
			 * 5。然后编译
			 * */
			
			//生成字节码文件
//			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", 
//					new Class[]{Person.class});
//			FileOutputStream os = new FileOutputStream("./$Proxy0.class");
//			os.write(data);
//			os.close();
			Person person=(Person)new MyMeipo().getInstance(new Zhangsan());
			System.out.println(person.getClass());
			person.findLove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

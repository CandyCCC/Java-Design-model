package singleton;

/**
 * 懒汉式的静态写法
 * @author Pop酱
 *
 */
public class Singleton4 {

	//设为私有无法修改
	//设为static全局唯一
	//防止反射机制
		private static class LazyHolder{
			//final 防止误操作，例如代理，cglib为例子，应为字节码重组的问题，这里
			//所有的修饰对于反射来说都是无意义的，所以这里用final操作，这个值无法修改
			private static final Singleton4 INSTANCE = new Singleton4();
		}
		
		static{
			
		}
		/*
		 * 静态块和静态类的一个解释
		 * 
		 * 对于静态块而言，无论这个类有没有被实例化，都是会执行
		 * 适合用一些简单的逻辑和资源准备，消耗性能不会太大的时候
		 * 
		 * 静态类，即便他是静态的，也不会直接加载到jvm中去
		 * 我们下面的这个getInstance中使用到了静态类的逻辑，
		 * 只有用户调用才会执行，逻辑所需要的内存，也是调用的时候才分配
		 * 所以你的静态类中可以写一些不是复杂一点的，但不是一开始就调用的逻辑
		 * 等你调用我再分配空间给你
		 * */
		//确保无法被外部实例
		private Singleton4(){}
		//确保别人不被覆盖
		public static final Singleton4 getInstance(){
			return LazyHolder.INSTANCE;
		}
}

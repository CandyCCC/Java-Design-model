package proxy.cglib;

/**
 * 现在展示，cglib方式实现代理
 * jdk需要有接口才可以实现，但是cglib可以使用类就能够使用动态代理，其实就是生成一个类来继承
 * @author 99405
 *
 */
public class NewPerson {
 
	public void findLove(){
		System.out.println("cglib的一些新要求");
	}
	
}

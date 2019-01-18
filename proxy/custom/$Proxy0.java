package proxy.custom;

import java.lang.reflect.Method;

public class $Proxy0 implements proxy.jdk.Person {
	MyInvocationHander h;

	public $Proxy0(MyInvocationHander h) {
		this.h = h;
	}

	public void findLove() {
		try {
			Method m = proxy.jdk.Person.class.getMethod("findLove",
					new Class[] {});
			this.h.invoke(this, m, null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
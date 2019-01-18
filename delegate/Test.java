package delegate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dispatcher d = new Dispatcher(new TargetA());
		/**
		 * 看上去像是项目经理在干活，
		 * 但实际上干活的是普通员工，
		 * 这就是典型的干活是我的，功劳是你的
		 */
		d.doing();
	}

}

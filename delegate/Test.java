package delegate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dispatcher d = new Dispatcher(new TargetA());
		/**
		 * ����ȥ������Ŀ�����ڸɻ
		 * ��ʵ���ϸɻ������ͨԱ����
		 * ����ǵ��͵ĸɻ����ҵģ����������
		 */
		d.doing();
	}

}

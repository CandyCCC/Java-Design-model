package factory.func;

public class FactoryTest {
	public static void main(String[] args) {
		
		//����ϸ�ֵĹ���ģʽ
		/**
		 * ����������û���˵�ǲ�̫����ģ��û�����������ʲô����
		 * ����Ҫ��
		 */
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//���󹤳�ģʽ
	}
}

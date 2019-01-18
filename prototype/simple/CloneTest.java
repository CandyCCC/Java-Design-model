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
		
		//����һ���ֳɵĶ�����������Ѿ���ʼ�����ˣ�����ʲô������
		/**
		 * �����½�һ�����󣬲��Ґ���½�����ֵ�����Ҹ�ֵ���ݺ�֮��һģһ����ʱ��
		 * 
		 * ORM�����õ�
		 * 
		 *����Ķ������Ժܶ��ʱ�򣬿��Կ�¡����¡��ֱ�Ӹ����ֽ���
		 *������¡��������ַ��һ���ˣ�Ӧ����ʹ����new�����Ƿ���ҲҪ��newInstance
		 *�����ڿ�¡��˵��ֱ�Ӹ����ֽ���
		 *����jvm��˵����������б�����Ҳ���ֽ��������
		 *
		 *
		 *�����ǳ����
		 *
		 *ǳ����
		 *�ܹ�ֱ�ӿ�����ʵ�����ݵ��������ͣ�ֻ֧��9�֣��˴��������+String
		 *�����ʹ����ArrayList֮��ģ�Ҳ���ܹ���ӡ����������ʹ�õ���ͬһ���ڴ�
		 *ָ����ͬһ����ַ
		 */
	}
	
}

package prototype.simple;

import java.util.ArrayList;
/**
 * ֱ������ʹ�õ��࣬�����ü̳еģ�ֻ�ǵ�����������
 * @author Pop��
 *
 */
public class ConcretePrototype1 implements Cloneable {

	public int age;

	public ArrayList<String> list = new ArrayList<String>();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// �������Ҫʵ���������ô����ط�����Ҫ����
		// ��Ȼ����arraylist���õ����

		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			prototype.list = (ArrayList) list.clone();

			// ��¡�ǻ����ֽ����
			//������������ǵ����ͺܸ��ӵ�ʱ������map������list��Ȼ�����ж����ʱ��
			//���ǵ����¡�ͻ�������
			//����Ϊ��¡�ǻ����ֽ���ģ��������ǻ��ǿ���ʹ�÷������ѭ�����
			
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

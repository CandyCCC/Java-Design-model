package template;

/**
 * ģ��ģʽ�����ϻ���ʵ��
 * @author Pop��
 *
 */
public abstract class Bevegrage {

	
	//�й̶������̣�����ʹ��ģ��ģʽ
	//�޷��ı� final
	public final void create(){
		/**
		 * 1����ˮ�տ�
		 * 2���ѱ���׼����,ԭ���Ϸ�����
		 * 3����ˮ����
		 * 4���Ӹ���
		 */
		boilWater();
		//��֪����ʲôԭ���ϣ�����
		pourInCup();
		brew();
		//�Ҳ������Ҫ��ʲô
		addCoundiments();
	}
	/**
	 * ��Ӹ���
	 */
	public abstract void addCoundiments();
	public void boilWater(){
		System.out.println("�տ�ˮ���յ�100��");
	}
	/**
	 * �Ž�������Ĳ���
	 */
	public abstract void pourInCup();
	public void brew(){
		System.out.println("����");
	}
}

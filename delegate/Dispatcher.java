package delegate;
/**
 * ί����
 * @author Pop��
 *
 */
public class Dispatcher implements IDelegate {

	IDelegate de = null;
	
	public Dispatcher(IDelegate de) {
		// TODO Auto-generated constructor stub
		this.de=de;
	} 
	
	
	
	/**
	 * ��Ŀ������ȻҲ��ִ�з�����
	 * ���ǹ���ְ��һ��,��������
	 */
	@Override
	public void doing() {
		// TODO Auto-generated method stub
		this.de.doing();
	}

}

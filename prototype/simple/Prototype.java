package prototype.simple;

import java.util.ArrayList;

/**
 * ԭ��ģʽ��ʵ��
 * @author Pop��
 *
 */
public class Prototype implements Cloneable{

	public ArrayList<String> list = new ArrayList<String>();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//�������Ҫʵ���������ô����ط�����Ҫ����
		//��Ȼ����arraylist���õ����
		
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
			prototype.list = (ArrayList)list.clone();
			
			//��¡�ǻ����ֽ����
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return prototype;
	}

}

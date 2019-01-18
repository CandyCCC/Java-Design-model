package prototype.greatestage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * �����ʥ
 * @author Pop��
 *
 */
public class TheGreatestSage extends Monkey implements Cloneable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�𹿰�
	private GoldRingedStaff staff;
	
	public GoldRingedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}

	//����
	public void change() {
		TheGreatestSage copySage;
		try {
			copySage = (TheGreatestSage) clone();
			System.out.println("�����������:"+this.getBirthday().getTime());
			System.out.println("��¡���������:"+copySage.getBirthday().getTime());
			System.out.println("�Ƿ�Ϊͬһ������:"+(this==copySage));
			System.out.println("�Ƿ���ͬһ���𹿰�:"+(this.getStaff()==copySage.getStaff()));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	TheGreatestSage() {
		//����ճ���ӵ����
		this.staff = new GoldRingedStaff();
		this.birthday = new Date();
		this.height=150;
		this.weight=30;
	}

	//������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//��¡�ǲ��߹��췽���ģ�ֱ���ֽ�������
		
		//��ȿ�¡
		ByteArrayOutputStream bos =null;
		ObjectOutputStream oos =null;
		
		ByteArrayInputStream bis =null;
		ObjectInputStream ois=null;
	
		
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			TheGreatestSage copy = (TheGreatestSage)ois.readObject();
			
			copy.birthday = new Date(); 
			
			return copy;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			try {
				bis.close();
				ois.close();
				bos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		return null;
	}
	
	
}

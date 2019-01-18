package prototype.greatestage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 齐天大圣
 * @author Pop酱
 *
 */
public class TheGreatestSage extends Monkey implements Cloneable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//金箍棒
	private GoldRingedStaff staff;
	
	public GoldRingedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRingedStaff staff) {
		this.staff = staff;
	}

	//分身
	public void change() {
		TheGreatestSage copySage;
		try {
			copySage = (TheGreatestSage) clone();
			System.out.println("本体的生日是:"+this.getBirthday().getTime());
			System.out.println("克隆后的生日是:"+copySage.getBirthday().getTime());
			System.out.println("是否为同一个对象:"+(this==copySage));
			System.out.println("是否是同一个金箍棒:"+(this.getStaff()==copySage.getStaff()));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	TheGreatestSage() {
		//孙悟空出生拥有了
		this.staff = new GoldRingedStaff();
		this.birthday = new Date();
		this.height=150;
		this.weight=30;
	}

	//分身技能
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//克隆是不走构造方法的，直接字节流复制
		
		//深度克隆
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

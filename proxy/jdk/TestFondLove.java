package proxy.jdk;

import java.io.FileOutputStream;

import proxy.custom.MyMeipo;
import sun.misc.ProxyGenerator;

public class TestFondLove {
	 public static void main(String[] args) {
//		 new Zhangsan().findLove();
		 try {
			//Person obj=(Person)new Meipo().getInstance(new Zhangsan());
			//obj.findLove();//��ʱ���obj�Ѿ�������Person����������ĵ���ֻ��Ϊ�˻��Ѵ����
			//invoke��������������ݣ����ǻ���Ҫ��invoke�н��д���
			/*
			 * ��ô��������ԭ��
			 * 
			 * 1���õ��������������ã�Ȼ���ȡ���Ľӿ�
			 * 2.JDK������������һ���࣬ͬʱʵ�����Ǹ��Ĵ������Ľӿڡ�
			 * 3.�ѱ��������������õ�Ҳ���õ���
			 * 4.���¶�̬����һ��class�ֽ���
			 * 5��Ȼ�����
			 * */
			
			//�����ֽ����ļ�
//			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", 
//					new Class[]{Person.class});
//			FileOutputStream os = new FileOutputStream("./$Proxy0.class");
//			os.write(data);
//			os.close();
			Person person=(Person)new MyMeipo().getInstance(new Zhangsan());
			System.out.println(person.getClass());
			person.findLove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

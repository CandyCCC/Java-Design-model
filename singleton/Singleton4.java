package singleton;

/**
 * ����ʽ�ľ�̬д��
 * @author Pop��
 *
 */
public class Singleton4 {

	//��Ϊ˽���޷��޸�
	//��Ϊstaticȫ��Ψһ
	//��ֹ�������
		private static class LazyHolder{
			//final ��ֹ��������������cglibΪ���ӣ�ӦΪ�ֽ�����������⣬����
			//���е����ζ��ڷ�����˵����������ģ�����������final���������ֵ�޷��޸�
			private static final Singleton4 INSTANCE = new Singleton4();
		}
		
		static{
			
		}
		/*
		 * ��̬��;�̬���һ������
		 * 
		 * ���ھ�̬����ԣ������������û�б�ʵ���������ǻ�ִ��
		 * �ʺ���һЩ�򵥵��߼�����Դ׼�����������ܲ���̫���ʱ��
		 * 
		 * ��̬�࣬�������Ǿ�̬�ģ�Ҳ����ֱ�Ӽ��ص�jvm��ȥ
		 * ������������getInstance��ʹ�õ��˾�̬����߼���
		 * ֻ���û����òŻ�ִ�У��߼�����Ҫ���ڴ棬Ҳ�ǵ��õ�ʱ��ŷ���
		 * ������ľ�̬���п���дһЩ���Ǹ���һ��ģ�������һ��ʼ�͵��õ��߼�
		 * ����������ٷ���ռ����
		 * */
		//ȷ���޷����ⲿʵ��
		private Singleton4(){}
		//ȷ�����˲�������
		public static final Singleton4 getInstance(){
			return LazyHolder.INSTANCE;
		}
}

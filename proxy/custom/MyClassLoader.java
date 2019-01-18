package proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//���ƴ�������ɣ����룬����load��jvm�� ����
public class MyClassLoader extends ClassLoader{

	private File baseDir;
	
	public MyClassLoader(){
		//�ҵ�ԭ��·��
		String basePath=MyClassLoader.class.getResource("").getPath();
		this.baseDir = new File(basePath);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//���ص�jvm������
		String className = MyClassLoader.class.getPackage().getName()+"."+name;
		if(baseDir!=null){
			//����ط����Ǵ�֮ǰ�Ĵ����Ѿ�������ɺ���ļ��У���ȡ����������
			File classFile = new File(baseDir,name.replaceAll("\\.", "/")+".class");
			if(classFile.exists()){
				FileInputStream in = null;
				ByteArrayOutputStream out = null;
				try {
					in = new FileInputStream(classFile);
					out= new ByteArrayOutputStream();
					byte [] buff = new byte[1024];
					int len=0;
					while((len=in.read(buff))!=-1){
						out.write(buff, 0, len);
					}
					//��һ���ֽ�����ת��Ϊ Class ���ʵ����������� Class��Ȼ�����ʹ������ 
					return defineClass(className, out.toByteArray(), 0,out.size());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally{
					
					if(null!=in){
						try {
							in.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(null!=out){
						try {
							out.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					//��ɺ󣬾Ϳ���ɾ����
					classFile.delete();
				}
			}
		}
		return null;
	}
   
}

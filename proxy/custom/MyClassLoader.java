package proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//控制代码的生成，编译，重新load到jvm， 代理
public class MyClassLoader extends ClassLoader{

	private File baseDir;
	
	public MyClassLoader(){
		//找到原有路径
		String basePath=MyClassLoader.class.getResource("").getPath();
		this.baseDir = new File(basePath);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//加载到jvm里面来
		String className = MyClassLoader.class.getPackage().getName()+"."+name;
		if(baseDir!=null){
			//这个地方，是从之前的代码已经解析完成后的文件中，提取出来的内容
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
					//将一个字节数组转换为 Class 类的实例。必须分析 Class，然后才能使用它。 
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
					//完成后，就可以删掉了
					classFile.delete();
				}
			}
		}
		return null;
	}
   
}

package proxy.custom;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

//���ɴ������Ĵ���
public class MyProxy {

	private static String ln = "\r\n";

	protected MyInvocationHander h;

	public static Object newProxyInstance(MyClassLoader loader,
			Class<?>[] interfaces, MyInvocationHander h)
			throws IllegalArgumentException {

		// 1.����Դ����
		String proxySrc = generateSrc(interfaces[0]);
	
		try {
			// 2.�����ɵ�Դ������������̣�����Ϊ.java�ļ�
			String filePath = MyProxy.class.getResource("").getPath();
			System.out.println(filePath);
			// �и�������$���ſ�ͷ��java�ļ����Ǹ��������
			File f = new File(filePath + "$Proxy0.java");
			FileWriter fw = new FileWriter(f);
			fw.write(proxySrc);
			fw.flush();
			fw.close();
			
			// 3.����Դ���룬��������.class�ļ�
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
			Iterable iterable = manager.getJavaFileObjects(f);
			
			CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
			task.call();
			manager.close();
			// 4.��class�ļ��е����ݣ���̬���ص�JVM����
			Class proxyClass = loader.findClass("$Proxy0");
			Constructor c =proxyClass.getConstructor(MyInvocationHander.class);
			// 5.���ر������Ĵ������
			return c.newInstance(h);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return null;
	}

	private static String generateSrc(Class<?> interface0) {

		StringBuilder src = new StringBuilder();
		src.append("package proxy.custom;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);

		src.append("public class $Proxy0 implements " + interface0.getName()
				+ "{" + ln);

		src.append("MyInvocationHander h;" + ln);
		src.append("public $Proxy0(MyInvocationHander h){" + ln);
		src.append("this.h=h;" + ln);
		src.append("}" + ln);

		for (Method m : interface0.getMethods()) {
			src.append("public " + m.getReturnType().getName() + " " + m.getName()
					+ "(){");
			src.append("try{"+ln);
			src.append("Method m = " + interface0.getName()
					+ ".class.getMethod(\"" + m.getName()
					+ "\",new Class[]{});");
			src.append("this.h.invoke(this,m,null);" + ln);
			src.append("}catch(Throwable e){"+ln);
			src.append("e.printStackTrace();}"+ln);
//			if(!m.getReturnType().getName().equals("void")){
//				src.append("return ")
//			}
			src.append("}");
		};
		src.append("}");
		return src.toString();
	}
}

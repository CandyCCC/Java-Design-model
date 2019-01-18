package proxy.jdk;

//张三，单身
public class Zhangsan implements Person {

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String sex = "男";
	private String name = "zhangsan";
	
	@Override
	public void findLove() {
		// TODO Auto-generated method stub
		System.out.println("条件1"+this.name+" "+this.sex);
		System.out.println("条件2");
		System.out.println("条件3");
		System.out.println("条件4");
	}


}

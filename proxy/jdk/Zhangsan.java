package proxy.jdk;

//����������
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

	private String sex = "��";
	private String name = "zhangsan";
	
	@Override
	public void findLove() {
		// TODO Auto-generated method stub
		System.out.println("����1"+this.name+" "+this.sex);
		System.out.println("����2");
		System.out.println("����3");
		System.out.println("����4");
	}


}

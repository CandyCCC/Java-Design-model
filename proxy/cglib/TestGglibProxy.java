package proxy.cglib;

public class TestGglibProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NewPerson obj=(NewPerson)new NewMeipo().getInstance(NewPerson.class);
			obj.findLove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

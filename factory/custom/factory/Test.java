package factory.custom.factory;

import factory.custom.util.MosterConst;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMosterFactory factory = new DefaultMosterFactory();
		factory.getMoster(MosterConst.GOBIN).attack();
	}

}

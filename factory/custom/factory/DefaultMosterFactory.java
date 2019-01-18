package factory.custom.factory;

import factory.custom.bean.Moster;

public class DefaultMosterFactory extends MosterFactory {

	private OrcFactory defaultFactory = new OrcFactory();

	@Override
	protected Moster getMoster() {
		// TODO Auto-generated method stub
		return defaultFactory.getMoster();
	}

}

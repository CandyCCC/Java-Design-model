package factory.custom.factory;

import factory.custom.bean.Moster;
import factory.custom.bean.Orc;

public class OrcFactory extends MosterFactory {

	@Override
	protected Moster getMoster() {
		// TODO Auto-generated method stub
		return new Orc();
	}

}

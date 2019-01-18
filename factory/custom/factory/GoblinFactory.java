package factory.custom.factory;

import factory.custom.bean.Goblin;
import factory.custom.bean.Moster;

public class GoblinFactory extends MosterFactory {

	@Override
	protected Moster getMoster() {
		// TODO Auto-generated method stub
		return new Goblin();
	}

}

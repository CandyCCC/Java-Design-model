package factory.custom.factory;

import factory.custom.bean.Moster;
import factory.custom.util.MosterConst;

public abstract class MosterFactory {
	
	//默认生产兽人
	
	protected abstract Moster getMoster();
	
	public Moster getMoster(MosterConst type){
		switch(type){
			case GOBIN:
				return new GoblinFactory().getMoster();
			case ORC:return new OrcFactory().getMoster();
			default: System.out.println("请正确输入");
			return null;
		}
	}
	
}

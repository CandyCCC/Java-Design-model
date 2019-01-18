package factory.custom.factory;

import factory.custom.bean.Moster;
import factory.custom.util.MosterConst;

public abstract class MosterFactory {
	
	//Ĭ����������
	
	protected abstract Moster getMoster();
	
	public Moster getMoster(MosterConst type){
		switch(type){
			case GOBIN:
				return new GoblinFactory().getMoster();
			case ORC:return new OrcFactory().getMoster();
			default: System.out.println("����ȷ����");
			return null;
		}
	}
	
}

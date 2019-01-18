package delegate;
/**
 * 委派者
 * @author Pop酱
 *
 */
public class Dispatcher implements IDelegate {

	IDelegate de = null;
	
	public Dispatcher(IDelegate de) {
		// TODO Auto-generated constructor stub
		this.de=de;
	} 
	
	
	
	/**
	 * 项目经理，虽然也有执行方法，
	 * 但是工作职责不一样,分配任务
	 */
	@Override
	public void doing() {
		// TODO Auto-generated method stub
		this.de.doing();
	}

}

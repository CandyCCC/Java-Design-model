package template;

/**
 * 模板模式，饮料机的实现
 * @author Pop酱
 *
 */
public abstract class Bevegrage {

	
	//有固定的流程，我们使用模板模式
	//无法改变 final
	public final void create(){
		/**
		 * 1，把水烧开
		 * 2，把被子准备好,原材料放里面
		 * 3，用水冲泡
		 * 4，加辅料
		 */
		boilWater();
		//不知道放什么原材料，抽象
		pourInCup();
		brew();
		//我不清楚你要放什么
		addCoundiments();
	}
	/**
	 * 添加辅料
	 */
	public abstract void addCoundiments();
	public void boilWater(){
		System.out.println("烧开水，烧到100度");
	}
	/**
	 * 放进被子里的材料
	 */
	public abstract void pourInCup();
	public void brew(){
		System.out.println("冲泡");
	}
}

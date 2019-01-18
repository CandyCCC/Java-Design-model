package strategy;

/**
 * 对于策略模式来说，
 * 我们只需要关系两个问题，第一个是起点一个终点
 * 而我们从起点到达终点的方式有很多，可以走路，骑车
 * 但是结果都是一样的，我们都到了终点
 * @author Pop酱
 *
 */
public class StrategyC implements Comparable {

	/**
	 * 实现比较方法是个很明显的策略模式，
	 * 他的返回值都是1 0 -1的结果
	 * 结果是一样的，
	 * 但是比较的方式很多，我们可以根据自己的需求完成比较
	 */
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

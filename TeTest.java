package template;

public class TeTest {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.create();
		
		//spring JDBC 模板模式
		/**
		 * 是java规范，各个数据库厂商自己去实现
		 * 1 加载驱动类 drivermanager
		 * 2 建立链接 (连接方法)
		 * 3 创建语句集（语法不一样，mysql oracle sqlserver）
		 * 4 执行
		 * 5结果集resultSet游标
		 * orm(?)
		 */
	}
}

package pop.pattern.oberverandproxy.proxy;

import pop.pattern.oberverandproxy.subject.Human;

/**
 * @author Pop
 * @date 2019/1/24 18:21
 */
public class PorxyTest {
    public static void main(String[] args) {
        //使用动态代理来实现
        Pop pop = new Pop();
        Human popProxy = (Human) new PopProxy().getInstance(pop);
        popProxy.jump();
    }
}

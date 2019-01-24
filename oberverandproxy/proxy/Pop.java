package pop.pattern.oberverandproxy.proxy;

/**
 * @author Pop
 * @date 2019/1/24 16:12
 */

import pop.pattern.oberverandproxy.subject.Human;

/**
 * 使用动态代理实现
 */
public class Pop implements  Human {
    /***
     *
     */
    @Override
    public void run() {
        System.out.println(this+"开始奔跑");
    }

    @Override
    public void jump() {
        System.out.println(this+"开始跳跃");
    }

    @Override
    public String toString() {
        return "POP酱";
    }
}

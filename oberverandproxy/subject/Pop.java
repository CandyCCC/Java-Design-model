package pop.pattern.oberverandproxy.subject;

/**
 * @author Pop
 * @date 2019/1/24 16:12
 */

import pop.pattern.oberverandproxy.core.EventListener;

/**
 * POP作为被观察的人
 */
public class Pop extends EventListener implements  Human {
    /***
     *
     */
    @Override
    public void run() {
        System.out.println(this+"开始奔跑");
        trigger(EventType.RUN);
    }

    @Override
    public void jump() {
        System.out.println(this+"开始跳跃");
        trigger(EventType.JUMP);
    }

    @Override
    public String toString() {
        return "POP酱";
    }
}

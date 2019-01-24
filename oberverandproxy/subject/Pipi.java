package pop.pattern.oberverandproxy.subject;

/**
 * @author Pop
 * @date 2019/1/24 16:51
 */

import pop.pattern.oberverandproxy.core.Event;

/**
 * Pipi是观察者
 */
public class Pipi {

    /**
     * 这是一个简单的反馈方法
     * 当pop有所举动的时候，pipi将会有相应的举动
     * @param e
     */
    public void advice(Event e){
        //Event是获得的信息
        System.out.println("触发日志，这是得到的反馈==========="+e);
    }

}

package pop.pattern.oberverandproxy.subject;

import pop.pattern.oberverandproxy.core.Event;

import java.lang.reflect.Method;

/**
 * @author Pop
 * @date 2019/1/24 17:38
 */
public class Main {
    public static void main(String[] args) {
        //创建一个pipi
        try {
            Pipi pipi = new Pipi();
            //创建一个Pop
            Method advice = Pipi.class.getMethod("advice",new Class[]{ Event.class});
            Pop pop = new Pop();
            //pop.addListener(EventType.RUN,pipi,advice);

            pop.run();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

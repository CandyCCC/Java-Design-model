package pop.pattern.oberverandproxy.core;

/**
 * @author Pop
 * @date 2019/1/24 17:09
 */

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

/**
 * 事件
 */
public class Event {

    //事件源头 被观察者
    private Object source;

    //目标对象 观察者
    private Object target;

    //某个方法
    private Method method;
    //触发
    private String tigger;
    private long occurTime;

    Event(Object target, Method callBack){
        this.target=target;
        this.method = callBack;
    }

    @Override
    public String toString() {
        return String.format("\n事件源是：%s \n" +
                "观察的人是:%s \n 得到这些信息的方法是:%s \n",
                source,target,method.getName());
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public Event setMethod(Method method) {
        this.method = method;
        return this;
    }

    public String getTigger() {
        return tigger;
    }

    public Event setTigger(String tigger) {
        this.tigger = tigger;
        return this;
    }

    public long getOccurTime() {
        return occurTime;
    }

    public Event setOccurTime(long occurTime) {
        this.occurTime = occurTime;
        return this;
    }
}

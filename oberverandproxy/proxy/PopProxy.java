package pop.pattern.oberverandproxy.proxy;

import pop.pattern.oberverandproxy.core.Event;
import pop.pattern.oberverandproxy.core.EventListener;
import pop.pattern.oberverandproxy.subject.EventType;
import pop.pattern.oberverandproxy.subject.Human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Pop
 * @date 2019/1/24 17:51
 */
public class PopProxy extends EventListener implements InvocationHandler {

    private Human target;
    private Method advice;
    /**
     * 这是一个简单的反馈方法
     * 当pop有所举动的时候，pipi将会有相应的举动
     * @param e
     */
    public void advice(Event e){
        //Event是获得的信息
        System.out.println("触发日志，这是得到的反馈==========="+e);
    }

    public Object getInstance(Human human){
        this.target = human;
        Class clazz = human.getClass();
        try {
            advice = PopProxy.class.getMethod("advice",new Class[]{ Event.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //这里，代理的东西可以弄出来，字节码重组出来的代码
        //我们需要判断调用哪一行代码
        EventType e1=null;
        for(EventType e : EventType.values()) {
            if (e.getDescribe().equals(method.getName())) {
                e1 =e;
                addListener(e, this, advice);
                break;
            } else {
                continue;
            }
        }
        method.invoke(this.target,args);
        trigger(e1);
        return null;
    }
}

package pop.pattern.oberverandproxy.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pop
 * @date 2019/1/24 17:21
 */
public class EventListener {

    protected  Map<Enum,Event> eventMap = new HashMap<Enum,Event>();

    //注册方法
    public void addListener(Enum eventType, Object target, Method callBack){
        eventMap.put(eventType,new Event(target,callBack));
    }

    private void trigger(Event e){
        e.setSource(this).setOccurTime(System.currentTimeMillis());
        //调用原来的方法
        try {
            e.getMethod().invoke(e.getTarget(),e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    //注册完成以后，我们要获得触发的方法
    protected void trigger(Enum evenType){

        if(evenType==null||!eventMap.containsKey(evenType)) return;
        //我们需要记住的是，当外部调用这个方法的，能走到这里应该是已经注册好了
        //所以我们现在使用链式编程重新组装一下其他必要条件
        trigger(this.eventMap.get(evenType).setTigger(evenType.toString()));
    }
}

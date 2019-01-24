package pop.pattern.oberverandproxy.subject;

/**
 * @author Pop
 * @date 2019/1/24 17:19
 */
public enum EventType {
    JUMP("jump"),RUN("rum");
    private String describe;
    private EventType(String name){
        this.describe=name;
    }
    public String getDescribe(){return this.describe;}
}

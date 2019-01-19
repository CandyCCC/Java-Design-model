package homework.singleton;

/**
 * @author Pop
 * @date 2019/1/19 21:11
 */
public class Person {
    /***
     * 假设人身上的所有器官都是唯一的，
     * 不可能同时有两个器官，所以，有一个场景
     * 医生只可能在一个人的身上摘除一个器官
     * 所以每个器官都应该是单例
     */
    private Person(){}
    private final static class Body{
        private static final Lung LUNG = new Lung();
        private static final Liver LIVER = new Liver();
    }
    public final static Organ getLung(){
        return Body.LUNG;
    }
    public final static Organ getLiver(){
        return Body.LIVER;
    }
}
//肺部
class Lung implements  Organ{
}
//肝脏
class Liver implements  Organ{
}
package homework.prototype;

/**
 * @author Pop
 * @date 2019/1/19 21:54
 */

/**
 * 工厂可以生产面包
 */
public class Factory {
    public static void main(String[] args) {
        //现在开始生产面包
        Bread bread = new Bread(new Ham());
        bread.create();
    }
}

package homework.singleton;

/**
 * @author Pop
 * @date 2019/1/19 21:16
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * 手术台
 */
public class OperatingTable{

    /***
     * 医生，具备手术的能力
     */
    private static class Doctor implements  Runnable{
        private  CountDownLatch latch=null;
        public Doctor(CountDownLatch latch){
            this.latch = latch;
        }
        @Override
        public void run() {
            try {
                this.latch.countDown();
                this.latch.await();
                operation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /***
         * 每一次手术都可以取出一个器官，但是器官肯定都是一样的
         * 也就是无法初始化两次
         *
         */
        public void operation(){
            System.out.println("医生取出了:肝脏"+Person.getLiver());
            System.out.println("医生取出了:肺部"+Person.getLung());
        }
    }
    static final int SIZE = 100;
    public static void main(String[] args) {
        //手术开始
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(SIZE);
        for(int i =0;i<SIZE;i++){
            exec.execute(new Doctor(latch));
        }
        System.out.println("Launched all tasks");
        exec.shutdown();
    }
}

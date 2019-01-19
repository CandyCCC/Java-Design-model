package homework.prototype;

import java.io.*;

/**
 * @author Pop
 * @date 2019/1/19 21:56
 */
public class Bread implements Cloneable, Serializable {
    private String price="10$";
    private Ham ham=null;
    //面包火腿，生产的时候加火腿
    public Bread(Ham ham){
        this.ham = ham;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Ham getHam() {
        return ham;
    }

    public void setHam(Ham ham) {
        this.ham = ham;
    }

    /***
     * 创造面包的方法
     */
    public void create(){
        Bread anotherBread = null;
        try {
            anotherBread = (Bread) clone();
            System.out.format("原来的面包是：%s,里面的火腿肠是: %s \r\n",this,this.getHam());
            System.out.format("原来的面包是：%s,里面的火腿肠是: %s",anotherBread,anotherBread.getHam());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //重写
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos =null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        Bread bread = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //取回来
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            bread = (Bread)ois.readObject();
            bread.setHam(new Ham());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                ois.close();
                bos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return bread;
    }
}

class Ham implements Serializable{
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String price = "5$";
}

package SingletonDay1;
// 单例设计的初衷是，某一个类只能存在一个实例对象
// 参考：https://blog.csdn.net/qq_37904799/article/details/81807954

public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();   // 由于是静态的实例对象，所以直接通过类直接调用类 内部的方法
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);   // 由于是静态方法创建的实例,所以利用共享机制。地址是一样返回true
    }
}


class Bank {
    // 定义一个私有的构造器
    private Bank() {
    }   // 避免在类的外部调用Bank类


    //内部创建类的对象
    private static Bank instance = new Bank();

    // 提供一个公共的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}
// 单例模式的模板
class Singleton{
    // 私有化类
    private Singleton(){}

    private static Singleton instance = null;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}




























package ThreadSingletonMethod2;
// 利用synchronized

public class Bank {
    private Bank() {
    }

    private static Object lock = new Object();
    private static Bank bank = null;

    public static Bank getInstance() {
        // 效率差的synchronized
        synchronized (lock) {
            if (bank == null) {
                bank = new Bank();
            }
            return bank;
        }
    }

}

class Bank2 {
    private Bank2() {
    }

    private static Bank2 instance = null;

    public static Bank2 getInstance() {
        // 利用synchronized代码块实现线程安全
        if (instance == null) {
            // 让线程全部进去，只是 只有一个线程进入
            synchronized (Bank2.class) {
                if (instance == null) {
                    instance = new Bank2();
                }
            }
        }
        return instance;
    }
}

package ThreadSingletonMethod1;
// 利用synchronized() 实现单例模式的线程安全

public class Bank {
    private Bank(){}

    private static Bank bank = null;
    public static synchronized Bank getInstance(){
        if(bank == null){
            bank = new Bank();
        }
        return bank;
    }
}

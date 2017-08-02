package cn.icodelife.dp.singleton;

/**
 * Created by lichunting on 2017/8/2.
 *
 * 饿汉式单例模式[天然的线程安全的模式]
 */
public class SingletonDemo1 {
    //类初始化时立即加载
    private static SingletonDemo1 instance = new SingletonDemo1();
    //私有化构造函数
    private SingletonDemo1(){}
    //方法没有同步，调用效率高
    public  static SingletonDemo1 getInstance(){
        return  instance;
    }

}

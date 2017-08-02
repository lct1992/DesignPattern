package cn.icodelife.dp.singleton;

/**
 * Created by lichunting on 2017/8/2.
 * 懒汉式实现单例模式
 */
public class SingletonDemo2 {
    //类加载的时候不初始化这个对象（延时加载，真正用的时候再加载）
    private static SingletonDemo2 instance;
    //私有化构造函数
    private SingletonDemo2(){}
    //方法同步，调用效率低
    private static synchronized SingletonDemo2 getInstance(){
        if(instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}

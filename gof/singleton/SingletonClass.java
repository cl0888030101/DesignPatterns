package gof.singleton;

/*
* Singleton class: the constructor is private, only one instance can be created
*
* */
public class SingletonClass {
    private SingletonClass(){}
    private static SingletonClass mInstance = null;

    private static synchronized SingletonClass getInstance(){
        if(mInstance == null){
            mInstance = new SingletonClass();
        }
        return mInstance;
    }
}

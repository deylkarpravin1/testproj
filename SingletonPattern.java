package t;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;
    private SingletonPattern()
    {

    }
    public static SingletonPattern getSingletonObject()
    {
        if (singletonPattern == null)
        {
            synchronized (SingletonPattern.class){
                if (singletonPattern == null){
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }
}


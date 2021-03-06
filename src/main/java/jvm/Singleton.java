package jvm;

public class Singleton {

    private Singleton() {
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println("LazyHolder.");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag) return new LazyHolder[2]; //new数组并不会导致LazyHolder被初始化
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {
        getInstance(true);
        System.out.println("----");
        getInstance(false);
    }

}

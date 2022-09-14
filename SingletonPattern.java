class Singleton {
    private static class singletonInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return singletonInstanceHolder.INSTANCE;
    }
}



public class Singleton_Run {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
    }
}

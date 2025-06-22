public class Test {
    public static void main(String[] args) {
        ThreadSafeDoubleLockingLogger l1 = ThreadSafeDoubleLockingLogger.getInstance();
        ThreadSafeDoubleLockingLogger l2 = ThreadSafeDoubleLockingLogger.getInstance();

        System.out.println(l1 == l2 ? "Objects are same" : "Objects are different");
    }
}

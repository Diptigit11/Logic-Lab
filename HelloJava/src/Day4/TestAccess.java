package Day4;

public class TestAccess {

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        obj.publicMethod();      // ✅ allowed
        obj.protectedMethod();   // ✅ allowed
        obj.defaultMethod();     // ✅ allowed

        // obj.privateMethod();  // ❌ NOT allowed (compile-time error)
    }
}

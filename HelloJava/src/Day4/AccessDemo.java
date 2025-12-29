package Day4;

public class AccessDemo {

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

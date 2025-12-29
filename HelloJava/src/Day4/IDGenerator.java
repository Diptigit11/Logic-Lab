package Day4;

public class IDGenerator {

    // shared counter
    private static int next = 1000;

    // returns current ID, then increments
    public static int nextId() {
        return next++;
    }
}

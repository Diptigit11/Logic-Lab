package Day4;

public class Counter {
    // Instance field: each object has its own value
    private int value;

    // Static field: shared among all objects, counts total instances
    public static int instances = 0;

    // Constructor: increments instances whenever a new object is created
    public Counter() {
        instances++;
        this.value = 0; // optional initialization
    }

    // Method to increment this counter's value
    public void increment() {
        value++;
    }

    // Method to decrement this counter's value
    public void decrement() {
        value--;
    }

    // Method to get this counter's value
    public int getValue() {
        return value;
    }

    // Main method to test
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();

        System.out.println("Total instances: " + Counter.instances); // 3

        a.increment();
        b.increment();
        b.increment();
        c.decrement();

        System.out.println("a value: " + a.getValue()); // 1
        System.out.println("b value: " + b.getValue()); // 2
        System.out.println("c value: " + c.getValue()); // -1
    }
}

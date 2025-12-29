package Day4;

public class Temperature {

    // immutable field
    private final double celsius;

    // constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // converts Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // returns a NEW Temperature object
    public Temperature withCelsius(double c) {
        return new Temperature(c);
    }

    // optional getter (read-only)
    public double getCelsius() {
        return celsius;
    }

    // testing
    public static void main(String[] args) {
        Temperature t = new Temperature(25.0);
        System.out.println(t.toFahrenheit()); // 77.0

        Temperature t2 = t.withCelsius(30.0);

        System.out.println(t.getCelsius());  // 25.0 (unchanged)
        System.out.println(t2.getCelsius()); // 30.0
    }
}

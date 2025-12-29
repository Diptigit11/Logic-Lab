package Day4;

public class Vector2D {

    // immutable fields
    private final double x;
    private final double y;

    // public constants
    public static final Vector2D ZERO   = new Vector2D(0, 0);
    public static final Vector2D UNIT_X = new Vector2D(1, 0);
    public static final Vector2D UNIT_Y = new Vector2D(0, 1);

    // constructor
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // static factory using polar coordinates
    public static Vector2D fromPolar(double r, double theta) {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        return new Vector2D(x, y);
    }

    // add vectors (returns new object)
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // scale vector (returns new object)
    public Vector2D scale(double s) {
        return new Vector2D(this.x * s, this.y * s);
    }

    // magnitude of vector
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    // optional getters (read-only)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // test
    public static void main(String[] args) {

        Vector2D v = Vector2D.fromPolar(2, Math.PI / 2);
        Vector2D w = Vector2D.UNIT_X.add(v);

        System.out.println("v = (" + v.getX() + ", " + v.getY() + ")");
        System.out.println("w = (" + w.getX() + ", " + w.getY() + ")");
        System.out.println("Magnitude of v = " + v.magnitude());
    }
}

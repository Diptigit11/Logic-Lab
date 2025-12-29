package Day4;

public class User {

    // each user has a fixed ID
    private final int id;
    private String name;

    // constructor assigns ID automatically
    public User(String name) {
        this.id = IDGenerator.nextId();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
    	  User u1 = new User("A");
          User u2 = new User("B");
          User u3 = new User("C");

          System.out.println(u1.getId()); // 1000
          System.out.println(u2.getId()); // 1001
          System.out.println(u3.getId()); // 1002
}
}

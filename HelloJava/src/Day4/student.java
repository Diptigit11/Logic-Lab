package Day4;

public class student {
	static class studentId{
		final int id ;
		private String name;
		public void setID(int ids) {
			//this.id = ids;
		}
		public studentId(int id) {
			this.id = id;
		}
		public int getID() {
			return id;
		}
		public String getName()
		{
			return name;
			}
		public void setName(String name) {
			this.name = name;
		}
		}
		

	public static void main(String[] args) {
		studentId s = new studentId(101);
		s.setName("Alice");
		System.out.println(s.getID()); // 101
		System.out.println(s.getName());
		// s.id = 202; // should not compile

	}

}

package Day4;

public class l_and_b {
	static class Rectangle{
		private double height;
		private double width;
		public double getWidth() {
			return width;
		}
		public double getHeight() {
			return height;
		}
		public void setWidth(double w) {
			if(w > 0) {
			this.width = w;
			}
	}
		public void setHeight(double h) {
			if(h > 0) {
			this.height = h;
			}
		}
			public double area(double h , double w){
				return h * w;
			}
			public double perimeter(double h , double w){
				return 2 * (h + w);
			}
	}
			

	public static void main(String[] args) {
		System.out.println("hello");
		Rectangle r = new Rectangle();
		
		r.setWidth(10);
		 r.setHeight(5);
		double w =  r.getWidth();
		double h = r.getHeight();
		System.out.println(r.area(h , w));      // 50.0
		System.out.println(r.perimeter(h , w)); // 30.0
		r.setWidth(0); // silently rejected (bonus)
	}

}

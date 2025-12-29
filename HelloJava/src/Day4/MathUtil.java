package Day4;

public class MathUtil {
		public static int max(int a, int b) {
			if(a > b) {
				return a;
			}else {
				return b;
			}
		}
		public static int clamp(int v, int min, int max) {
			if(v < min) return min;
			if(v > max) return max;
			return v;
		}

	public static void main(String[] args) {
		System.out.println(MathUtil.max(7, 3));            // 7
		System.out.println(MathUtil.clamp(15, 0, 10));     // 10
		System.out.println(MathUtil.clamp(-3, -2, 5));  
	}

}

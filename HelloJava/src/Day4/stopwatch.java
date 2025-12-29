package Day4;

public class stopwatch {
	 class Stopwatch {
		private boolean isRunning;
		private int ticks;
		public Stopwatch() {
			isRunning = false;
	        ticks = 0;
	    }
	 public boolean isRunning() {
		return isRunning;
	}
	 public void start() {
		 isRunning =  true;
	 }
	 public void stop() {
		 isRunning =  false;
	 }
	 public void incrementTick() {
		if(isRunning()) ticks++;
	}
	 public int elapsed() {
		 return ticks;
	 }
	 public void reset() {
		 ticks = 0;
	 }

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		for(int i = 0 ; i < 1000 ; i++) {
		sw.incrementTick();
		//sw.stop();
		}
		sw.stop();
		System.out.println(sw.elapsed());
	}

}
package clock;

public class ClockMain {

	public static void main(String[] args) {
		Clock BigBen = new Clock();
		Clock BdsTag = new Clock();
		
		BigBen.setTime(1500);
		BigBen.setTimeZone("UK");
		BigBen.printTime();
		
		BdsTag.setTime(1600);
		BdsTag.setTimeZone("DE");
		BdsTag.printTime();
		
	}

}

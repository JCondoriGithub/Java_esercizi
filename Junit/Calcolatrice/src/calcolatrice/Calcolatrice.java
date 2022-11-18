package calcolatrice;

public class Calcolatrice {

	private int lastResult;
	
	public Calcolatrice() {
		lastResult = 0;
	}
	
	public int add(int a, int b) {
		
		lastResult = a + b;
		return lastResult;
	}
	
	public int sub(int a,  int b) {
		
		lastResult = a - b;
		return lastResult;
	}
	
	public int add(int v) {
		
		lastResult += v;
		return lastResult;
	}
	
	public int sub(int v) {
		
		lastResult -= v;
		return lastResult;
	}
	
	public int getLastResult() {
		return lastResult;
	}
	
	public void clear() {
		lastResult = 0;
	}
}

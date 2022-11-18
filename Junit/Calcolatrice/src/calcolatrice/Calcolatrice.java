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
	
	public int div(int a, int b) {
		
		if(b == 0)
			throw new ArithmeticException("non puoi dividere per zero!");
		
		lastResult = a / b;
		return lastResult;
	}
	
	public int getLastResult() {
		return lastResult;
	}
	
	public void slowMethod() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void clear() {
		lastResult = 0;
	}
}

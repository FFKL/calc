public class Calculator {
	private int result;
	private int save;
	
	public void add (int first, int second) {
		this.result = first + second;
	}
	
	public void sub (int first, int second) {
		this.result = first - second;
	}
	
	public void mul (int first, int second) {
		this.result = first * second;
	}
	
	public void div (int first, int second) throws ArithmeticException {
		this.result = first / second;
	}
	
	public void setSave() {
		this.save = result;
	}
	
	public int getSave() {
		return this.save;
	}
	
	public void cleanSave() {
		this.save = 0;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
	}
}
public class Calculate {

	public static void main(String[] args) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		System.out.println("Sum " + summ);
		int subs = first - second;
		System.out.println("Sub " + subs);
		int div = first / second;
		System.out.println("Div " + div);
		int mul = first * second;
		System.out.println("Mul " + mul);
	}
}
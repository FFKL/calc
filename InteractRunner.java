import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String save = "clear";
			String  first = "";
			while (!exit.equals("yes")) {
				System.out.println("Select Operation: ");
				String operation = reader.next();
				if (save.equals("save")){
                    calc.setSave();
					first = "" + calc.getSave();
                }
				else {
                    calc.cleanResult();
                    calc.cleanSave();
                    System.out.println("Enter first arg: ");
                    first = reader.next();
                }
				System.out.println("Enter second arg: ");
				String second = reader.next();
                if (operation.equals("+")) {
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));

                } else if (operation.equals("-")) {
                    calc.sub(Integer.valueOf(first), Integer.valueOf(second));

                } else if (operation.equals("*")) {
                    calc.mul(Integer.valueOf(first), Integer.valueOf(second));

                } else if (operation.equals("/")) {
                    try {
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                    } catch (ArithmeticException e) {
                        System.out.println("Division by zero!!!");
                    }
                }
				System.out.println("Result " + calc.getResult());
				System.out.println("Save or clear result for first argument (save/clear): ");
				save = reader.next();
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
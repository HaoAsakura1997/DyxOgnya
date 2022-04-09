package calculate;


public class Roman implements Calc {
	public static String [] rom = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	static int [] dec = new int [] {1,2,3,4,5,6,7,8,9,10};
	
	int a;
	int b;
	int result;
	
	Roman (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static int romToDec (String r) {
		int arabic = 1;
		for  (int i = 0; i<rom.length; i++) {
			if (r.equals(rom[i])) {
					arabic = dec[i];
			} 
		}
		return arabic;
	}

	
	public int calculate(String op) {
		switch (op) {
		case "+":
			this.addition();
			return result;
			
		case "-":
			this.substraction();
			return result;
		case "*":
			this.multiple();
			return result;
		case "/":
			this.divide();
			return result;
		default:
			this.exitFromProgramm();
			return result;
	}
}
	
	public int addition() {
		result = a+b;
		return result;
	}

	@Override
	public int substraction() {
		if (a>b) {
			result = a-b;
			return result;
		} else {
			throw new RuntimeException("¬ римской системе нет отрицательных чисел ");
		}
		
	}

	public int multiple() {
		result = a*b;
		return result;
	}

	public int divide() {
		result = a/b;
		return result;
	}

	public int exitFromProgramm() {
		result = 1/0;
		return result;
	}
	
	
}

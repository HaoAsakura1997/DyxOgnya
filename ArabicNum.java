package calculate;

public class ArabicNum implements Calc {
		int a;
		int b;
		
		int result; 
		
		public ArabicNum(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		
 		public int addition () {
			result = a+b;
			return result;
		}
		
		public int substraction () {
			result = a-b;
			return result;
		}
		
		public int multiple () {
			result = a*b;
			return result;
		}
		
		public int divide () {
			result = a/b;
			return result;
		};
		
		public int exitFromProgramm () {
			result = 1/0;
			return result;
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
}

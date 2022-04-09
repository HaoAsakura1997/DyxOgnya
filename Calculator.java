package calculate;

import java.util.Scanner;

public class Calculator {
	public static void main (String []  args ) {
		Scanner in = new Scanner (System.in);
		System.out.println("Введите пример a +|-|*|/ b где a и b либо арабские, либо римские цифры одновремено в промежутке от 1 до 10... ");
		String expression = in.nextLine();
		in.close();
			
		String [] ArrayString = expression.split(" ");
		
		String a1 = ArrayString[0];
		String a2 = ArrayString[2];
		String op = ArrayString[1];
		
		if (ArrayString.length < 4) {
			if ((Validation.isRoman(a1)) && (Validation.isRoman(a2))) {
				int u = Roman.romToDec(a1);
				int r = Roman.romToDec(a2); 
				Roman ar2 = new Roman (u,r);
				int z = ar2.calculate(op);
				Convertor convertor = new Convertor(z);
				String romanResult = convertor.romToDecimal();
				System.out.println(romanResult);
			} else if ((Validation.OneToTen(Integer.parseInt(ArrayString[0]))) && (Validation.OneToTen(Integer.parseInt(ArrayString[2])))) {
				ArabicNum ar = new ArabicNum (Integer.parseInt(ArrayString[0]), Integer.parseInt(ArrayString[2]));
				System.out.println(ar.calculate(op));
			} else {
				throw new RuntimeException("Неверный формат или содержание записи.");
			}
			
		} else {
			throw new RuntimeException ("Неправильный ввод.");
		}
	}
}

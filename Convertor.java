package calculate;

//import java.util.Scanner;

public class Convertor {
	int result;
	static int [] decimal = new int[] {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	static String [] roman = new String [] {"C","XC","LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
	
	Convertor(int result) {
		this.result = result;
	}
	
	public String romToDecimal () {
			String rez = "";
			for (int i = 0; i < decimal.length-1; i++) {
				if(decimal[i]<= result) {
				rez+=roman[i];
				result = result - decimal[i];
				}
			
			} return rez;
		}
	


		
		/*public static void main (String [] args) {
			Scanner sc = new Scanner (System.in);
			String cs = sc.nextLine();
			sc.close();
			Convertor convertor = new Convertor(Integer.parseInt(cs));
			System.out.println(convertor.romToDecimal());
		}*/
	}
	


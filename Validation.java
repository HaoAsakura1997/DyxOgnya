package calculate;

import java.util.Arrays;

public class Validation {
	public static boolean OneToTen (int a) {
		if ((a>0)&(a<11)) {
			return true;
	} else { 
		return false;
		}
	}
	
	public static boolean isRoman (String r) {
		return Arrays.asList(Roman.rom).contains(r);
	}
}

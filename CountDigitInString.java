import java.util.Scanner;


public class CountDigitInString {
	public static void main(String[] args) {

	    Scanner odczyt = new Scanner(System.in);
	    System.out.println("Input string");
	    String ciag = odczyt.nextLine();

	    int suma = 0;

	    for (int i = 0; i < ciag.length(); i++) {
	        if (Character.isDigit(ciag.charAt(i))) {
	            suma += ciag.charAt(i)-'0';
	        }
	    } System.out.println(suma);
	}
}

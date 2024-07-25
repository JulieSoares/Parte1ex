import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int c1, c2, qtd1, qtd2;
	    double p1, p2, total;

	    c1 = sc.nextInt();
	    qtd1 = sc.nextInt();
	    p1 = sc.nextDouble();
	    
	    c2 = sc.nextInt();
	    qtd2 = sc.nextInt();
	    p2 = sc.nextDouble();

	    total = p1 * qtd1 + p2 * qtd2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}


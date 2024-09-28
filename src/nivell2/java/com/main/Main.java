package nivell2.java.com.main;
import nivell2.java.com.modules.Entrada;

public class Main {

    public static void main(String[] args) {
        byte age = Entrada.llegirByte("Introdueix la teva edat: ");
        System.out.println("La teva edat és: " + age);

        int year = Entrada.llegirInt("Introdueix l'any en què vas néixer: ");
        System.out.println("L'any en que vas néixer és: " + year);

        float pi = Entrada.llegirFloat("Introdueix el valor aproximat de Pi: ");
        System.out.println("El valor aproximat de Pi: " + pi);

        double price = Entrada.llegirDouble("Quant t'ha costat el teu cafè avui?: ");
        System.out.println("El teu cafè t'ha costat: " + String.format("%.2f", price));

        char character = Entrada.llegirChar("Entra qualsevol carácter (només un):");
        System.out.println("Has entrat el carácter: '" + character + "'");

        String str = Entrada.llegirString("Entra el teu nom, sense espais:");
        System.out.println("El teu nom és: " + str);

        boolean response = Entrada.llegirSiNo("Vols sortir del programa? (Sí --> 'S', No --> 'N':");
        System.out.println("Has constestat: " + response);
    }
}

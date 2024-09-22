package nivell1.java.com.main;
import nivell1.java.com.exceptions.VendaBuidaException;
import nivell1.java.com.modules.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem 5 productes en la botiga.");
        Product laptop = new Product("Laptop", 500);
        System.out.println(laptop);
        Product mouse = new Product("Ratolí", 14.90);
        System.out.println(mouse);
        Product keyboard = new Product("Teclat", 24.90);
        System.out.println(keyboard);
        Product screen = new Product("Pantalla", 150.90);
        System.out.println(screen);
        Product headphones = new Product("Auriculars", 39.90);
        System.out.println(headphones);

        System.out.println("\nInstanciem una venda buida.");
        Venda venda1 = new Venda();
        System.out.println("El contingut de la cistella és buit:\n" + venda1.getProductList());
        System.out.println("Calculem l'import de la cistella:");

        try{
            venda1.calcularTotal();
            System.out.println("L'import total de la venda és: " + venda1.getAmount() + "€");
        }catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nAfegim un laptop, un ratolí i un teclat a la cistella.");
        venda1.addProductToSale(laptop);
        venda1.addProductToSale(mouse);
        venda1.addProductToSale(keyboard);
        System.out.println("Comprovem el contingut de la cistella:\n" + venda1.getProductList());
        System.out.println("Si calculem l'import de la cistella, es llança l'excepció:");
        try{
            venda1.calcularTotal();
            System.out.println("L'import total de la venda és: " + venda1.getAmount() + "€");
        }catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ara provocarem una excepció IndexOutOfBoundsException apuntant a l'índex 4 de la cistella de productes que no existeix.");
        try{
            Product item = venda1.getProductList().get(4);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

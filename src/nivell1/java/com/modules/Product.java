package nivell1.java.com.modules;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "[Nom Producte: " + name + ", Preu: " + String.format("%.2f", price) + "€]";
    }
}



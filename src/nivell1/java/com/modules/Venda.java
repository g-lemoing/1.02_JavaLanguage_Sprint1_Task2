package nivell1.java.com.modules;

import nivell1.java.com.exceptions.VendaBuidaException;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private final List<Product> productList;
    private double amount;

    public Venda(){
        this.productList = new ArrayList<>();
        this.amount = 0;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getAmount() {
        return amount;
    }

    public void addProductToSale(Product product){
        this.productList.add(product);
    }

    public void calcularTotal() throws VendaBuidaException {
        double amount = 0;
        if(this.productList.isEmpty()){
            throw new VendaBuidaException();
            }
        for (Product product : this.productList){
            amount += product.getPrice();
        }
            this.amount = amount;
    }
}

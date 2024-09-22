package nivell1.java.com.modules;

import nivell1.java.com.exceptions.VendaBuidaException;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Product> productList;
    private double amount;

    public Venda(){
        this.productList = new ArrayList<Product>();
        this.amount = 0;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProductToSale(Product product){
        this.productList.add(product);
    }

    public void calcularTotal() throws VendaBuidaException {
        double amount = 0;
        if(!this.productList.isEmpty()){
            for (Product product : this.productList){
                amount += product.getPrice();
            }
            this.setAmount(amount);
        }
        else {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
        }
    }
}

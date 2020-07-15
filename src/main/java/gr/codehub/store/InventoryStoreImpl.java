package gr.codehub.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter

public class InventoryStoreImpl implements Store {

    private List<Product> products;
    private double revenue;

    public InventoryStoreImpl() {
        products =  new ArrayList<>();
        revenue = 0;
    }

    @Override
    public void buy(Product product) {
        products.add(product);
        revenue -= product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        products.remove(product);
        revenue += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return revenue;
    }

    public List<Product> getInventory(){
        return products;
    }

    public void reset(){
        products.clear();
        return;
    }


}

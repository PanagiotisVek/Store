package gr.codehub.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor

public class RetailStoreImpl implements Store {

    private double totalBuyBalance;
    private double totalSellBalance;

    public RetailStoreImpl() {
        totalBuyBalance = 0;
        totalSellBalance = 0;
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }
}

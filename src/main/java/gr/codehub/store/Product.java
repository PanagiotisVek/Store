package gr.codehub.store;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
        private int id;
        private String name;
        private double priceWhenBuy;
        private double priceWhenSell;
}

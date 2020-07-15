package gr.codehub.store;

public interface Store {
    void buy(Product product);
    void sell(Product product);
    double getRevenue();
}

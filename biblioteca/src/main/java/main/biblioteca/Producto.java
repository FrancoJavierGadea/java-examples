package main.biblioteca;

public class Producto<T> {
    
    public enum STATE {
        ONLY_SALE,
        ONLY_RENT,
        DEFAULT,
        DISABLED
    }

    private String id;
    private Double price;
    private Integer stock;
    private Integer rentCounter = 0;
    private Integer salesCounter = 0;
    private STATE state = STATE.DEFAULT;
    private T product;

    public Producto() {}

    public Producto(String id, Integer stock, STATE state, T product, Double price) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.state = state;
        this.product = product;
    }

    public Producto(String id, Double price, Integer stock, Integer rentCounter, int salesCounter, STATE state, T product) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.rentCounter = rentCounter;
        this.salesCounter = salesCounter;
        this.state = state;
        this.product = product;
    }


    //Getters and Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getRentCounter() {
        return this.rentCounter;
    }

    public void setRentCounter(Integer rentCounter) {
        this.rentCounter = rentCounter;
    }

    public Integer getSalesCounter() {
        return this.salesCounter;
    }

    public void setSalesCounter(Integer salesCounter) {
        this.salesCounter = salesCounter;
    }

    public STATE getState() {
        return this.state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public T getProduct() {
        return this.product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

}

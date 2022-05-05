package oop.labor10.lab10_3;

public class Product implements Comparable<Product>{

    private int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount){
        this.amount += newAmount;
    }



    @Override
    public String toString() {
        return "ID:" + id +
                "Name:" + name +
                "Amount:" + amount +
                "Price:" + price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getId() - o.getId();
    }
}

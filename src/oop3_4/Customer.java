package oop3_4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer( int id, String name,int discount) {
        this.discount = discount;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                "discount=" + discount +
                '}';
    }
}

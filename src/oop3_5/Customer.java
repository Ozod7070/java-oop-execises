package oop3_5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id,  String name,char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name=%s, gender=%c]", id, name, gender);
    }
}

package oop2_5;

public class InvoiceltemTest {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id: " + inv1.getId());
        System.out.println("desc: " + inv1.getDesc());
        System.out.println("qty: " + inv1.getQty());
        System.out.println("unitPrice: " + inv1.getUnitPrice());
        System.out.println("Jami: " + inv1.getTotal());
    }
}

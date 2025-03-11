package oop3_3;

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

    }
}

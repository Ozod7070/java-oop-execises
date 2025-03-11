package oop3_1;

public class Author {
    private String name;
    private String email;
    private char ginder;

    public Author(String name, String email, char ginder) {
        this.name = name;
        this.email = email;
        this.ginder = ginder;
        if (!(ginder == 'm' || ginder == 'f')) {
            System.err.println("Siz boshqa belgi kiritdingiz!");
        }

    }
    public String getName(){
        return name;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGinder() {
            return ginder;
    }
    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", ginder=" + ginder +
                '}';
    }

}


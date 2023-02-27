public class Customer {
    public static String bank = "HDFC";
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer(){
        this("unknown", 0, "unknown");
    }
    public Customer(String name, String email){
        this(name,0,email);
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

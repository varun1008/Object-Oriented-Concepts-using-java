public class Main {
    public static void main(String[] args) {

          //Encapsulation
        BankAccount ryan = new BankAccount();
        ryan.setAccountNumber(123);
        ryan.setAccountBalance(30000.0);
        ryan.setCustomerName("Ryan");
        ryan.setEmail("ryan@gmail.com");
        ryan.setPhoneNumber(8523815868L);

        ryan.withdrawFunds(10000);
        ryan.depositFunds(5000);
        ryan.withdrawFunds(25000);

        // constructors (Constructor overloading and constructor chaining)
        Customer xeyon = new Customer("xeyon",1000,"ryan@gmail.com");
        System.out.println(xeyon.getName());
        System.out.println(xeyon.getEmail());
        System.out.println(xeyon.getCreditLimit());
        System.out.println(Customer.bank);

        //Inheritance
        SalariedEmployee s = new SalariedEmployee("xeyon", "1999", "2030",777,"2023",100_000,false);
        System.out.println(s.collectPay());

        //Composition
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.kitchenState(true,true,false);
        kitchen.kitchenStatus();
    }
}
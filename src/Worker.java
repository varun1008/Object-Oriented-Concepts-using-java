public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return (2023 - Integer.parseInt(birthDate));
    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        System.out.println("Terminated");
    }
}

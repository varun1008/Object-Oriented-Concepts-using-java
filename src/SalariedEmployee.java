public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, int employeeId, String hireDate, double annualSalary, boolean isRetired){
        super(name,birthDate,endDate,employeeId,hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println("Retired");
    }

    public double collectPay(){
        return annualSalary;
    }


}

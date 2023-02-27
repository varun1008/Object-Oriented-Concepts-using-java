public class Employee extends Worker{
    private int employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, int employeeId, String hireDate){
        super(name,birthDate,endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }


}

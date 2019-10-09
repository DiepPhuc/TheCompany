public class Person {
    private int idEmployee;
    private String fullName;
    private String phoneNumber;
    private int daysOfWork;
    private int salaryPerDay;

    public Person(int idEmployee, String fullName, String phoneNumber, int daysOfWork, int salaryPerDay) {
        this.idEmployee = idEmployee;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.daysOfWork = daysOfWork;
        this.salaryPerDay = salaryPerDay;
    }
    public int calculateSalary(){
       return daysOfWork*salaryPerDay;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }
}

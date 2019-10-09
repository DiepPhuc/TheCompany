public class Staff extends Person {
    private String whoManage;
    private int calculateSalary;

   Staff(int idEmployee, String fullName, String phoneNumber, int daysOfWork, String whoManage, int salaryPerDay) {
        super(idEmployee, fullName, phoneNumber, daysOfWork, salaryPerDay);
        this.whoManage = whoManage;
        calculateSalary = CalculateSalary();
    }
    @Override
    public int CalculateSalary(){
        calculateSalary = getSalaryPerDay() * getDaysOfWork();
        return calculateSalary;
    }

    void WhoManage(){
        System.out.println("The Manager is: " + whoManage);
    }
}

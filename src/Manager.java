public class Manager extends Person {
    private int numberOfStaff;
    private int calculateSalary;

    Manager(int idEmployee, String fullName, String phoneNumber, int daysOfWork, int numberOfStaff, int salaryPerDay) {
        super(idEmployee, fullName, phoneNumber, daysOfWork, salaryPerDay);
        this.numberOfStaff = numberOfStaff;
        calculateSalary = CalculateSalary();
    }

    @Override
    public int CalculateSalary(){
        calculateSalary = getSalaryPerDay() * getDaysOfWork() + 100 * numberOfStaff;
        return calculateSalary;
    }


}

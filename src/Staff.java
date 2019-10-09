public class Staff extends Person {
    private String whoManage;
    public Staff(int idEmployee, String fullName, String phoneNumber, int daysOfWork, String whoManage,int salaryPerDay) {
        super(idEmployee, fullName, phoneNumber, daysOfWork, salaryPerDay);
        this.whoManage = whoManage;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }

    public void CalculateSalary(){
        System.out.println("The salary in this month is: " + calculateSalary());
    }
    public void WhoManage(){
        System.out.println("The Manager is: " + whoManage);
    }
}

public class Main {
    public static void main(String[] args){
        Person person = new Person(1,"Steve", "0123456789", 21, 100);
        Staff staff = new Staff(1,"Steve","0123456789",10,"Myself",200);
        staff.CalculateSalary();
        staff.WhoManage();
    }
}

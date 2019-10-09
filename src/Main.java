public class Main {
    public static void main(String[] args){
        //Person person = new Person(1,"Steve", "0123456789", 21, 100);
        Staff staff = new Staff(1,"Steve","0123456789",20,"Myself",100);
        System.out.println("The salary in this month is: " + staff.CalculateSalary());
        staff.WhoManage();
        Manager manager = new Manager(2,"Yip","002156874", 21,1,200);
        System.out.println("The salary of manager is: "+ manager.CalculateSalary());
    }
}

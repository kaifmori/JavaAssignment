public class EmployeeTest {

public static void main (String args[]){
Employeee employee1=new Employeee ("Saif", "Moori", 20000.00);
Employeee employee2=new Employeee ("Kaif", "Moori", 50000.00);

System.out.printf("\nNNAME\t\t\tYEARLY SALARY\n");

System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),
employee1.getLastName(), employee1.getSalary());
System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),
employee2.getLastName(), employee2.getSalary());


employee1.setSalary( (.1*employee1.getSalary())+employee1.getSalary());
employee2.setSalary( (.1*employee2.getSalary())+employee2.getSalary());

System.out.printf("\n10 Percent Salary Raised!! Yoohooooo!\n");
System.out.printf("\nNO:\t NAME\t\t\tYEARLY SALARY\n");
System.out.printf("–\t —-\t\t\t————-\n");
System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),
employee1.getLastName(), employee1.getSalary());
System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),
employee2.getLastName(), employee2.getSalary());
}
}
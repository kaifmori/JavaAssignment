import java.util.*;
public class DateTest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Date myDate = new Date(9, 11, 1986);

System.out.println("Enter The Month");
int myMonth = input.nextInt();
myDate.setMonthDate(myMonth);

System.out.println("Enter the Date");
int myDay = input.nextInt();
myDate.setDayDate(myDay);

System.out.println("Enter the Year");
int myYear = input.nextInt();
myDate.setYearDate(myYear);
myDate.displayDate();
}
}
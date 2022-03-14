public class Date {
private int month;
private int day;
private int year;
public Date(int myMonth,int myDay, int myYear) {

month = myMonth;
day = myDay;
year = myYear;
}

public void setMonthDate(int myMonth) {
month = myMonth;
}

public int getMonthDate() {
return month;
}

public void setDayDate(int myDay) {
day = myDay;
}

public int getDayDate() {
return month;
}

public void setYearDate(int myYear) {
year = myYear;
}

public int getYearDate() {
return year;
}

public void displayDate() {
System.out.printf("%d/%d/%d", month,day,year);
}
}
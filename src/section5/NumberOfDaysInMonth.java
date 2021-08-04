package section5;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            } else return year % 4 == 0 && year % 100 != 0 && year % 400 != 0;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(month<1 || month > 12) {
            return -1;
        }
        if(year<1 || year > 9999){
            return -1;
        }
        if (isLeapYear(year) && month==2){
            return 29;
        } else if (!isLeapYear(year) && month==2){
            return 28;
        } else if(month == 1 || month == 7|| month == 3 || month == 5 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else return 30;
    }
}

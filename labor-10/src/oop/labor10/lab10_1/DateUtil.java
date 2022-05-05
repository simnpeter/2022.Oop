package oop.labor10.lab10_1;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year%100==0){
            if(year%400==0){
                return true;
            }
            return false;
        }
        if(year%4==0){
            return true;
        }
        return false;

    }
    public static boolean isValidDate(int year, int month, int day){
        if(year < 0 || year > 2022 || month < 1 || month > 12 || day < 1 || day > 31){return false;}
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){return true;}
        if (day > 30) {return false;}
        if(month == 4 || month == 6 || month == 9 || month == 11){return true;}
        if(leapYear(year) && day<=29){return true;}
        if(day > 28){return false;}
        return true;
    }
}

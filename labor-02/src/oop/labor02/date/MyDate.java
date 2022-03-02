package oop.labor02.date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int Year, int Month, int Day){
        if(DateUtil.isValidDate(Year, Month, Day)){
            this.year=Year;
            this.month=Month;
            this.day=Day;
        }
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        String y, m, d;
        y=String.valueOf(year);
        m=String.valueOf(month);
        d=String.valueOf(day);
        return y + "." + m + "." +d;
    }
}

package oop.labor11.labor11_2;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int Year, int Month, int Day) throws InvalidDateException {
        if(!DateUtil.isValidDate(Year, Month, Day)) {
            throw new InvalidDateException("INVALID DATE");
        }
        this.year=Year;
        this.month=Month;
        this.day=Day;

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
        return getYear() + "." + getMonth() + "." + getDay();
    }

    @Override
    public int compareTo(MyDate o) {
        if(this.year == o.year){
            if(this.month == o.month){
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }
}

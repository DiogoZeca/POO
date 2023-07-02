package aula05.ex1;

public class DateYMD {
    
    private int day;
    private int month;
    private int year;
    
    public DateYMD(int day, int month, int year) {
        if(valid(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 1;
        }
    }

    public void increment(){
        if(valid(day + 1, month, year)){
            day++;
        } else if(valid(1, month + 1, year)){
            day = 1;
            month++;
        } else if(valid(1, 1, year + 1)){
            day = 1;
            month = 1;
            year++;
        } else {
            day = 1;
            month = 1;
            year = 1;
        }
    }

    public void decrement(){
        if(valid(day - 1, month, year)){
            day--;
        } else if(valid(monthDays(month - 1, year), month - 1, year)){
            day = monthDays(month - 1, year);
            month--;
        } else if(valid(31, 12, year - 1)){
            day = 31;
            month = 12;
            year--;
        } else {
            day = 1;
            month = 1;
            year = 1;
        }
    }

    public boolean validMonth(int month) {
        if(month < 1 || month > 12)
            return false;
        return true;
    }

    public static int monthDays(int month, int year){
        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        return days;
    }

    public boolean lapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public boolean valid(int day, int month, int year){
        return validMonth(month) && day >= 1 && day <= monthDays(month, year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "DateYMD [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DateYMD other = (DateYMD) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

}

package eyad.dev;

public class MonthAndItsDays {

    public static String getMonth(int month) {
        String monthName;  
        int daysInMonth;

        switch (month) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;

            case 2:
                monthName = "February";
                daysInMonth = 28;
                break;

            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;

            case 4:
                monthName = "April";
                daysInMonth = 30;
                break;

            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;

            case 6:
                monthName = "June";
                daysInMonth = 30;
                break;

            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;

            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;

            case 9:
                monthName = "Septembre";
                daysInMonth = 30;
                break;

            case 10:
                monthName = "Octobre";
                daysInMonth = 31;
                break;

            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;

            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;

            default:
                monthName = "Invalid month number";
                daysInMonth = 0;
                break;
        }

        if (month > 0 || month < 13) {
            return "The month is " + monthName + " has " + daysInMonth + " days.";
        } else {
            return monthName;
        }
    }

    public static void main(String[] args) {
        int month = 7; 
        System.out.println(getMonth(month));
    }
    
}

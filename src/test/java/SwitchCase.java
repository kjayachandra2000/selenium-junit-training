public class SwitchCase {
    public static void main(String[] args) {
        String sDay = "Monday";
        int iDay = 1;
        switch (sDay) {
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Saturday":
                System.out.println("Today is not Saturday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is a Weekday");
                break;
        }

        if (sDay.equals("Sunday")) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Today is a Weekday");
        }

        if (iDay == 7) {
            System.out.println("Today is Sunday");
        } else if (iDay == 6) {
            System.out.println("Today is Saturday");
        } else {
            System.out.println("Today is a Weekday");
        }
    }
}

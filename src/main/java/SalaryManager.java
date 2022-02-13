public class SalaryManager {

    public static boolean isDayOff = false;

    public static int getDaySalary(int mothSalary) {
        int baseDaySalary = mothSalary / 20;
        if (isDayOff) {
            return 2 * baseDaySalary;
        } else {
            return baseDaySalary;
        }


    }

}





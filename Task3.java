package Lesson2;

import java.util.Random;

public class Task3 {

    // Constants
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 8; // your requirement

    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        // Loop until hours < 100 AND days < 20
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {

            totalDays++;
            int empCheck = random.nextInt(3); // 0=Absent, 1=Full, 2=Part

            int empHours = 0;

            switch (empCheck) {
                case FULL_TIME:
                    empHours = FULL_DAY_HOUR;
                    break;

                case PART_TIME:
                    empHours = PART_TIME_HOUR;
                    break;

                default:
                    empHours = 0; // Absent
            }

            // Add hours but ensure not crossing 100
            if (totalHours + empHours > MAX_WORKING_HOURS) {
                empHours = MAX_WORKING_HOURS - totalHours; // adjust last day hours
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
            totalHours += empHours;
        }

        System.out.println("Total Working Days = " + totalDays);
        System.out.println("Total Working Hours = " + totalHours);
        System.out.println("Total Employee Wage = " + totalWage);
    }
}


package ru.geekbrains.lesson2;

public class GbTask2 {
    public static void main(String[] args) {

        System.out.println(checkSum(-10, 15));
        determinatePrintSign(-10);
        System.out.println(determinateReturnSign(-3));
        printString("Hi", 5);
        System.out.println(determinateLeapYear(2020));
    }

    private static boolean checkSum(int a, int b) {
        return (10<= (a + b) && (a + b) <= 20);
    }

    private static void determinatePrintSign (int num) {
        if (num >= 0){
            System.out.println(num + " Число положительное");
        } else {
            System.out.println(num + " Число отрицательное");
        }
    }

    private static boolean determinateReturnSign (int num) {
        return (num >= 0);
    }

    private static void printString(String string, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(string);
        }
    }

    private static boolean determinateLeapYear (int year) {
        if (year % 4 == 0 & (year % 100 != 0 | year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

}

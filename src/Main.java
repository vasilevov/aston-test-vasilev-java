import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choise;
        System.out.println("Введите номер задания:\n" +
                "1.Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия\n" +
                "2.Написать программу, которая принимает на вход две строки (a и b) и сравнивает их\n" +
                "3.Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа\n");
        choise = getNumberFromUser();

        switch(choise){
            case(1):
                firstTask();
                break;
            case(2):
                secondTask();
                break;
            case(3):
                thirdTask();
                break;
            default:
                break;
        }


    }

    public static void firstTask(){
        int a;
        int b;
        System.out.println("Введите целое число a");
        Scanner scanner = new Scanner(System.in);
        a = getNumberFromUser();
        System.out.println("Введите целое число b");
        b = getNumberFromUser();
        String compare;
        if(a<b){
            compare = "a < b";
        }
        else if(a>b){
            compare = "a > b";
        }
        else{
            compare = "a = b";
        }
        int sum = a + b;
        int substract = a - b;
        int multiply = a*b;
        int divide = a/b;

        System.out.println(compare + "\na + b = " + sum
        + "\na - b = " + substract
        + "\na * b = " + multiply
        + "\na / b = " + divide);
    }

    public static void secondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String string2 = scanner.nextLine();
        if(string1.equals(string2)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }

    public static void thirdTask(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int number: array) {
           if(number%2 == 0){
               System.out.print(number + " ");
           }
        }

    }

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while(true){
            if(scanner.hasNextInt()){
                userNumber = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Введите целое число");
            }
            scanner.next();
        }
        return userNumber;
    }

}

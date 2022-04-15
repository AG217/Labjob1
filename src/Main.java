import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int oneNum;
        int twoNum;
        int threeNum;
        int sum = printSum();
        System.out.println("Сумма чисел = "+ sum);
    }

        public static int scan1() {
            System.out.print("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            int oneNum = scanner.nextInt();
            return oneNum;
        }

        public static int scan2() {
            System.out.print("Введите второе число: ");
            Scanner scanner = new Scanner(System.in);
            int twoNum = scanner.nextInt();
            return twoNum;
        }
        public static int scan3() {
            System.out.print("Введите третье число: ");
            Scanner scanner = new Scanner(System.in);
            int threeNum = scanner.nextInt();
            return threeNum;
        }
         public static int printSum(){
            int sum = scan1()+scan2()+scan3();
             return sum;
        }

    }


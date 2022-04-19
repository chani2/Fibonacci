import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci boyutu giriniz");
        int n = input.nextInt();
        int first = 0;
        int second= 1;
        int total;
        total = first + second;

        for (int i = 0; i<=n; i++ ){
            first = second;
            second= total;
            total = first + second;
            System.out.print(" " + total);
        }

    }
}
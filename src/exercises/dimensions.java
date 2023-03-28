package exercises;
import java.util.Scanner;

public class dimensions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle's length: ");
        Double length = input.nextDouble();

        System.out.println("Rectangle's width: ");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("The area is:" + area);




    }
}

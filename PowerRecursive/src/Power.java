import java.util.Scanner ;

public class Power {

    static int power (int bottom , int exponent) {

        if (exponent == 0)
            return 1;

         else if (bottom == 1)
        return 1;

        else {
            return bottom * power(bottom, exponent - 1) ;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bottom number : ");
        int bottom = input.nextInt();

        System.out.print("Enter the exponent number : ");
        int exponent = input.nextInt();

        System.out.println("The result is = " + power(bottom, exponent));
    }
}

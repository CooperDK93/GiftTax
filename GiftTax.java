import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        int valueInput = scan.nextInt();

        if(valueInput < 5000){
            System.out.println("No Tax!");
        }else if(valueInput >= 5000 && valueInput < 25000){
             double giftTax = ( 100 + (valueInput - 5000) * .08 );
            System.out.println("Tax: " + giftTax);
        }else if(valueInput >= 25000 && valueInput < 55000){
            double giftTax = ( 1700 + (valueInput - 25000) * .10 );
            System.out.println("Tax: " + giftTax);
        }else if(valueInput >= 55000 && valueInput < 200000){
            double giftTax = ( 4700 + (valueInput - 55000) * .12 );
            System.out.println("Tax: " + giftTax);
        }else if(valueInput >= 200000 && valueInput < 1000000){
            double giftTax = ( 22100 + (valueInput - 200000) * .15 );
            System.out.println("Tax: " + giftTax);
        }else if(valueInput >= 1000000){
            double giftTax = ( 142100 + (valueInput - 1000000) * .17 );
            System.out.println("Tax: " + giftTax);
        }else System.out.println("Please Enter a proper number");

    }

}

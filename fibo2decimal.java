import java.util.Scanner;

public class fibo2decimal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Fibonacci base number : ");
        String fibNumer = scanner.nextLine();

        int deciValue = convertFibo2Decimal(fibNumer);

        System.out.println("The Decimal of " +fibNumer + "is : " +deciValue);


    }
    public static int convertFibo2Decimal(String fibNumer){
        int length = fibNumer.length();
        int[] fibonacci = new int [length + 2];

        fibonacci[1] =1;
        fibonacci [2] =2;

        for (int i =3; i<=length +1; i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];

        }
        int deciValue =0;

        for (int i=0; i<length;i++){
            int digit = Character.getNumericValue(fibNumer.charAt(length -1 - i));
            if (digit ==1){
                deciValue +=fibonacci[i+2];
            }
        }
        return deciValue;
    }
}


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Deci2Fibonacci {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное число : ");
        int deciNum = scanner.nextInt();

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);

        while (true){
            int nextFibo = fibonacci.get(fibonacci.size() -1) + fibonacci.get(fibonacci.size() -2);
            if (nextFibo > deciNum) break;
            fibonacci.add(nextFibo);
        }

        StringBuilder fiboCanculate = new StringBuilder();
        boolean lastAdded = false;

        for (int i = fibonacci.size() -1; i>=0; i--){
            if (fibonacci.get(i) <=deciNum){
                deciNum -= fibonacci.get(i);
                fiboCanculate.append("1");
                lastAdded = true;

            }
            else if (lastAdded){
                fiboCanculate.append("0");
            }
        }
        System.out.println("Число Фибоначчи:"+ fiboCanculate);
    }
    
}

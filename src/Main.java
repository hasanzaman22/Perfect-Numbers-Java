import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write the number: ");
        int number = scn.nextInt();
        int sum = 0;

        for(int i=1; i<number;i++){
            if (number % i == 0){
                sum = sum + i;;
            }
        }

        if (sum==number){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }
    }
}
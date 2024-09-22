import java.util.InputMismatchException;
import java.util.Scanner;

class AgeInvalidException extends Exception{
    AgeInvalidException(String message){
      System.out.println(message);
  }
}
public class Main {
    public static void main(String[] args) throws AgeInvalidException {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Started....");
        try {
            if (age >= 18) {
                System.out.println("eligible");
            } else if(age<18 && age>0){
                System.out.println("not eligible");
            }
        }
        catch (Exception e){
                throw new AgeInvalidException("Age is invalid");
        }
        finally {
            System.out.println("Program is completed");
        }
    }
}
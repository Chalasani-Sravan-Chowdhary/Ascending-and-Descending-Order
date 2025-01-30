import java.util.Scanner;
public class LargestAndSmallestValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number for comparision : ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter 2nd number for comparision : ");
        int number2 = scanner.nextInt();

        System.out.print("Enter 3rd number for comparision : ");
        int number3 = scanner.nextInt();


        if(number1>=number2 && number1>=number3){
            if(number2>=number3){
            System.out.println(number1 +" is the largest number");
            System.out.println(number3 +" is the smallest number");
            System.out.println("Descending Order: "+number1 +" > "+number2+" > "+number3);
            System.out.println("Ascending Order: "+number1 +" < "+number2+" < "+number3);
        }
        else{
            System.out.println(number1 +" is the largest number");
            System.out.println(number2 +" is the smallest number");
            System.out.println("Descending Order: "+number1 +" > "+number3+" > "+number2);
            System.out.println("Ascending Order: "+number1 +" < "+number3+" < "+number2);
        }
    }
        if(number2>=number1 && number2>=number3){
            if(number1>=number3){
                System.out.println(number2 +" is the largest number");
                System.out.println(number3 +" is the smallest number");
                System.out.println("Descending Order: "+number2 +" > "+number1+" > "+number3);
                System.out.println("Ascending Order: "+number2 +" < "+number1+" < "+number3);
            }
            else{
                System.out.println(number2 +" is the largest number");
                System.out.println(number1 +" is the smallest number");
                System.out.println("Descending Order: "+number2 +" > "+number3+" > "+number1);
                System.out.println("Ascending Order: "+number2 +" < "+number3+" < "+number1);
            }
            
        }
        else{
            if(number1>=number2){
                System.out.println(number3 +" is the largest number");
                System.out.println(number2 +" is the smallest number");
                System.out.println("Descending Order: "+number3 +" > "+number1+" > "+number2);
                System.out.println("Ascending Order: "+number3 +" < "+number1+" < "+number2);
            }
            else{
                System.out.println(number3 +" is the largest number");
                System.out.println(number1 +" is the smallest number");
                System.out.println("Descending Order: "+number3 +" > "+number2+" > "+number1);
                System.out.println("Ascending Order: "+number3 +" < "+number2+" < "+number1);
            }
            
        }


        scanner.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int maxNumber = 0,
            minNumber = 0,
            userNumber;
        boolean isInteger;

        while(true){
            //prompt and check if the number is an integer and not any other number
            System.out.print("Enter number: ");
            isInteger = input.hasNextInt();

            if(isInteger){
                //get the max and min numbers from the user entry
                userNumber = input.nextInt();

                if(userNumber > maxNumber){
                    maxNumber = userNumber;
                }
                else{
                    minNumber = userNumber;
                }
            }

            else {
                System.out.println("Invalid input");
                break;
            }

            //handle input (Enter key)
            input.nextLine();

        }

        //print max and min numbers
        System.out.print("\n\nmax number: " + maxNumber);
        System.out.print("\nmin number: " + minNumber);

        input.close();
    }
}

import java.util.Scanner;

public class WhileLoops {

    /**
     * Usage examples:
     * fromHereToT here(20, 30) -> “20 21 22 23 24 25 26 27 28 29 30”
     * fromHereToThere(30, 20) -> “Invalid input”
     *
     * @param num1 - The starting number
     * @param num2 - The ending number
     * @return A string consisting of either the range of numbers or Invalid Input
     */
    public static String fromHereToThere(int num1, int num2) {
        if (num1 > num2)
            return ("Invalid input");
        String number = "";
        while (num1 < num2) {
            number += num1;
            num1 += 1;

        }

        return number;// update or remove this line. It is only there so the tests do not show an error.
    }


    /**
     * Use a while loop to allow the user to enter positive or negative integers. The loop will exit
     * when the user enters a 0.
     *
     * @return - A string showing how many positive and negative numbers were entered by the user.
     */
    public static String countPosAndNeg() {
    Scanner scan = new Scanner(System.in);
    int pos = 0;
    int neg = 0;
    System.out.println("Please enter a number");
    int A = scan.nextInt();
    while (A!=0){
        if (A > 0){
            pos +=1;
        }
        if (A< 0){
            neg +=1;
        }

    return"There were"+ pos+ "positive and"+ neg+ " negative numbers" ;

        }
    }

    /**
     * Allow the user to enter 5 whole numbers (can be positive or negative). Keep track
     * of the largest and the smallest.
     *
     * @return A string giving the minimum and maximum. Ex. "The Max value is: 45\nThe Min value is: -87"
     */
    public static String findMinAndMax() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter 5 whole numbers");
    int B = scan.nextInt();
    int max = 0;
    int min = 0;
    int A = 5;
    while (A!=0){
        if (B>max)
            max = B;
        if (B<min)
            min = B;
        B = scan.nextInt();
        A -=1;}



        return "Max value is:"+max +"  + Min value is: "+min;
    }

    /**
     * Calculates all the factors of the given number.
     *
     * @param num A int value greater than 0
     * @return A string of all the factors of the given number separated by a space.
     * Ex. factors(12) returns "The factors of 12 are: 1 2 3 4 6 12 "
     */
    public static String factors(int num) {
      int factor = 0;

      for (A=0)



        return ""; // update or remove this line. It is only there so the tests do not show an error
        }
    }
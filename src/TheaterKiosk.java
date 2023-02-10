import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner AgeInput = new Scanner(System.in);
        int UserAge;

        System.out.println("Welcome to the theater");// welcomes you to the theater
        System.out.print("Please Enter your age: 20 ");//It is asking for your age 
        UserAge = 20;// your age

        if (UserAge >= 21) {
            System.out.println("You got a wrist band!");//output get a wristband above 21 years or older
        if (UserAge<21)    {
            System.out.println("you are underage and do not get Wristband");//No wristband for under 21 years or less
        }
        }
    }
}

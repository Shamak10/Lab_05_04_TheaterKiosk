public class TheaterKiosk {
    public static void main(String[] args) {
        int userAge = 22; //It is asking for your age

        System.out.println("Welcome to the theater");// welcomes you to the theater
        System.out.println("Your age is: " + userAge);//outputs your age

        if (userAge >= 21) {
            System.out.println("You got a wrist band!");//output get a wristband above 21 years or older
        } else if (userAge < 21) {
            System.out.println("You are underage and do not get a wristband.");
            //No wristband for under 21 years or less
        }
    }
}

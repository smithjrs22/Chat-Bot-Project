import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // greetUser();
        // greetUserRepeatName();
        // userAge();
        // countNumber();
        // testQuestion();
        loveAboutWeek();
    }

    public static void greetUser(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome !");

    }
    public static void greetUserRepeatName(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter your name");
        String nameInput = input.nextLine();
        System.out.println("Welcome " + nameInput + "!");
    }
    public static void userAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("I am going to guess your age by asking a series of questions");
        System.out.println("Multiply the first number of your age times 5. Enter the total. For example if you are 25. Multiply 2 times 5. You would enter 10.");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Add three to the last number. Enter the total.");
        int num2 = Integer.valueOf(input.nextLine());
        System.out.println("Double the last number. Enter the total.");
        int num3 = Integer.valueOf(input.nextLine());
        System.out.println("Add the second number of your age to the previous number. Enter the total. For example, if you are 25, add 5 to the previous number and enter the total");
        int num4 = Integer.valueOf(input.nextLine());
        System.out.println("Subtract six");
        int num5 = Integer.valueOf(input.nextLine());
        int guessAge  = num5;
        System.out.println("Based on your input, you are " + guessAge + " years old.");
        
    }

    public static void countNumber(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number you would like to count to");
            int num = Integer.valueOf(input.nextLine());
            if (num > 0){
                for (int i = 0; i <= num; i++)
                System.out.println(i); 
                break;  
            }
        }
    }

    public static void testQuestion(){
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Which data type is used to create a variable that should store text?");
        System.out.println("A. String");
        System.out.println("B. myString");
        System.out.println("C. Txt");
        System.out.println("D. stringText");
        String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("A.") || userAnswer.equals("String") || userAnswer.equalsIgnoreCase("A. String"))  
            {
                System.out.println("Correct!");
                    break;
            }   
            else {
                System.out.println("Incorrect. Please try again.");
            }
        }

    }

    public static void loveAboutWeek(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number corresponding with the day of the week. I will tell you what I like about that day.");
        int day = Integer.valueOf(input.nextLine());
        switch (day){
            case 1:
                System.out.println("Mondays are very moody for me.");
                break;
            case 2:
                System.out.println("Tuesdays are terrific! It's taco Tuesday!!!");
                break;
            case 3:
                System.out.println("Wednesdays are wonderful. I'm halfway through the work week!");
                break;
            case 4:
                System.out.println("Thursdays are turnt-up! It's Friday Eve.");
                break;
            case 5:
                System.out.println("TGIF!!!!! It's Fantastic Friday!!!");
                break;
            case 6:
                System.out.println("Saturdays are my off days. They are super fun.");
                break;
            case 7:
                System.out.println("Sundays are super chill but I gotta work tomorrow.");
                break;
        }
    }

}

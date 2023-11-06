import java.util.Scanner;
public class Hat {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String house;
        System.out.println("Welcome to Hogwarts! Let the sorting hat choose your house!");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Answer each of the following questions with a 'yes' or 'no'.");
        System.out.println("Do you value bravery and adventure? ");
        String answer = scan.nextLine();


        if(answer.equalsIgnoreCase("yes"))
        {
            house = "Gryffindor";
            System.out.println(name + ", you belong to house " + house + ".");

        }
        else if(answer.equalsIgnoreCase("no"))
        {
            System.out.println("Do you value wisdom, knowledge, and learning?");
            answer = scan.nextLine();
            if (answer.toLowerCase().equals("yes"))
            {
                house = "Ravenclaw";
                System.out.println(name + ", you belong to house " + house + ".");

            }
            else
            {
                System.out.println("Do you value ambition, strategy, and cleverness");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("yes"))
                {
                    house = "Slytherin";
                    System.out.println(name + ", you belong to house " + house + ".");

                }
                else
                {
                    house = "Hufflepuff";
                    System.out.println(name + ", you belong to house " + house + ".");

                }


            }
        }


    }
}
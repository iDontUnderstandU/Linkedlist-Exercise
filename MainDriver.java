import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner con = new Scanner(System.in);
        Linkedlist website = new Linkedlist();

        boolean repeat = true;

        do {
            System.out.println("---WEB BROWSER LINK MANAGER APP---");
            System.out.println("1 - Add Website");
            System.out.println("2 - Go back to previous and display info");
            System.out.println("3 - Display browsing history");
            System.out.println("4 - Get total Websites");
            System.out.println("5 - Display Current Site");
            System.out.println("q - Exit Program");

            System.out.print("\nEnter option: ");
            char opt = sc.next().charAt(0);

            switch (opt) {
                case '1':
                    System.out.println("==========================================");
                    System.out.println("Add Website");
                    System.out.println("==========================================");
                    // the user have to input the domain name and its link
                    System.out.print("Enter domain name: ");
                    String domain = con.next();
                    System.out.print("Enter link: ");
                    String link = con.next();
                    System.out.println("Website added!\n");
                    System.out.println("==========================================");
                    //calls the function addLast() to store data into the linked list
                    website.addLast(domain, link);
                    break;
                case '2':
                    System.out.println("==========================================");
                    website.prevWebsite();//displays the previous website visited
                    System.out.println("==========================================\n");
                    break;
                case '3':
                    System.out.println("==========================================");
                    System.out.println("Browsing history");
                    System.out.println("==========================================");
                    //function to display all the visited websites
                    website.displayList();
                    System.out.println("==========================================\n");
                    break;
                case '4':
                    System.out.println("==========================================");
                    System.out.println("Total of Websites Visited: " + website.getLength() +"\n" );//number of nodes added 
                    System.out.println("==========================================\n");
                    break;
                case '5':
                    System.out.println("==========================================");
                    website.displayCurrent();//displaying the last node
                    System.out.println("==========================================");
                    break;
                case 'q': case 'Q':
                    System.out.println("\nExiting the program...");//exits the program
                    repeat = false;
                    break;

                default:
                    System.out.println("==========================================");
                    System.out.println(" INVALID OPTION!!  "); // if the user inputs something other than the choices this is displayed
                    System.out.println("Please choose only on the options provided...");
                    System.out.println("==========================================");
                    break;

            }
            
        } while (repeat);
        sc.close();
    }
}
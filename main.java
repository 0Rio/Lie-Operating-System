
/**
 *  A simple operating system using terminal GUI
 *    features include:
 *                     -> social media
 *                     -> text editor
 *                     -> calculator
 *                     -> messenger
 *                     -> book reader
 *                     -> Internet browser
 *                     -> phone dialer
 *                     -> calendar
 *                     -> see the source code
 * @author Mohammad danyal
 * @version 1.0
 */
import java.util.Scanner;
public class Project
{ 
    static Scanner in = new Scanner(System.in);
    static String user = " ", pass = " ", text = " ";
    static boolean isAdmin = false;
    
    public static void main(String args[])
    {
        login();
    }
    //Login screen for operating system
    static void login()
    {
        System.out.println("Users available: \n1.Guest \n2.Admin\n3.logout");
        int ch = in.nextInt();
        if(ch == 2)
        {
            System.out.print("password: ");
            pass = in.next();
            if(pass.equals("123456"))
            {    
                isAdmin = true;
                System.out.println("Successfully Logged in as an Admin\n");
                firstScreen();
            }
            else
            {
                System.out.println("Wrong password");
                login();
            }
        }
        else if(ch == 1)
        {
            System.out.println("Successfully Logged in as Guest");
            firstScreen();
        }
        else if(ch == 3)
        {
            //exits the program
        }
        else
        {
            System.out.println("Invalid Input");
            login();
        }
        
        
    }
    
    
    
    // the inreen you get after sining in
    static void firstScreen(){
        System.out.println("Welcome to Lie Operating System\n");
        System.out.println("Apps: \n1.Dialler\n2.Text Editor\n3.Browser \n4.E-Reader \n5.Messenger \n6.calculator \n7.Social Media \n8.Calendar \n9.Source code \n10. exit");
        int input = in.nextInt();
        if(input == 1)
        {
            dialler();
        }
        else if(input == 2)
        {
            text();
        }
        else if(input == 3)
        {
            browser();
        }
        else if(input == 4)
        {
            ereader();
        }
        else if(input == 5)
        {
            messenger();
        }
        else if(input == 6)
        {
            calculator();
        }
        else if(input == 7)
        {
            social();
        }
        else if(input == 8)
        {
            System.out.println("todays date is 2nd March 2023");
        }
        else if(input == 9)
        {
            if(isAdmin)
            {
                System.out.println("Visit https://github.com/0Rio/Lie-Operating-System for the source code");
            }
            else
            {
                System.out.println("User not Authorised");
            }
            firstScreen();
        }
        else if(input == 10)
        {
            System.out.println("Exitting the program");
           System.exit(0);
        }
        else
        {
            System.out.println("INVALID INPUT\n");  
        }
        firstScreen();
    }
    
    //calculator
    static void calculator()
    {
                double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = in.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = in.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = in.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
    //messenger
    static void messenger(){
        String message = "";
        
        while (true) {
            System.out.print("Enter your message (or 'exit' to quit): ");
            message = in.nextLine();
            
            if (message.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("You: " + message);
            }
        }
    }
    // E-reader
    static void ereader()
    {
        
        System.out.println("\nwhich books do you wanna read?");
        System.out.println("1. Rich dad poor dad");
        System.out.println("2. it starts with us");
        System.out.println("3. Introduction to java programming ");
        System.out.println("4. exit");
        
        int cho = in.nextInt();
        switch(cho){
            case 1:
                 System.out.println("pg-1\n");
                 
                 System.out.println("I had two fathers, a rich one and a poor one. One was highly");
                 System.out.println("educated and intelligent. He had a Ph.D. and completed four years");
                 System.out.println("of undergraduate work in less than two years. He then went on to");
                 System.out.println("Stanford University, the University of Chicago, and Northwestern");
                 System.out.println("University to do his advanced studies, all on full financial scholarships.");
                 System.out.println("The other father never finished the eighth grade.");

                 System.out.println("\nto read the full book, Order a physical copy");
                 break;
            case 2:
                System.out.println("pg-1\n");
                
                System.out.println("My hands are still shaking, even though it’s been almost two hours since I");
                System.out.println("ran into Atlas. I can’t tell if I’m shaking because I’m flustered or because");
                System.out.println("I’ve been too busy to eat since I walked in the door. I’ve barely had five");
                System.out.println("seconds of peace to process what happened this morning, much less ");
                System.out.println("eat the breakfast I brought with me");
                
                System.out.println("\nto read the full book, Order a physical copy");
                break;
            case 3:
                 System.out.println();
                 System.out.println("Preview not available");
                 
                 System.out.println("\nto read the full book, Order a physical copy");
                 break;
            case 4:
                firstScreen(); 
                break;
            default:
                System.out.println("INVALID OUTPUT");
        }
        ereader();
    }
    
    //phone dialler
    static void dialler()
        {
          System.out.println("Enter the number to call");
          int number = in.nextInt();
          System.out.println("Network out of reach");
          firstScreen();
        }
        
        // internet browser
        static void browser(){
            System.out.println("BROWSER");
            System.out.println("1.Search \n2.Quit");
            int inp = in.nextInt();
            if(inp == 1)
            {
                System.out.println("Not connected to the internet, please try again later");
                browser();
            }
            else if(inp == 2)
            {
                System.out.println("exitting browser\n");
                firstScreen();
            }
            else{
                System.out.println("Invalid Input");
                browser();
            }
        }
        
        //text editor
        static void text()
        {         
           String text = "";

     
            while (true) {
              System.out.println("Text: " + text);
              System.out.println("1. Type");
              System.out.println("2. Copy");
              System.out.println("3. Cut");
              System.out.println("4. Paste");
              System.out.println("5. Delete");
              System.out.println("6. Quit");
              System.out.print("Enter your choice: ");
              int choice = in.nextInt();

              switch (choice) {
                case 1:
                  type();
                  break;
                case 2:
                  copy();
                  break;
                case 3:
                  cut();
                  break;
                case 4:
                  paste();
                  break;
                case 5:
                  delete();
                  break;
                case 6:
                  System.out.println("Exiting Text Editor...");
                  firstScreen();
                  break;
                default:
                  System.out.println("Invalid choice.");
      }
    }
  }

   //social media
    static void social(){
        Scanner scanner = new Scanner(System.in);
        String[][] userDatabase = {{"dan", "123"}, {"user2", "123"}};
        String[] posts = {"The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela", "The way to get started is to quit talking and begin doing. -Walt Disney", "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt", "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey", "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron"};
        int userId = 0;      
        boolean isLoggedIn = false;
        while (true) {
            System.out.println("Welcome to Social Media!\n");
            System.out.println("1. Login");
            System.out.println("2. Create an account");
            System.out.println("3. Quit\n");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.next();
                System.out.print("Enter password: ");
                String password = scanner.next();

                for (int i = 0; i < userDatabase.length; i++) {
                    if (username.equals(userDatabase[i][0]) && password.equals(userDatabase[i][1])) {
                        System.out.println("\nLogin successful!\n");
                    userId = i;
               isLoggedIn = true;
                        break;
                    }
                }

                if (!isLoggedIn) {
                    System.out.println("\nInvalid username or password. Please try again.\n");
                }
            } else if (choice == 2) {
                System.out.print("Enter a username: ");
                String newUsername = scanner.next();
                System.out.print("Enter a password: ");
                String newPassword = scanner.next();

                // Check if username already exists
                boolean exists = false;
                for (String[] user : userDatabase) {
                    if (newUsername.equals(user[0])) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("\nUsername already exists. Please try again with a different username.\n");
                } else {
                    // Add new user to database
                    String[][] newUserDatabase = new String[userDatabase.length + 1][2];
                    for (int i = 0; i < userDatabase.length; i++) {
                        newUserDatabase[i] = userDatabase[i];
                    }
                    newUserDatabase[newUserDatabase.length - 1] = new String[]{newUsername, newPassword};
                    userDatabase = newUserDatabase;

                    System.out.println("\nAccount created successfully!\n");
                }
            } else if (choice == 3) {
                System.out.println("\nThank you for using Social Media. Goodbye!\n");
                firstScreen();
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.\n");
            }

            if (isLoggedIn) {
                while (true) {
                    System.out.println("1. Browse social media");
                    System.out.println("2. Add a post");
                    System.out.println("3. Logout\n");
                    System.out.print("Please enter your choice: ");

                    int option = scanner.nextInt();
                    if (option == 1)
                    {
                        for(int i = 0; i < posts.length; i++)
                        {
                           System.out.println(posts[i]+"\n"); 
                        }
                        System.out.println("End of posts");
                        break;
                    }
                    else if( option == 2)
                    {
                        System.out.println("this option is not available yet try again later");
                   }
                    else if(option == 3)
                    break;
                    else
                    {
                        System.out.println("Invalid input");
                    }
                }
            }
            else if(choice == 3)
            {
                firstScreen();
            }
            else
            {
                 System.out.println("Invalid input");       
            }
            }
        }
  
  
  
  
  //sub functions of text editor
  private static void type() {
    System.out.print("Enter text: ");
    String inpt = in.next();
    text += inpt;
  }

  private static void copy() {
    System.out.print("Enter start index: ");
    int start = in.nextInt();
    System.out.print("Enter end index: ");
    int end = in.nextInt();
    String copiedText = text.substring(start, end);
    System.out.println("Copied text: " + copiedText);
  }

  private static void cut() {
    System.out.print("Enter start index: ");
    int start = in.nextInt();
    System.out.print("Enter end index: ");
    int end = in.nextInt();
    String cutText = text.substring(start, end);
    text = text.replace(cutText, "");
    System.out.println("Cut text: " + cutText);
  }

  private static void paste() {
    System.out.print("Enter index: ");
    int index = in.nextInt();
    System.out.print("Enter text: ");
    String input = in.next();
    text = text.substring(0, index) + input + text.substring(index);
  }

  private static void delete() {
    System.out.print("Enter start index: ");
    int start = in.nextInt();
    System.out.print("Enter end index: ");
    int end = in.nextInt();
    String deletedText = text.substring(start, end);
    text = text.replace(deletedText, "");
    System.out.println("Deleted text: " + deletedText);
  }
}



    


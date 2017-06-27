import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
public class Menu
{
    //Create a simple menu system for this program
    static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        int postOrder =1;
        String user = null;
        ArrayList<User> Users = new ArrayList<User>();
        ArrayList<Post>listPosts= new ArrayList<Post>();

        while(true)
        {
            System.out.println("Welcome to Micro Blog");
            System.out.println("Menu");
            System.out.println("1. Create a new user ");
            System.out.println("2. Become an existing user ");
            System.out.println("3.Create a post as the current user ");
            System.out.println("4.Print all posts ");
            System.out.println("5.Print all users ");
            System.out.println("6.Exit ");

            if (user !=null)
            {
                System.out.println("You are currently user" + user + "What would you like to do? ");
            }
            System.out.print (" > ");
            int option = Keyboard.nextInt();
            Keyboard.nextLine();
            if(option <1 || option > 6)
            {
                System.out.println("Please try again");
            }
            System.out.println(" ");

            if (option == 1)
            {
                System.out.println("Name : ");
                String newName = Keyboard.nextLine();
                System.out.println("email address: ");
                String newEmail = Keyboard.nextLine();
                System.out.println("Username: ");
                String newUserName = Keyboard.nextLine();
                Boolean ckus= false;
                for( User ckusid : Users)
                {
                    if (ckusid.getUserName().equalsIgnoreCase(newName))
                    {
                        ckus = true;
                    }
                    if (ckus)
                    {
                        System.out.println("User name already exist. Please try again ");
                        newName = Keyboard.nextLine();                        
                    }
                }
                System.out.println(" Avatar : ");
                String newAvatar = Keyboard.nextLine();
                Users.add(new User(newAvatar, newUserName, newName,newEmail));
            }
            System.out.println("");
            if(option == 2)
            {
                for(User list : Users)
                {
                    System.out.println(list.getUserName());
                }
                System.out.print("Select the user: ");
                String destUserName = Keyboard.nextLine();
                Boolean userFound = false;
                for(User list : Users)
                {
                    if(list.getUserName().equalsIgnoreCase(destUserName))
                    {
                        user = list.getUserName();
                        userFound =true;
                    }
                }
                for(User list : Users)
                {
                    if(!userFound)
                    {
                        System.out.println("User not valid ");
                        break;
                    }
                }
            }
            if (option ==3) 
            {
                first:
                if (user == null)
                {
                    System.out.println(" Select an user ");
                    break first;
                }
                String userLastPost = null;
                for (Post currentPost : listPosts)
                    if (currentPost.getUserName().equalsIgnoreCase(user))
                    {
                        userLastPost = currentPost.getPostInfo();
                    }
                if (userLastPost != null)
                {
                    System.out.println(userLastPost);
                }
                    System.out.println("You are currently user " + user + ". Whats is on your mind?");
                    String createPost = Keyboard.nextLine();
                    System.out.println(" Web address : ");
                    String createLink = Keyboard.nextLine();
                    
                    System.out.println("");
                    postOrder++;
                }
                if (option ==4)
                {
                    if (listPosts !=null)
                    {
                        for (Post list : listPosts)
                        {
                            System.out.println(list.getPostInfo());
                        }
                    }
                    if (option == 5)
                    {
                        for (User list : Users)
                        {
                            System.out.println(list.getUserInfo());
                        }
                    }
                    System.out.println("");
                    if (option ==6)
                    {
                        break;
                    }
                }
            }
        }
    }


                    
                    
                    
            
            

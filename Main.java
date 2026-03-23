// import java.util.*;
// public class Main{
//     public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
      
       
    //  String name=sc.nextLine();//DECLARATION OF THE STRING
    //  System.out.println(name);
    
    //STRING CONCATENATION MEANS ADDITION IN ANOTHER JUST LIKE MERGE 

//     Scanner sc=new Scanner (System.in);
//     System.out.print("ENTER THE FIRSTNAME:");
//     String firstName=sc.nextLine();
//     System.out.print("ENTER YOUR LAST NAME:");
//     String lastName=sc.nextLine();
//     String fullName=firstName+" "+lastName;//AT THIS PLACE WE USE THE CONCATENATION IN NEW VALIABLE WE STORE THE PREVIOUS 2 VARIABLES BY ADDING EACH OTHER
//     System.out.println("YOUR FULL NAME="+fullName);
        
//     }
// }

//THEN WE WILL TALK ABOUT THE LENGHT OF STRING

// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER YOUR FIRST NAME:");
//         String firstName=sc.nextLine();
//         System.out.print("ENTER YOU LAST NAME:");
//         String lastName=sc.nextLine();
//         String fullName=firstName+" "+lastName;
//         System.out.print("Name="+fullName.length()+" "+"\n"+fullName);//THIS THE SYNTEX OF FINDING THE LENGHT 
//     }
// }


// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER YOUR FIRST NAME:");
//         String firstName=sc.nextLine();
//         System.out.print("ENTER YOUR LAST NAME:");
//         String lastName=sc.nextLine();
//         String fullName=firstName+lastName;
//         for(int i=0;i<fullName.length();i++){
//             System.out.println(fullName.charAt(i));
//         }
//     }
// }


//FUNCTION NUMBER 4 COMPARISION 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR I LETTER:");
        String firstLetter=sc.nextLine();
        System.out.print("ENTER THE 2nd LETTER:");
        String secondLetter=sc.nextLine();
        if(firstLetter.compareTo(secondLetter)==0){
            System.out.print(firstLetter.compareTo(secondLetter)+" "+"BOTH ARE EQUAL");

        }else{
            System.out.print(firstLetter.compareTo(secondLetter)+" "+"NOT ARE EQUAL");
        }

    }
}
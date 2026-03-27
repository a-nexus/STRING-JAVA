// public class StringBuilders {
//     public static void main(String[] args){
//         StringBuilder sb=new StringBuilder("tony");
//         System.out.println("NAME="+sb);
//         System.out.println(sb.charAt(0));

//     }
    
// }

//HERE IS ANOTHER FUNCTION SET CHAR AT FUNCTION IN WHICH WE CAN CHANGE THE INDEX VALUE WHICH WE WANT

// import java.util.*;
// public class StringBuilders{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         StringBuilder sb=new StringBuilder(sc.nextLine());
//        sb.setCharAt(0,'s');//FIRSTLY WE CHANGE THE STRING THEN WE GO FOR THE PRINT
//        System.out.println(sb);
        

//     }
// }


//NEXT IS TO INSERT A ALPHABET OR OTHER THINGS IN STRING AT ANY INDEXED VALUE

// import java.util.*;
// public class StringBuilders{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NAME:");
//         StringBuilder sb=new StringBuilder(sc.nextLine());
//         System.out.print("ENTER THE INDEXED VALUE WHERE YOU WANT TO ADD SOMETING:");
//         int num=sc.nextInt();
//         sc.nextLine();

//         System.out.print("ENTER THE THING WHICH YOU WANT TO ADD AT "+num+" INDEXED VALUE:");
//         String alpha=sc.nextLine();
//         sb.insert(num,alpha);
//         System.out.println("Name="+sb);
//         //IF I ANT TO DELETE THE INSETED VALUE SO HERE IS A FUNCTION NAME DELETE
//         System.out.print("ENTER THE INDEXED VALUE WHICH YOU WANT TO DELETE:");
//         int num2=sc.nextInt();

//         sb.delete(num2,num2+1);
//         System.out.println(sb);
//     }
// }

//NEXT APPEND FUNCTION IN WHICH WE CAN ADD THING IN LAST OF THE STRINGBUILDER

import java.util.*;
public class StringBuilders{
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           StringBuilder sb=new StringBuilder(sc.nextLine());
           sb.append(sc.nextLine());
        System.out.print(sb);          
    }
}

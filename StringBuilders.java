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

import java.util.*;
public class StringBuilders{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NAME");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.insert(2,'a');
        System.out.println("Name="+sb);
    }
}
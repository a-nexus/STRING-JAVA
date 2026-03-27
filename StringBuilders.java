// public class StringBuilders {
//     public static void main(String[] args){
//         StringBuilder sb=new StringBuilder("tony");
//         System.out.println("NAME="+sb);
//         System.out.println(sb.charAt(0));

//     }
    
// }

//HERE IS ANOTHER FUNCTION SET CHAR AT FUNCTION IN WHICH WE CAN CHANGE THE INDEX VALUE WHICH WE WANT

import java.util.*;
public class StringBuilders{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
       sb.setCharAt(0,'s');//FIRSTLY WE CHANGE THE STRING THEN WE GO FOR THE PRINT
       System.out.println(sb);
        

    }
}

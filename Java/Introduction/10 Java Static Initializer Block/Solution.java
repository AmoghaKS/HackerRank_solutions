// github.com/RodneyShag

//Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

//https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    } // end of main
} // end of class


//HR Solution

// static int B, H;
// static boolean flag = true;
// static {

//  Scanner sc = new Scanner(System.in);
//  B = sc.nextInt();
//  H = sc.nextInt();
//  sc.close();
//  try {
//   if (B <= 0 || H <= 0)
//    throw new Exception("Breadth and height must be positive");
//  } catch (Exception e) {
//   System.out.println(e);
//   System.exit(0);
//  }

// }
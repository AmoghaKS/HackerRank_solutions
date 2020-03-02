// github.com/RodneyShag
// ("%-15s%03d\n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string. 15s : here 15 denotes the string's minimum field width 15. '0' : pads the extra 0s in the integer. 3d : here 3 denotes integer's minimum field width 3. \n (%n can also be used) : prints the new line.

//%-15s" means that within 15 blank space, the String "s1" will be filled in the left. (fill in the blanks from the left)

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();
            // \n can also be used
            System.out.format("%-15s%03d%n", s1, x);
        }
        scan.close();
        System.out.println("================================");
    }
}

/*
Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.


Sample Input
java 100
cpp 65
python 50

Sample Output
================================
java           100 
cpp            065 
python         050 
================================

*/
import java.util.Scanner;
import java.util.Locale;
import java.io.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        PrintWriter pw=  new PrintWriter(System.out); 
            System.out.println("================================");
            String s1;
            int x;


            for(int i=0;i<3;i++){
                s1=sc.next();
                x=sc.nextInt();
                pw.printf("%-15s",s1);
                pw.printf("%03d",x);
                pw.println();
                pw.flush();
                //Complete this line
               
            }
            System.out.println("================================");

    }
}

//Ref: http://www.tutorialspoint.com/java/io/printwriter_printf_string.htm
//http://www.homeandlearn.co.uk/java/java_formatted_strings.html

/*Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

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
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
*/

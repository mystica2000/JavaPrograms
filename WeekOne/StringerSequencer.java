/*
 *
 * You receive some random elements as a space-delimited string. Check if the elements are part of
 an ascending sequence of integers starting with 1, with an increment of 1 (e.g. 1, 2, 3, 4).
  Return:
  0 if the elements can form such a sequence, and no number is missing ("not broken", e.g. "1 2 4
  3")
  1 if there are any non-numeric elements in the input ("invalid", e.g. "1 2 a")
  n if the elements are part of such a sequence, but some numbers are missing, and n is the lowest
 of them ("broken", e.g. "1 2 4" or "1 5")
 Examples
 "1 2 3 4" ==> return 0, because the sequence is complete
 "1 2 4 3" ==> return 0, because the sequence is complete (order doesn't matter)
 "2 1 3 a" ==> return 1, because it contains a non numerical character
 "1 3 2 5" ==> return 4, because 4 is missing from the sequence
 "1 5" ==> return 2, because the sequence is missing 2, 3, 4 and 2 is the lowest
 * 
 * 
*/

/*
 * @author mystica
 * @version 1
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Collections;

public class StringerSequencer{
    StringBuilder word;
    public StringerSequencer(StringBuilder word)
    {
      this.word=word;
    }
    public int evaluatestring()
    {
        /* Creating ARRAYLIST TO STORE THE ARRAY OF INTEGER BECOZ AT FIRST WE DONT KNOW THE SIZE OF INTEGER ARRAY 
         * Stringbuilder for faster access
        */
        ArrayList<Integer> arr=new ArrayList<Integer>();
        StringBuilder ab=new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            char a=word.charAt(i);
            //System.out.println(a);
            if(Character.isDigit(a))
            {
              ab.append(a);    
            }
            else if(a==' ')
            {
                /*if char is space then it need not to be considered so we are eliminating space and inserting into arraylist
                 * then after inserting removing that element in stringbuilder to append another number into it.
                 * 
                 * 
                 */
                arr.add(Integer.parseInt(ab.toString()));
                ab.setLength(0);;
                continue;
            }
            else if(!Character.isDigit(a))
            {
                return 1;
            }
            if(i==word.length()-1)
            {
                /*
                 * for the condition '\0' we have to check the sequence of no.s are available or not
                 */
                arr.add(Integer.parseInt(ab.toString()));
                int flag=0;
                Collections.sort(arr);
                System.out.println(arr);
                int min=arr.get(0);
                int len=arr.size();
                int max=arr.get(len-1);
                int k=0;
                for(int j=min;j<=max;j++)
                {
                    if(j==arr.get(k))
                    {
                        k++;
                    }
                    else{
                        return 2;
                    }
                }
            }
        }
       return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        StringerSequencer sq=new StringerSequencer(str);
        System.out.println(sq.evaluatestring());
    }
}

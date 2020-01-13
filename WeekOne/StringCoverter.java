/*
 * The goal of this exercise is to convert a string to a new string where each character in the
 * new string is "(" if that character appears only once in the original string, or ")" if that
 * character appears more than once in the original string. Ignore capitalization when
 * determining if a character is a duplicate.
 * Examples
 *  "din" => "((("
 *  "recede" => "()()()"
 *  "Success" => ")())())"
 *  "(( @" => "))((" 
 *
 * @author mystica
 */
import java.io.*;
import java.util.*;
class Converter{
    //this class does the conversion
    String word=new String();
    public Converter(String a)
    {
        this.word=a;
    }
    public String get_string()
    {
        int count=0;
        int flag[]=new int[90];
        for(int i=0;i<70;i++)
        {
            flag=new int[i];
        }
        String mod=new String();
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if((c>=65 && c<= 91))
            {
                count=c-65;
                flag[count]+=1;
            }
            if((c>=97 && c<= 123))
            {
                count=c-97+26;
                flag[count]+=1;
            }
            else
            {
                int ascii=(int)c;
                count=c-ascii+52;
                flag[count]+=1;
            }
        }
        for(int i=0;i<word.length();i++)
        {
              char char_at_pos;
        for(int j=0;j<70;j++){
             String ans=" ";
            if(flag[j]>=1)
            {
                char_at_pos=word.charAt(i);
                ans=ans+char_at_pos;
                word.replaceall(ans,"(");
                 System.out.println(word);
               
            }
            else{
                    char_at_pos=word.charAt(i);
                    ans=ans+char_at_pos;
                word.replace(ans,")");
            }
            System.out.println(" "+flag[j]);
        }
        }
        return word; 
    }
}
public class StringCoverter{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter the string to convert");
        String res=sc.next();
        Converter a=new Converter(res);
        System.out.println("the answer is "+a.get_string());
    }
}
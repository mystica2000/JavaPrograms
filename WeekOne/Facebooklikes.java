import java.io.*;

public class Facebooklikes{
    
    public String wholikesit(String...names)
    {
        if(names.length==0)
        {
            return "no one likes this";
        }
        else if(names.length==1)
        {
            return names[0]+" likes this";
        } 
        else if(names.length==2)
        {
            return names[0]+" and "+names[1]+" like this";
        }
        else if(names.length==3)
        {
            return names[0]+", "+names[1]+" and "+names[2]+" like this"; 
        }
        int count=names.length-2;
        return names[0]+" , "+names[1]+" and "+count+" others like this";
    }
    public static void main(String args[])
    {
      Facebooklikes f=new Facebooklikes();
      System.out.println(f.wholikesit("Peter"));
      System.out.println(f.wholikesit("Jacob","Alex"));
      System.out.println(f.wholikesit("Max", "John", "Mark"));
      System.out.println(f.wholikesit("Alex", "Jacob", "Mark", "Max"));
      System.out.println(f.wholikesit("mystica","jake","hugh","eminem","lucid"));
    }
}
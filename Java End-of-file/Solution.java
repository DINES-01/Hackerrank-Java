import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        for(int i=1;s.hasNext();i++)
        {
          String str = s.nextLine();
          System.out.println(i +" "+ str);
        }
    }
}

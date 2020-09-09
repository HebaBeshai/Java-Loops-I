import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int answer = 0;
      //  List<String> answers = new ArrayList<>();
      //    String answer2="";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            answer = a; //missing this 
           // String line="";

            for(int k=0;k<n;k++){
                  answer=answer+b*(int)(Math.pow(2,k)); //slight problem with formula
                  System.out.print(answer+" ");
            } 
              System.out.println();
          //  line=line+answer+" ";
           // answers.add(line);

        }
        //for(int i=0;i<answers.size();i++){
          //  System.out.println(answers.get(i));
        //}
    }
}

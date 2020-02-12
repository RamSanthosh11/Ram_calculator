package caluclator.calc1;

import caluclator.calc1.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double a,b;
        String operator;
        String op;
        Operation caliculator=null;
        while(true){
            System.out.println("enter the expression as (val op val)");
            a=scan.nextDouble();
            op=scan.next();
            b=scan.nextDouble();
            if(op.equals("+"))
                caliculator=new add();
            else if (op.equals("-"))
                caliculator=new sub();
            else if(op.equals("*"))
                caliculator=new Multiply();
            else if (op.equals("/"))
                caliculator=new Division();
            System.out.println(caliculator.cal(a,b));
            System.out.println("Enter y to continue to exit enter n");
            scan.nextLine();
            op=scan.nextLine();
            if(!op.equals("y"))
                break;
        }
    }
}

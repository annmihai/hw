import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amiha
 */
public class quadratic {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
         System.out.println("Input:");
        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();
        double solution;
        if(Math.sqrt(b*b-4*a*c)>0){
            System.out.println("x1=" +(-b-Math.sqrt(b*b-4*a*c))/2*a);
            System.out.println("x2="+(-b+Math.sqrt(b*b-4*a*c))/2*a);
            if (Math.sqrt(b*b-4*a*c)==0)
                System.out.println("x="+(-b)/2*a); } 
        else System.out.println("Cannot find x!");    
        }
        
            
    }
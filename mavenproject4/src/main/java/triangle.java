
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
public class triangle {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the length on triangle");
        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();
        if((a+b)>c && (a+c>b) && (c+b>a)){
          if((a==b)&& (b!=c)) 
             System.out.println("Triangle is isosceles");
          if((a==b) && (a==c)) 
            System.out.println("Triangle is equilateral"); 
          if(a!=b && a!=c)
              System.out.println("triangle is scalene");}
        else System.out.println("Not a triangle");
                  
        
    }  
}

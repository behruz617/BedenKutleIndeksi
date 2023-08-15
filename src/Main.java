import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height  :");
        double boy = sc.nextDouble();

        System.out.print("Enter your weight :");
        double kilo=sc.nextDouble();

        double index= kilo/(boy*boy);
        System.out.println("Your body mass index : "+index);

        if (index<=18.5){
            System.out.println("Weak");
        }else if(index<=24.9){
            System.out.println("Ideal");
        }else if(index<=29.9){
            System.out.println("Fat");
        } else if (30<=index&&index<=34.9) {
            System.out.println("Obese");
        }else if(35<=index){
            System.out.println("very Obese");
        }


    }


}

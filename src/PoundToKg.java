import java.util.Scanner;

public class PoundToKg {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float pound=sc.nextFloat();
        double kg = (pound * 0.45359237);
        System.out.println(kg);
    }
}

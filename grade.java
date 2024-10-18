import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Grade: ");
        double g1 = sc.nextDouble();
        System.out.println("Enter Second Grade: ");
        double g2 = sc.nextDouble();
        System.out.println("Enter Third Grade: ");
        double g3 = sc.nextDouble();

        System.out.println(average(g1,g2,g3));
    }
    public static String average(double g1,double g2,double g3){
        double result = (g1 + g2 + g3)/3;
        
        if (result>=85){
            return "Passed";

        }else{
            return "Failed";
        }
    }
        
    }
    


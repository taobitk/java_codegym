
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = {1,2,3,4,5,6,7,5};
       ArrayList<String> name = new ArrayList<>();
        System.out.print(Arrays.toString(a));
        Scanner sc = new Scanner(System.in);
        double  weight,height,bmi;
       System.out.print("Enter weight in pounds: ");
       weight = sc.nextFloat();
        System.out.print("Enter height in pounds: ");
        height = sc.nextFloat();
        System.out.print("Enter bmi in pounds: ");
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }

}

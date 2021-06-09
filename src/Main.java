import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị a : ");
        int a = scanner.nextInt();
        System.out.println("nhập vào giá trị b : ");
        int b = scanner.nextInt();
        System.out.println("nhập vào giá trị c : ");
        int c = scanner.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        System.out.println("Your QuadraticEquation is : " + equation.Display());
        if(equation.getDiscriminant() > 0){
            System.out.println("r 1 = " + equation.getRoot1());
            System.out.println("r2 = " + equation.getRoot2());
        }
        if(equation.getDiscriminant() == 0){
            System.out.println(" r1 = r2 = " + equation.getRoot2());
        }
        if(equation.getDiscriminant() < 0){
            System.out.println("Roots");
        }
    }


}

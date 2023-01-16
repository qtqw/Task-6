import java.util.Scanner;

public class Main {
    private static final String ASKX  = "Введите значение x: ";
    private static final String ASKN  = "Введите значение n: ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double e = 0;
        double e10 = 0;
        System.out.print(ASKX);
        double x = scanner.nextDouble();
        System.out.print(ASKN);
        int n = scanner.nextInt();
        for (int i = 0;i <= n;i = i + 1) {
            a = getA(a,x,i);
            e = getAifOverE(e,x,i);
            e10 = getAifOverEdiv10(e10,x,i);
        }
        System.out.println(a);
        System.out.println(e);
        System.out.println(e10);
        System.out.println(getSum(x));
    }
    public static double getA(double a, double x, double n) {
        double result = 0;
        if (n % 2 == 0) {
            result = a + Math.pow(x,n);
        }
        else {
            result = a - Math.pow(x,n);
        }
        return result;
    }

    public static double getAifOverE(double a, double x, double n) {
        double result = 0;
        if (Math.pow(x,n) > Math.E) {
            if (n % 2 == 0) {
                result = a + Math.pow(x, n);
            } else {
                result = a - Math.pow(x, n);
            }
        }
        else result = a + 0;
        return result;
    }

    public static double getAifOverEdiv10(double a, double x, double n) {
        double result = 0;
        if (Math.pow(x,n) > Math.E/10) {
            if (n % 2 == 0) {
                result = a + Math.pow(x, n);
            } else {
                result = a - Math.pow(x, n);
            }
        }
        else result = a + 0;
        return result;
    }
    public static double getSum(double x) {
        double result = 1/(1+x);
        return result;
    }

}
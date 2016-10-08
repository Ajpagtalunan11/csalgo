package karatsuba;

import java.util.*;

public class Karatsuba {

    public static void main(String[] args) {

        String x, y;
        int a, b, c, d;
        int ac, ad, bc, bd, answer;
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter X:");

        x = Scan.nextLine();
        System.out.println("Enter y:");
        y = Scan.nextLine();
        System.out.println("X:" + x + "Y: " + y);

        a = Integer.parseInt(x.substring(0, 2));
        b = Integer.parseInt(x.substring(2, 4));
        c = Integer.parseInt(y.substring(0, 2));
        d = Integer.parseInt(y.substring(2, 4));
        System.out.println("A and B=" + a + "" + b);
        System.out.println("C and D=" + c + "" + d);

        ac = a * c;
        ad = a * d;
        bc = b * c;
        bd = b * d;
        System.out.println("AC=" + ac + "AD=" + ad + "BC=" + bc + "BD=" + bd + "");

        answer = ac * 10000;
        answer += ((ac + bc) * 100);
        answer = bd;
        System.out.println("Answer = " + answer);
    }

}

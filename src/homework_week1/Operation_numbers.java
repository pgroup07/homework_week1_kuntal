package homework_week1;

public class Operation_numbers {

    public static void main(String[] args) {

        int a1 = -5, a2 = 8, a3 = 6, A = a1 + a2 * a3;
        System.out.println("Result A: " + A);

        int b1 = 55, b2 = 9, b3 = 9, B = (b1 + b2) % b3;
        System.out.println("Result B: " + B);

        int n1 = 20, n2 = -3, n3 = 5, n4 = 8, N = n1 + n2 * n3 / n4;
        System.out.println("Result C: " + N);

        int m1 = 5, m2 = 15, m3 = 3, m4 = 2, m5 = -8, m6 = 3, M = m1 + m2 / m3 * m4 + m5 % m6;
        System.out.println("Result D: " + M);


    }


}

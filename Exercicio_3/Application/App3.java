package Exercicio_3.Application;

public class App3 {
    public static void main(String[] args) {
        System.out.println(funcc(3));
    }

    public static int funcc(int n) {
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return (2 * funcc(n - 1) + 3 * funcc(n - 2));
        }
    }
}

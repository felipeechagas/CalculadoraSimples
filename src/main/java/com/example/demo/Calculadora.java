package main.java.com.example.demo;

public class Calculadora {

    public static void soma(int n1, int n2){
        int res = n1 + n2;
        System.out.println("A soma é " + res);
    }

    public static void subtracao(int n1, int n2){
        int res = n1 - n2;
        System.out.println("A subtração é " + res);

    }

    public static void multiplicacao(int n1, int n2){
        int res = n1 * n2;
        System.out.println("A multiplicação é " + res);
    }

    public static void divisao(double n1, double n2){
        double res = n1 / n2;
        System.out.println("A divisão é " + res);
    }
}

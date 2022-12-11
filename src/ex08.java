import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            System.out.print("");

            System.out.print("O número " + n + " possui " + qtdDigitos(n) + " digito" );
        }


    }  

    public static int qtdDigitos (long n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        else return (int) (Math.log10 (n) + 1); 
    }
}
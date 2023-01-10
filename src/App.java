import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int value;
        Scanner info = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado");
        value = info.nextInt();
        
        System.out.println("TABELA DE MULTIPLICAÇÃO DE X");
        for (int i = 1; i <= 10; i++) {
            int mult = value * i;
            System.out.println(i + " x " + value + " = " + mult);
        }
    }
}

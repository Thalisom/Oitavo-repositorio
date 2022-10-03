import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora? ");
        double hora = scanner.nextDouble();
        System.out.println("quantas horas você trabalha por dia? ");
        double horaTrabalhada = scanner.nextDouble();
        System.out.println("Quantos dias no mês você trabalha? ");
        double diaTrabalhado = scanner.nextDouble();
        scanner.close();
        double dia = hora * horaTrabalhada;
        double soldo = dia * diaTrabalhado;

        System.out.print("O seu salario no final será: " + soldo);

    }
}
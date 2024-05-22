import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º parâmetro: ");
        int primeiroParametro = scan.nextInt();
        System.out.print("Digite o 2º parâmetro: ");
        int segundoParametro = scan.nextInt();
        System.out.println();

        try {
            contar(primeiroParametro, segundoParametro);
            scan.close();
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }        
    }
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = segundoParametro - primeiroParametro;
            for (int x = 1; x <= contagem; x++){
                System.out.println("Imprimindo o número " + x);
            }
        }   
    }
}
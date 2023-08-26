import java.util.InputMismatchException;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
       
        try {
            System.out.println("");
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            contar(parametroUm,parametroDois);
        } 
        catch (ParametrosInvalidosException exception) {
            System.out.println("");
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        catch(InputMismatchException exception){
            System.out.println("");
            System.out.println("Apenas números inteiros são aceitos nos parâmetros!");
        }

        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.println("");
        for(int valorAtual = 1; valorAtual <= contagem; valorAtual++){
            System.out.println("Imprimindo o número " + valorAtual);
        }
        System.out.println("");
    }
}

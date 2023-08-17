import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("");

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        scanner.nextLine();
        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu Saldo: ");
        double saldo = scanner.nextDouble();
         
        String mensagem = gerarMensagem(numero, agencia, nomeCliente, saldo);
        
        System.out.println("");
        System.out.println(mensagem);
        System.out.println("");

        scanner.close();
    }

    public static String gerarMensagem (int numero, String agencia, String nomeCliente,double saldo){
        String numeroString = Integer.toString(numero);
        String saldoString = Double.toString(saldo);
        return "Olá "
        .concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ") 
        .concat(agencia)
        .concat(", conta ")
        .concat(numeroString)
        .concat(" e seu saldo ")
        .concat(saldoString)
        .concat(" já está disponível para saque.");
    }
}

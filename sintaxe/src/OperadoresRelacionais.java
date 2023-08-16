public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Maria";
        String nomeDois = new String("Maria");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){ // true
            System.out.println("a nossa condiçao é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior do numeroDois? " + simNao);
    }   
}

public class OperadoresLogicos {
    public static void main(String[] args) {    
        boolean condicao1=true;

        boolean condicao2=true;
        
        if(condicao1 && (7 > 4)){
            System.out.println("as duas condiçoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condiçoes sao verdadeiras");
        }

        System.out.println("fim"); 
    }
}

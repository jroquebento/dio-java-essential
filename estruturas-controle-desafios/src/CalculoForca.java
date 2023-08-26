import java.util.Scanner;

public class CalculoForca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N = 0;

        for(int i = 0;i < C; i++){
            nome = leitor.next();
			N = leitor.nextInt();
           
            if(nome.equals("Thor")){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
        System.out.println(N);
        leitor.close();
    }
}

public class OperadorTernario {
    public static void main(String[] args) {
        int nota = 5;

        System.out.println();
	    String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
	    System.out.println(resultado);  

        int nota2 = 3;
        System.out.println();
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
    } 
}

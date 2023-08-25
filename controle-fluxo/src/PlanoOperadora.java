public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //B / T
		
        // A remoção do break faz os outros cases executarem
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}

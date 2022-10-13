package br.com.projeto;
import java.util.Scanner;


public class ponto {
	public static void main (String [] args) {
	
	int linha;
	String local1 ="Rua Rosa Maria n 1552" ;
	String local2 ="Rua do Cravo n 1777" ;
	String local3 ="Rua Lisboa n 9688" ;
	int opcao;
	
	Scanner ler = new Scanner(System.in);
	
	for(int i=0;i<3;i++) {
	System.out.println("3000     3010\n3021     3022\n3030     3031\n<1 - cancelar>");
	opcao=ler.nextInt();
	
	
	switch(opcao) {
	
	case 3000:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local1 + "\n");
	break;
	case 3010:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local2+ "\n");
	break;
	case 3021:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local1+ "\n");
	break;
	case 3022:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local2+ "\n");
	break;
	case 3030:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local3+ "\n");
	break;
	case 3031:
		System.out.println("***ATENCAO***\nPassageiros aguardam no ponto da " + local3+ "\n");
	break;
	
	 default:
		System.out.println("Até mais");
	}
	}
}
}

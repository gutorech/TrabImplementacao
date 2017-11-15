package criadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalestrasCriador {

	public static void criarPalestra() {
		System.out.println("==========");
		Scanner leitor;
		try {
			leitor = new Scanner(new File("C:/Users/Micro/Workspace/TrabImplementacao/arquivos/palestras.csv"));
			leitor.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
		
		while (leitor.hasNext()) {
			principal.Evento.pa = new classesBasicas.Palestras(leitor.next(), leitor.next(), leitor.next());
			System.out.println("Palestra:\nTitulo: "+principal.Evento.pa.getTitulo()+"  Resumo: "+principal.Evento.pa.getResumo()+"  Numero sala: "+principal.Evento.pa.getNumeroSala()+"\n");
		}
		
		leitor.close();
	}
	
}

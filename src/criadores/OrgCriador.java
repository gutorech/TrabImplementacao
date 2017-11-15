package criadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrgCriador {
	
	public static void criarOrganizador() {
		System.out.println("\n");
		Scanner leitor;
		try {
			leitor = new Scanner(new File("C:/Users/Micro/Workspace/TrabImplementacao/arquivos/organizadores.csv"));
			leitor.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
		
		while (leitor.hasNext()) {
			principal.Evento.orga = new classesBasicas.Organizadores(leitor.next(), leitor.next());
			System.out.println("Organizador:\nNome: "+principal.Evento.orga.getNome()+"  Email: "+principal.Evento.orga.getEmail());
		}
		
		leitor.close();
	}
}

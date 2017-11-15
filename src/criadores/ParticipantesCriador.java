package criadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParticipantesCriador {
	
	public static void criarParticipante() {
		System.out.println("=====");
		Scanner leitor;
		try {
			leitor = new Scanner(new File("C:/Users/Micro/Workspace/TrabImplementacao/arquivos/participantes.csv"));
			leitor.useDelimiter("[,\n]");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
		
		while (leitor.hasNext()) {
			principal.Evento.part = new classesBasicas.Participantes(leitor.next(), leitor.next());
			System.out.println("Participante:\nNome: "+principal.Evento.part.getNome()+"  Email: "+principal.Evento.part.getEmail()+"\n");
		}
		
		leitor.close();
	}
	
	
}

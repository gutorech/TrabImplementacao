package criadores;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	
	public class PalestrantesCriador {
	
		
		public static void criarPalestrante() {
			System.out.println("\n================");
			Scanner leitor;
			try {
				leitor = new Scanner(new File("C:/Users/Micro/Workspace/TrabImplementacao/arquivos/palestrantes.csv"));
				leitor.useDelimiter("[,\n]");
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado.");
				return;
			}
			
			while (leitor.hasNext()) {
				principal.Evento.pale = new classesBasicas.Palestrantes(leitor.next(), leitor.next());
				System.out.println("Palestrante:\nNome: "+principal.Evento.pale.getNome()+"  Email: "+principal.Evento.pale.getEmail()+"\n");
			}
			
			leitor.close();
		}
	}



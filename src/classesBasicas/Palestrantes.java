package classesBasicas;

public class Palestrantes {
		private String nome;
		private String email;
	
		public Palestrantes(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}
	
		public String getNome() {
			return nome;
		}
	
		public String getEmail() {
			return email;
		}
	
		@Override
		public String toString() {
			return "Palestrante - "+nome + "," + email;
		}
	}
package classesBasicas;

public class Organizadores {	
		private String nome;
		private String email;

		public Organizadores(String nome, String email) {
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
			return "Organizador - "+nome + "," + email;
		}
		
		
	}

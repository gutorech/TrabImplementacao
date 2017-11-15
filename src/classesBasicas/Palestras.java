package classesBasicas;

public class Palestras {
		private String titulo;
		private String resumo;
		private String numeroSala;
		
		public Palestras(String titulo, String resumo, String numeroSala) {
			this.titulo = titulo;
			this.resumo = resumo;
			this.numeroSala = numeroSala;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getResumo() {
			return resumo;
		}

		public void setResumo(String resumo) {
			this.resumo = resumo;
		}

		public String getNumeroSala() {
			return numeroSala;
		}

		public void setNumeroSala(String numeroSala) {
			this.numeroSala = numeroSala;
		}

		@Override
		public String toString() {
			return "Palestra - " +titulo + "," + resumo+ "," + numeroSala;
		}		
		

	}

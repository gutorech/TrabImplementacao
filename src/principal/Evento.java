package principal;

public class Evento {
	
	 public static classesBasicas.Organizadores orga;
	 public static classesBasicas.Participantes part;
	 public static classesBasicas.Palestrantes pale;
	 public static classesBasicas.Palestras pa;

	public static void main(String[] args) {
		
		criadores.OrgCriador.criarOrganizador();
		criadores.PalestrantesCriador.criarPalestrante();		
		criadores.PalestrasCriador.criarPalestra();
		criadores.ParticipantesCriador.criarParticipante();
	}

}

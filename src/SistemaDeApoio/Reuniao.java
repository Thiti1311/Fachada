package SistemaDeApoio;

public class Reuniao extends Meet{

	/*
	 * Reunião (Responsabilidades):
	 * mudar a data
	 * adicionar e retirar participantes
	 * 
	 * Classes adicionais:
	 * Horário
	 * 
	 * Participantes:
	 * Diretores
	 * Professores
	 * Alunos
	 */
	
	
	public Reuniao(int ano, int mes, int dia, int hora, int minuto) {
		setHorario(ano, mes, dia, hora, minuto);
	}
	
	@Override
	public String toString() {
		return "Reuniao\nParticipantes:" + getParticipantes() + "" + getHorario().toString();
	}
}

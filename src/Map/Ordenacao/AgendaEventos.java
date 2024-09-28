package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		//Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		
		Map<LocalDate, Evento> enventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento " + proximoEvento + "acontecera na data de " + proximaData);
				break;
			}
		}
	}
	
	public static void main (String [] args) {
		AgendaEventos eventos = new AgendaEventos();
		
		eventos.adicionarEvento(LocalDate.of(2024, 8, 26), "Aniversario", "Larissa");
		eventos.adicionarEvento(LocalDate.of(2024, 8, 7), "Aniversario", "Ketlin");
		eventos.adicionarEvento(LocalDate.of(2024, 10, 16), "Aniversario", "Namoro");
		
		eventos.exibirAgenda();
		eventos.obterProximoEvento();
	}
}

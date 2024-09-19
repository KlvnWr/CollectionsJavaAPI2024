package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTaraefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
	}
}

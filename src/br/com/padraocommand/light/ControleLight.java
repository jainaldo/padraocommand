package br.com.padraocommand.light;

import java.util.ArrayList;

import br.com.padraocommand.light.Command;

public class ControleLight {
	private ArrayList<Command> HistoricoComandos;
	private Integer nextUndo = 0;
	
	public ControleLight() {
		this.HistoricoComandos = new ArrayList<Command>();
	}
	
	public void exercutarComando(Command comando){
		comando.executar();
		HistoricoComandos.add(comando);
		nextUndo = HistoricoComandos.size() -1;
	}
	
	public void desfazerComando(Command comando){
		if (nextUndo < 0) return;
		Command command = HistoricoComandos.get(nextUndo);
		command.desfazer();

		nextUndo--;
	}
}

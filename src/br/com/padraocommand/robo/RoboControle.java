package br.com.padraocommand.robo;

import java.util.ArrayList;

public class RoboControle {
	private ArrayList<Command> HistoricoComandos;
	private Integer next_uno = 0;
	
	public RoboControle() {
		this.HistoricoComandos = new ArrayList<Command>();
		// TODO Auto-generated constructor stub
	}
	
	public void ExecutarComando(Command comando){
		comando.executar();
		HistoricoComandos.add(comando);
		next_uno++;
	}

}

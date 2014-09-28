package br.com.padraocommand.light;

public class Main {

	public static void main(String[] args) {
		Light luz = new Light();
		ControleLight controle = new ControleLight();
		
		LightOnCommand ligar = new LightOnCommand(luz);
		LightOffCommand desligar = new LightOffCommand(luz);
		
		System.out.println("EXERCUTANDO OS CAMANDOS");
		controle.exercutarComando(ligar);
		controle.exercutarComando(ligar);
		controle.exercutarComando(desligar);
		controle.exercutarComando(ligar);
		
		System.out.println("\n");
		
		System.out.println("DESFAZENDO OS CAMANDOS");
		controle.desfazerComando(ligar);
		controle.desfazerComando(desligar);
		controle.desfazerComando(ligar);
		controle.desfazerComando(ligar);
	}
}

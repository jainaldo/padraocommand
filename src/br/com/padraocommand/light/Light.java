package br.com.padraocommand.light;

public class Light {
	
	public final static int ON = 0;
	public final static int OFF = 1;
	
	private int estado=OFF;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void on(){
		this.estado = ON;
		System.out.println("A Luz está Ligada!");
	}
	
	public void off(){
		this.estado = OFF;
		System.out.println("A Luz está Desligada!");
	}

}

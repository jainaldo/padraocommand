package br.com.padraocommand.robo;

public class MoverCommand implements Command {
	private Integer paraFrente;
	private Robo robo;
	
	public MoverCommand(Robo robo) {
		this.robo = robo;
	}

	@Override
	public void executar() {
		robo.Mover(paraFrente);
	}

	@Override
	public void desfazer() {
		robo.Mover(-paraFrente);
	}

	public Integer getParaFrente() {
		return paraFrente;
	}

	public void setParaFrente(Integer paraFrente) {
		this.paraFrente = paraFrente;
	}
}

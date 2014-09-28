package br.com.padraocommand.light;

public class LightOffCommand implements Command {
	
	private Light light;

	

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void executar() {
		light.off();

	}

	@Override
	public void desfazer() {
		light.on();

	}

}

package br.com.padraocommand.light;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void executar() {
		light.on();
	}

	@Override
	public void desfazer() {
		light.off();
	}

}

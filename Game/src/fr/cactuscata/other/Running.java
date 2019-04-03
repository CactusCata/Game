package fr.cactuscata.other;

public class Running {

	private boolean running;

	public Running() {
		this(false);
	}

	public Running(boolean run) {
		this.running = run;
	}

	public boolean isRunning() {
		return this.running;
	}

	public void setRunning(boolean run) {
		this.running = run;
	}

}

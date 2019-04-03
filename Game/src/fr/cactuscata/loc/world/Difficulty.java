package fr.cactuscata.loc.world;

public enum Difficulty {

	EASY("Facile", 1),
	NORMAL("Normal", 2),
	HARD("Difficile", 3),
	IMPOSSIBLE("Impossible", 4);

	private final String difficultName;
	private final int difficultValue;

	private Difficulty(final String difficultName, final int difficultValue) {
		this.difficultName = difficultName;
		this.difficultValue = difficultValue;
	}

	public final String getDifficultName() {
		return this.difficultName;
	}

	public final int getDifficultValue() {
		return this.difficultValue;
	}

}

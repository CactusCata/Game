package fr.cactuscata.loc.world;

public enum WorldType {

	NORMAL_WORLD("Monde normal");

	private final String worldDefaultName;

	private WorldType(final String worldDefaultName) {
		this.worldDefaultName = worldDefaultName;
	}

	public final String getDefaultWorldName() {
		return this.worldDefaultName;
	}

}

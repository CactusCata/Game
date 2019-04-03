package fr.cactuscata.loc.world.block.list;

public enum BlockType {

	AIR("Air", 0), STONE("Pierre", 10), DIRT("Terre", 2), GRAVEL("Gravier", 5);

	private final String defaultName;
	private final int defaultResistance;

	private BlockType(final String defaultName, final int resistance) {
		this.defaultName = defaultName;
		this.defaultResistance = resistance;
	}

	public String getDefaultName() {
		return this.defaultName;
	}

	public int getDefaultResistance() {
		return this.defaultResistance;
	}

}

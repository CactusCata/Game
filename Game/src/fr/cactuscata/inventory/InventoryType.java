package fr.cactuscata.inventory;

public enum InventoryType {

	PLAYER("Inventaire de joueur", 54), CHEST("Inventaire de coffre", 81), ENTITY_DEFAULT("Entity Inventory",
			Integer.MAX_VALUE);

	private final String defaultName;
	private final int defaultSize;

	private InventoryType(final String defaultName, final int defaultSize) {
		this.defaultName = defaultName;
		this.defaultSize = defaultSize;
	}

	public final String getDefaultName() {
		return this.defaultName;
	}

	public final int getDefaultSize() {
		return this.defaultSize;
	}

}

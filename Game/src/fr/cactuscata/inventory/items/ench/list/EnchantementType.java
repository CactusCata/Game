package fr.cactuscata.inventory.items.ench.list;

public enum EnchantementType {

	DAMAGE("Dégats"), RESISTANCE("Résisatance"), HEALH_BOOST("Bonus de vie");

	private final String defaultName;

	private EnchantementType(final String defaultName) {
		this.defaultName = defaultName;
	}

	public String getDefaultName() {
		return this.defaultName;
	}

}

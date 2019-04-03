package fr.cactuscata.entity.type;

public enum EntityType {

	PLAYER("Joueur", 0), ZOMBIE("Zombie", 1), SKELETTE("Skelette", 2);

	private final String defaultName;
	private final int ID;

	private EntityType(final String defaultName, final int ID) {
		this.defaultName = defaultName;
		this.ID = ID;
	}

	public final String getDefaultName() {
		return this.defaultName;
	}

	public final int getID() {
		return this.ID;
	}

	public static final EntityType getEntityByID(int ID) {
		for (EntityType entityType : values())
			if (entityType.getID() == ID)
				return entityType;
		return EntityType.ZOMBIE;
	}

}

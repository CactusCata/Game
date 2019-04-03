package fr.cactuscata.entity;

import fr.cactuscata.entity.type.EntityType;
import fr.cactuscata.inventory.Inventory;
import fr.cactuscata.loc.Location;

public interface Entity {

	public String getName();

	public int getAttack();

	public int getDefense();

	public int getHealth();

	public int getMaxHealth();

	public boolean isDead();
	
	public void setDeath();

	public void attack(Entity entity);

	public Inventory getInventory();

	public void dropItem(Entity entity);

	public EntityType getEntityType();
	
	public Location getLocation();
	
	public void setLocation(Location location);
	
	public static Entity getRandomEntity() {
		//Random rdm = new Random();
		//int i = rdm.nextInt(EntityType.values().length + 1);
		return null;
	}

}

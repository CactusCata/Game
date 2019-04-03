package fr.cactuscata.entity.list;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.entity.SubEntity;
import fr.cactuscata.entity.stats.StatsEntity;
import fr.cactuscata.entity.type.EntityType;
import fr.cactuscata.inventory.EntityInventory;
import fr.cactuscata.inventory.Inventory;
import fr.cactuscata.loc.Location;
import fr.cactuscata.other.Say;

public class Zombie implements SubEntity {

	private String ZombieName;
	private StatsEntity stats;
	private EntityType entityType;
	private Inventory inventory;
	private Location location;

	{
		entityType = EntityType.ZOMBIE;
		this.inventory = new EntityInventory(this);
	}

	public Zombie(String playerName, Location location, int attack, int defense, int health, int maxHealth) {
		this.ZombieName = playerName;
		this.stats = new StatsEntity(attack, defense, health, maxHealth);
		this.inventory = new EntityInventory(this);
		this.location = location;
	}

	public Zombie(Location location, int attack, int defense, int health, int maxHealth) {
		this(EntityType.ZOMBIE.getDefaultName(), location, attack, defense, health, maxHealth);
	}

	public Zombie() {
		this.ZombieName = entityType.getDefaultName();
		this.inventory = new EntityInventory(this);
		setRandomStats();
	}

	public Zombie(String entityName, Location location) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return this.ZombieName;
	}

	@Override
	public int getAttack() {
		return stats.getAttack();
	}

	@Override
	public int getDefense() {
		return stats.getDefense();
	}

	@Override
	public int getHealth() {
		return stats.getHealth();
	}

	@Override
	public int getMaxHealth() {
		return this.stats.getMaxHealth();
	}

	@Override
	public void attack(Entity entity) {
		int damageSet = this.stats.getDefense() - entity.getAttack();
		if (damageSet > 0)
			this.stats.setHealth(this.getHealth() - damageSet);
		else
			Say.sendBoxMessage("Vous n'avez reçu aucun dégats du monstre " + entity.getName() + " !");

		if (this.stats.getHealth() <= 0) {
			Say.sendBoxMessage("Vous avez été tué par " + entity.getName() + " !");
			this.stats.setDead();
		}

	}

	@Override
	public Inventory getInventory() {
		return this.inventory;
	}

	@Override
	public void dropItem(Entity entity) {
		entity.getInventory().setItems(this.getInventory().getItems());
	}

	@Override
	public EntityType getEntityType() {
		return this.entityType;
	}

	@Override
	public void setRandomStats() {
		this.stats = new StatsEntity(2, 5, 1, 3, 20, 30);
	}

	@Override
	public boolean isDead() {
		return this.stats.isDead();
	}

	@Override
	public Location getLocation() {
		return this.location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;

	}

	@Override
	public void setDeath() {
		this.stats.setDead();

	}
}
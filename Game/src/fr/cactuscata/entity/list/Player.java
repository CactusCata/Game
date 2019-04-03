package fr.cactuscata.entity.list;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.entity.SubSubEntity;
import fr.cactuscata.entity.stats.StatsEntity;
import fr.cactuscata.entity.type.EntityType;
import fr.cactuscata.game.Score;
import fr.cactuscata.inventory.Inventory;
import fr.cactuscata.inventory.PlayerInventory;
import fr.cactuscata.loc.Location;
import fr.cactuscata.loc.world.list.NormalWorld;
import fr.cactuscata.other.Say;

public class Player implements SubSubEntity {

	private String playerName;
	private StatsEntity stats;
	private EntityType entityType;
	private Inventory inventory;
	private Score score;
	private Location location;
	
	{
		this.entityType = EntityType.PLAYER;
		this.score = new Score();
		this.inventory = new PlayerInventory(this);
	}

	public Player(String playerName, Location location, int attack, int defense, int health, int maxHealth) {
		this.playerName = playerName;
		this.stats = new StatsEntity(attack, defense, health, maxHealth);
		this.location = location;
	}

	public Player(String playerName) {
		this.playerName = playerName;
		setRandomStats();
		this.location = new Location(new NormalWorld(), 0, 0, 0);
	}

	public Player(String playerName, Location location) {
		this.playerName = playerName;
		this.location = location;
		setRandomStats();
	}

	@Override
	public String getName() {
		return this.playerName;
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
	public Score getScore() {
		return this.score;
	}

	@Override
	public void setScore(Score score) {
		this.score = score;

	}

	@Override
	public void setDeath() {
		this.stats.setDead();

	}

}

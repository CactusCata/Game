package fr.cactuscata.entity.stats;

public class StatsEntity {

	private int attack, defense, health, maxHealth;
	private boolean isDead;

	public StatsEntity(int attack, int defense, int health, int maxHealth) {
		this.setAttack(attack);
		this.setDefense(defense);
		this.setMaxHealth(maxHealth);
		this.setHealth(health);
		this.isDead = false;
	}

	public StatsEntity(int attack, int defense, int maxHealth) {
		this(attack, defense, maxHealth, maxHealth);
	}

	public StatsEntity(int attackMin, int attackMax, int defenseMin, int defenseMax, int maxHealthMin,
			int maxHealthMax) {
		this((attackMin + (int) (Math.random() * attackMax)), (defenseMin + (int) (Math.random() * defenseMax)),
				(maxHealthMin + (int) (Math.random() * maxHealthMax)));
	}

	public StatsEntity(int attackMin, int attackMax, int defenseMin, int defenseMax, int healthMin, int healhMax,
			int maxHealthMin, int maxHealthMax) {
		this((attackMin + (int) (Math.random() * attackMax)), (defenseMin + (int) (Math.random() * defenseMax)),
				(healthMin + (int) (Math.random() * healhMax)), (maxHealthMin + (int) (Math.random() * maxHealthMax)));
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead() {
		this.isDead = true;
	}

}

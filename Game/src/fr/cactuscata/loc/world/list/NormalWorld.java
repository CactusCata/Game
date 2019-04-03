package fr.cactuscata.loc.world.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.loc.Location;
import fr.cactuscata.loc.world.Block;
import fr.cactuscata.loc.world.Difficulty;
import fr.cactuscata.loc.world.World;
import fr.cactuscata.loc.world.WorldType;
import fr.cactuscata.loc.world.block.list.Air;

public class NormalWorld implements World {

	private List<Entity> onlineEntity;
	private String worldName;
	private WorldType worldType;
	private Block[][][] block;
	private Difficulty difficulty;

	{
		this.worldType = WorldType.NORMAL_WORLD;
	}

	public NormalWorld(String worldName, List<Entity> entity) {
		this.worldName = worldName;
		this.onlineEntity = entity;
		this.block = new Block[256][256][256];
	}

	public NormalWorld(String worldName) {
		this(worldName, new ArrayList<>());
	}

	public NormalWorld(List<Entity> entity) {
		this(WorldType.NORMAL_WORLD.getDefaultWorldName(), entity);
	}

	public NormalWorld() {
		this(WorldType.NORMAL_WORLD.getDefaultWorldName());
	}

	@Override
	public List<Entity> getOnlineEntity() {
		return this.onlineEntity;
	}

	@Override
	public void addEntity(Entity entity) {
		this.onlineEntity.add(entity);
	}

	@Override
	public String getWorldName() {
		return this.worldName;
	}

	@Override
	public void removeEntity(Entity entity) {
		this.onlineEntity.remove(entity);

	}

	@Override
	public WorldType getWorldType() {
		return this.worldType;
	}

	@Override
	public void removeBlock(Location location) {
		this.block[location.getX()][location.getY()][location.getZ()] = new Air(location);

	}

	@Override
	public void addsetBlock(Block block) {
		this.block[block.getLocation().getX()][block.getLocation().getY()][block.getLocation().getZ()] = block;

	}

	@Override
	public Difficulty getDifficulty() {
		return this.difficulty;
	}

	@Override
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;

	}

	@Override
	public void setRandomDifficulty() {
		this.difficulty = Difficulty.values()[new Random().nextInt(Difficulty.values().length)];
	}

}

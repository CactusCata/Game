package fr.cactuscata.loc.world;

import java.util.List;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.loc.Location;

public interface World {

	public List<Entity> getOnlineEntity();

	public void addEntity(Entity entity);

	public void removeEntity(Entity entity);

	public String getWorldName();

	public WorldType getWorldType();

	public void removeBlock(Location location);

	public void addsetBlock(Block block);

	public Difficulty getDifficulty();

	public void setDifficulty(Difficulty difficulty);

	public void setRandomDifficulty();

}

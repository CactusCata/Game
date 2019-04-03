package fr.cactuscata;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.entity.list.Player;
import fr.cactuscata.loc.world.World;
import fr.cactuscata.other.Running;

public class Game {

	private Running runnig;
	private List<Player> onlinePlayers;
	private List<Entity> entityKilledInformation;
	private List<World> worldsRegistered;

	{
		this.onlinePlayers = new ArrayList<>();
		this.entityKilledInformation = new ArrayList<>();
		this.worldsRegistered = new ArrayList<>();
		this.runnig = new Running(true);
	}

	public Game() {

	}

	public boolean isRunning() {
		return this.runnig.isRunning();
	}

	public void removeRunning() {
		this.runnig.setRunning(false);
	}

	public List<Player> getOnlinePlayers() {
		return this.onlinePlayers;
	}

	public void addPlayer(Player player) {
		this.onlinePlayers.add(player);
	}

	public List<Entity> getEntityKilled() {
		return this.entityKilledInformation;
	}

	public void addEntityKilled(Entity entity) {
		this.entityKilledInformation.add(entity);
	}

	public List<World> getWorlds() {
		return this.worldsRegistered;
	}

	public void addWorld(World world) {
		this.worldsRegistered.add(world);
	}

}

package fr.cactuscata.loc;

import fr.cactuscata.loc.world.World;
import fr.cactuscata.loc.world.list.NormalWorld;

public class Location {

	private World world;
	private int x, y, z;

	public Location(World world, int x, int y, int z) {
		this.setWorld(world);
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	public Location(int x, int y, int z) {
		this(new NormalWorld(), x, y, z);
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

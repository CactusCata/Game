package fr.cactuscata.loc.world;

import fr.cactuscata.loc.Location;
import fr.cactuscata.loc.world.block.list.BlockType;

public interface Block {

	public String getBlockName();

	public int getResistance();

	public Location getLocation();

	public void removeBlock(Location location);

	public void addBlock(Location location);

	public BlockType getBlockType();

}

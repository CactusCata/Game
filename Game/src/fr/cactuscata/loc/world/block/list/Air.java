package fr.cactuscata.loc.world.block.list;

import fr.cactuscata.loc.Location;
import fr.cactuscata.loc.world.Block;

public class Air implements Block {

	private String blockName;
	private int resistance;
	private BlockType blockType;
	private Location location;

	{
		this.blockType = BlockType.AIR;
	}

	public Air(String blockName, Location location, int resistance) {
		this.blockName = blockName;
		this.location = location;
		this.resistance = resistance;
	}

	public Air(Location location) {
		this(BlockType.AIR.getDefaultName(), location, BlockType.AIR.getDefaultResistance());
	}

	@Override
	public String getBlockName() {
		return this.blockName;
	}

	@Override
	public int getResistance() {
		return this.resistance;
	}

	@Override
	public Location getLocation() {
		return this.location;
	}

	@Override
	public void removeBlock(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBlock(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public BlockType getBlockType() {
		return this.blockType;
	}

}

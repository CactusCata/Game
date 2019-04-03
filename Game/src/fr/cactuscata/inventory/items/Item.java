package fr.cactuscata.inventory.items;

import fr.cactuscata.inventory.items.ench.Enchantement;
import fr.cactuscata.inventory.items.lore.Lore;

public interface Item {

	public String getDisplayName();

	public void setDisplayName(String name);

	public int getAmount();

	public void setAmount(int amount);

	public int getMaxStack();

	public byte getDurability();

	public byte getMaxDurability();

	public void setDurability(byte durability);

	public Enchantement[] getEnchentements();

	public void setEnchantement(Enchantement ench);

	public void setEnchantements(Enchantement[] ench);

	public Lore getLore();

	public void getLore(Lore lore);
	
	public boolean equals(Item item);

}

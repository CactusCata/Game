package fr.cactuscata.inventory;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.inventory.items.Item;

public interface Inventory {

	public String getTitle();

	public void setTitle(String title);

	public int getSize();

	public void setSize(int size);

	public void setItem(Item item);

	public void setItem(Item item, int slot);

	public void setItems(Item[] item);

	public void setItems(Item[] item, int[] slots);
	
	public Item[] getItems();

	public boolean containsItem(Item item);

	public void removeItem(Item item);

	public void removeItem(Item item, int slot);

	public Entity getOwner();

	public InventoryType getInventoryType();
	
	public int getSlot(Item item);

}

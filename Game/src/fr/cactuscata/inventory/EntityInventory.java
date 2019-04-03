package fr.cactuscata.inventory;

import fr.cactuscata.entity.Entity;
import fr.cactuscata.inventory.items.Item;

public class EntityInventory implements Inventory {

	private String title;
	private int size;
	private Item[] items;
	private Entity owner;
	private InventoryType inventoryType;

	{
		this.inventoryType = InventoryType.ENTITY_DEFAULT;
	}

	public EntityInventory(String title, Entity owner, int size, Item[] items) {
		this.title = title;
		this.owner = owner;
		this.size = size;
		this.items = new Item[size];
		if (items != null)
			setItems(items);
	}

	public EntityInventory(String title, Entity owner, int size) {
		this(title, owner, size, null);
	}

	public EntityInventory(String title, Entity owner, Item[] items) {
		this(title, owner, InventoryType.ENTITY_DEFAULT.getDefaultSize(), items);
	}

	public EntityInventory(Entity owner) {
		this(InventoryType.ENTITY_DEFAULT.getDefaultName(), owner, InventoryType.ENTITY_DEFAULT.getDefaultSize());
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;

	}

	@Override
	public void setItem(Item item) {
		for (int i = 0; i < this.size; i++)
			if (this.items[i] == null)
				setItem(item, i);

	}

	@Override
	public void setItem(Item item, int slot) {
		this.items[slot] = item;

	}

	@Override
	public void setItems(Item[] items) {
		for (Item item : items)
			setItem(item);
	}

	@Override
	public void setItems(Item[] items, int[] slots) {
		for (int i : slots)
			setItem(items[slots[i]], slots[i]);
	}

	@Override
	public Item[] getItems() {
		return this.items;
	}

	@Override
	public boolean containsItem(Item item) {
		for (Item items : this.items)
			if (item.equals(items))
				return true;
		return false;
	}

	@Override
	public int getSlot(Item item) {
		if (containsItem(item))
			for (int i = 0; i < this.size; i++)
				if (this.items[i].equals(item))
					return i;
		return 0;
	}

	@Override
	public void removeItem(Item item) {
		if (containsItem(item))
			removeItem(item, getSlot(item));
	}

	@Override
	public void removeItem(Item item, int slot) {
		this.items[slot] = null;
	}

	@Override
	public Entity getOwner() {
		return this.owner;
	}

	@Override
	public InventoryType getInventoryType() {
		return this.inventoryType;
	}

}

package fr.cactuscata.inventory.items.lore;

public class Lore {

	private String[] lore;

	public Lore(String[] lore) {
		if (lore == null)
			this.lore = new String[0];
	}

	public Lore() {
		this(null);
	}

	public String[] getLore() {
		return this.lore;
	}

	public void setLore(String[] lore) {
		this.lore = lore;
	}

	public void addLine(String line) {
		String[] newLore = new String[this.lore.length + 1];
		for (int i = 0, j = this.lore.length; i < j; i++)
			newLore[i] = this.lore[i];
		newLore[this.lore.length + 1] = line;
		this.lore = newLore;
	}

	public void removeLine(int line) {
		int sup = 0;
		String[] newLore = new String[this.lore.length - 1];
		for (int i = 0, j = this.lore.length; i < j; i++) {

			if (line == i)
				sup = 1;

			newLore[i] = this.lore[i + sup];

		}

		this.lore = newLore;

	}

}

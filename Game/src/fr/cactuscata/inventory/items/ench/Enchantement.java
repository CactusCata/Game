package fr.cactuscata.inventory.items.ench;

import fr.cactuscata.entity.stats.StatsEntity;
import fr.cactuscata.inventory.items.ench.list.EnchantementType;

public interface Enchantement {

	public EnchantementType getEnchantement();

	public int getLevel();

	public void setLevel(int level);

	public void updatesStats(StatsEntity stats);

}

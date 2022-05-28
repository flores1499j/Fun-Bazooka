
package net.mcreator.bazooka.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bazooka.item.BazookaItem;
import net.mcreator.bazooka.BazookaModElements;

@BazookaModElements.ModElement.Tag
public class FunBazookaItemGroup extends BazookaModElements.ModElement {
	public FunBazookaItemGroup(BazookaModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfun_bazooka") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BazookaItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

package mods.tinker.tconstruct.tools;

import mods.tinker.tconstruct.TContent;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Pickaxe extends HarvestTool
{
	public Pickaxe(int itemID, String tex)
	{
		super(itemID, 1, tex);
		this.setUnlocalizedName("InfiTool.Pickaxe");
	}
	
	@Override
	public int getHeadType ()
	{
		return 1;
	}
	
	@Override
	protected String getHarvestType()
	{
		return "pickaxe";
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}

	static Material[] materials = new Material[] { Material.rock, Material.iron, Material.ice, Material.glass, Material.piston, Material.anvil };

	@Override
	protected Item getHeadItem ()
	{
		return  TContent.pickaxeHead;
	}

	@Override
	protected Item getAccessoryItem ()
	{
		return  TContent.binding;
	}
	
	@Override
	public String getIconSuffix (int partType)
	{
		switch (partType)
		{
		case 0:
			return "_pickaxe_head";
		case 1:
			return "_pickaxe_head_broken";
		case 2:
			return "_pickaxe_handle";
		case 3:
			return "_pickaxe_accessory";
		default:
			return "";
		}
	}

	@Override
	public String getEffectSuffix ()
	{
		return "_pickaxe_effect";
	}

	@Override
	public String getDefaultFolder ()
	{
		return "pickaxe";
	}
}
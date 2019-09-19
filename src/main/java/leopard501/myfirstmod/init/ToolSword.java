package leopard501.myfirstmod.init;

import leopard501.myfirstmod.MyFirstMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolSword extends ItemSword implements IBaseModel {

    public ToolSword(String name, ToolMaterial material) {

        super(material);

        setRegistryName(name);
        setUnlocalizedName(MyFirstMod.MODID + "." + name);
        setCreativeTab(MyFirstMod.tabMyFirstTab);
    }

    @Override
    public void registerModels(){

        MyFirstMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {

        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}

package items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	
	public static Item Uranium;
	
	 public static void init(){
		 Uranium = new ItemUranium("uranium", CreativeTabs.MATERIALS);

		  
	 }
	 
	 public static void register(){
		 GameRegistry.register(Uranium);
	  
	 }
	 
	 public static void registerRenders(){
		 registerRender(Uranium);
	  
	 }
	 
	 public static void registerRender(Item item){
		 
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	  
	 }

}

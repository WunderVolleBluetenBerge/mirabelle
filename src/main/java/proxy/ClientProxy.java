package proxy;


import blocks.BlockHandler;
import items.ItemHandler;

public class ClientProxy extends ServerProxy {
	public void init() {
		  ItemHandler.registerRenders();
		  BlockHandler.registerRenders();

		 }

}

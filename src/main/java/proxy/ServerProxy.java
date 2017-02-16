package proxy;


import blocks.BlockHandler;
import items.ItemHandler;

public class ServerProxy implements IProxy {

	@Override
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();
		
		BlockHandler.init();
		BlockHandler.register();


	}

	@Override
	public void init() {	
	}

	@Override
	public void postInit() {	
	}

}

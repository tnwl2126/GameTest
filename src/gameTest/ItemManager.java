package gameTest;

import java.util.HashMap;

public class ItemManager {

	public static long item_GUID = 1000000000L;
	// public static long skill_GUID = 2000000000L;
	
	HashMap itemMap = new HashMap<>();
	
	public ItemManager() {	
		itemMap.put(ItemDef.MAGIC_STICK, "blue stick");
		itemMap.put(ItemDef.FANCER_SWORD, "yellow sword");
		itemMap.put(ItemDef.ARCHER_BOW, "red bow");
	}
	
	public Item creatItem(int code, int count) {
		Object ob = new Object();
		
		if(itemMap.get(code) == null) return null;		
		else return Item.creatItem((String)itemMap.get(code), count,getGuid());
	}
	
	public long getGuid() {		
		item_GUID++;
		return item_GUID; 
	}
	
}

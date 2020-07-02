package gameTest;

import java.util.HashMap;

public class ItemManager {

	public static long item_GUID = 1000000000L;
	// public static long skill_GUID = 2000000000L;
	
	private HashMap<Integer, String> itemMap = new HashMap<>();
	
	public ItemManager() {	
		itemMap.put(ItemDef.MAGIC_STICK, "magic stick");
		itemMap.put(ItemDef.FANCER_SWORD, "fancer sword");
		itemMap.put(ItemDef.ARCHER_BOW, "archer bow");
		
		itemMap.put(ItemDef.RED_GLOVES, "red gloves");
		itemMap.put(ItemDef.BULE_GLOVES, "blue gloves");
		
		itemMap.put(ItemDef.BLACK_PANTS, "black pants");
		itemMap.put(ItemDef.WHITE_PANTS, "white pants");
		
		itemMap.put(ItemDef.GREEN_TOP, "green top");
		itemMap.put(ItemDef.YELLOW_TOP, "yellow top");
		
		itemMap.put(ItemDef.SHORT_HAIR, "short hair");
		itemMap.put(ItemDef.LONG_HAIR, "long hair");
		
		itemMap.put(ItemDef.PET, "pet");
	}
	
	public Item creatItem(int code, int buidUpCount) {
		
		Object itemObject = itemMap.get(code);
		
		if(itemObject == null) return null;		
		else return Item.creatItem((String)itemObject, buidUpCount,getGuid());
	}
	
	public long getGuid() {		
		item_GUID++;
		return item_GUID; 
	}
	
}

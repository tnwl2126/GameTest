package gameTest;

public class Item {
	
	private String mName;
	//private String mType; //장비타입(무기인지 옷인지 등등)
	private int mBuildUpCount; //강화할 수 있는 횟수
	private long mGUID;
	
	public Item(String name, int buildUpCount, long guid) {
		mName = name;
		//mType = type;
		mBuildUpCount = buildUpCount;
		mGUID = guid;
	}
	
	public static Item creatItem(String name, int buildUpCount, long guid) {
		
		return new Item(name, buildUpCount,guid);
	}

	
}

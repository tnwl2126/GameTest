package gameTest;

public class Item {
	
	private String mName;
	private int mBuildUpCount; //��ȭ�� �� �ִ� Ƚ��
	private long mGUID;
	
	public Item(String name, int buildUpCount, long guid) {
		mName = name;
		mBuildUpCount = buildUpCount;
		mGUID = guid;
	}
	
	public static Item creatItem(String name, int buildUpCount, long guid) {
		
		return new Item(name, buildUpCount,guid);
	}

	
}

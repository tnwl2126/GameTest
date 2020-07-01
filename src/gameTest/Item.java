package gameTest;

public class Item {
	private String mName;
	private String mType; //장비타입(무기인지 옷인지 등등)
	private int mBuildUpCount; //강화할 수 있는 횟수
	
	public Item(String name, String type, int buildUpCount) {
		mName = name;
		mType = type;
		mBuildUpCount = buildUpCount;
	}
	
	
}

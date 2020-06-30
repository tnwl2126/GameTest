package gameTest;

public class Skill {
	private String mName;
	private String mSkillType;//스킬종류
	private int mHp;
	private int mNp;
	
	public Skill(String name, String type, int hp, int np) {
		mName = name;
		mSkillType = type;
		mHp = hp;
		mNp = np;
	}
}
